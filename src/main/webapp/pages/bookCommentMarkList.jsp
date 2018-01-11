<!DOCTYPE HTML>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
    <script src="http://cdn.bootcss.com/vue-resource/1.3.4/vue-resource.js"></script>
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<div id = "bookmark_list">
    <div style="padding-left: 10px;">
        <el-row  :gutter="20" justify="center">
            <el-form :model="form" >

                <%--<el-col :span="6" >--%>
                <%--<el-form-item :span="6" label="交易流水号" label-width="120px" style="width:120%">--%>
                <%--<el-input v-model="form.tradeNo" auto-complete="off"></el-input>--%>
                <%--</el-form-item>--%>
                <%--</el-col>--%>
                <el-col :span="10">
                    <el-form-item  label="书名" label-width="120px" style="width:60%">
                        <el-input v-model="form.bookName" auto-complete="off"></el-input>
                    </el-form-item>
                </el-col>
                <%--<el-col :span="6">--%>
                <%--<el-form-item  :span="6" label="资金分类" label-width="120px" style="width:120%">--%>
                <%--<el-input v-model="form.fundsType" auto-complete="off"></el-input>--%>
                <%--</el-form-item>--%>

                <%--</el-col>--%>

            </el-form>

            <el-col :span="6">
                <el-button type="primary" @click="queryBookMark">搜 索</el-button>
                <el-button type="primary" @click="javasc">返 回</el-button>
            </el-col>
        </el-row>
        <div style="margin-top:30px;width: auto;padding-left: 20px" >
            <el-table
                    ref="testTable"
                    :data="tableData"
                    style="width:80%"
                    border >
                <el-table-column
                        prop="id"
                        label="序号"
                        sortable
                        show-overflow-tooltip>
                </el-table-column>
                <el-table-column
                        prop="bookName"
                        label="书名"
                        sortable
                        show-overflow-tooltip>
                </el-table-column>

                <el-table-column
                        prop="bookAuthor"
                        label="作者"
                        sortable>
                </el-table-column>

                <el-table-column
                        prop="bookMark"
                        label="书签"
                        sortable>
                </el-table-column>

                <el-table-column
                        prop="createTime"
                        label="创建时间"
                        sortable>
                </el-table-column>

                <el-table-column
                        prop="createUserId"
                        label="创建用户"
                        sortable>
                </el-table-column>

                <el-table-column
                        prop="remark"
                        label="备注"
                        sortable>
                </el-table-column>



                <el-table-column label="操作" width="300">
                    <template scope="scope">
                        <el-button
                                size="small"
                                type="warning"
                                @click="handleResume(scope.$index, scope.row)">查看明细</el-button>

                        <%--<el-button--%>
                        <%--size="small"--%>
                        <%--type="info"--%>
                        <%--@click="handleResume(scope.$index, scope.row)">恢复</el-button>--%>

                        <el-button
                        size="small"
                        type="danger"
                        @click="handleDelete(scope.$index, scope.row)">删除</el-button>

                        <%--<el-button--%>
                        <%--size="small"--%>
                        <%--type="success"--%>
                        <%--@click="handleUpdate(scope.$index, scope.row)">修改</el-button>--%>
                    </template>
                </el-table-column>
            </el-table>
        </div>


    </div>
    <div align="center">
        <el-pagination
                @size-change="handleSizeChange"
                @current-change="handleCurrentChange"
                :current-page="currentPage"
                :page-sizes="[10, 20, 30, 40]"
                :page-size="pagesize"
                layout="total, sizes, prev, pager, next, jumper"
                :total="totalCount">
        </el-pagination>
    </div>
</div>
<script >
    var vueQ = new Vue({
        el:"#bookmark_list",
        data:{
            tableData:[],
            //默认每页数据量
            pagesize: 10,

            //当前页码
            currentPage: 1,

            //查询的页码
            start: 1,

            //默认数据总数
            totalCount: 10,

            form:{
                bookMark:'',
                bookAuthor:'',
            }
        },
         methods:{
             //从服务器读取数据
             loadData: function(pageNum, pageSize){
                 this.$http.get('book/queryBookComment?' + 'pageNum=' +  pageNum + '&pageSize=' + pageSize+'&bookName='+this.form.bookName).then(function(res){
                     console.log(res)
                     this.tableData = res.body.list;
                     this.totalCount = res.body.number;
                 },function(){
                     console.log('failed');
                 });
             },
             queryBookMark:function(){
              this.$http.get("book/queryBookComment?book").then(function (res) {
                  this.tableData = res.body.list;
                  this.totalCount = res.body.number;
              })
            },

             //单行删除
             handleDelete: function(index, row) {
                 this.$http.post('book/deleteBookMark',{"bookName":row.bookName,"id":row.id},{emulateJSON: true}).then(function(res){
                     this.loadData( this.currentPage, this.pagesize);
                 },function(){
                     console.log('failed');
                 });
             },
             //每页显示数据量变更
             handleSizeChange: function(val) {
                 this.pagesize = val;
                 this.loadData(this.currentPage, this.pagesize);
             },

             //页码变更
             handleCurrentChange: function(val) {
                 this.currentPage = val;
                 this.loadData(this.currentPage, this.pagesize);
             },
         },

    });
    vueQ.loadData(vueQ.currentPage, vueQ.pagesize);
</script>
</body>

</html>