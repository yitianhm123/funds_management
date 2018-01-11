<!DHTML>
<html>
<head>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
    <script src="http://cdn.bootcss.com/vue-resource/1.3.4/vue-resource.js"></script>
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>

</head>
<body>
<div id="capital-trade">
    <el-form :modal="form">
         <el-row type="flex" :gutter="20" justify="center">
             <el-col :span="3">
               <el-form-item  label="交易流水号" label-width="120px" style="width:60%">
                   <el-input v-model="form.fundTradeNo" auto-complete="off"></el-input>
             </el-form-item>
            </el-col>
        <el-col :span="3">
            <el-form-item  label="日期" label-width="120px" style="width:60%">
                <el-input v-model="form.creteTime" auto-complete="off"></el-input>
            </el-form-item>
        </el-col>

        <el-col>
            <el-form-item  label="操作类型" label-width="120px" style="width:60%">
                <el-input v-model="form.operateType" auto-complete="off"></el-input>
            </el-form-item>
        </el-col>
             <el-col>
                 <el-form-item  label="订单编号" label-width="120px" style="width:60%">
                     <el-input v-model="form.orderNo" auto-complete="off"></el-input>
                 </el-form-item>
             </el-col>
             <el-col>
                 <el-form-item  label="其他单据" label-width="120px" style="width:60%">
                     <el-input v-model="form.otherBill" auto-complete="off"></el-input>
                 </el-form-item>
             </el-col>
        </el-row>
        <el-row type="flex" :gutter="20" justify="center">
            <el-col>
                <el-form-item  label="资金出入操作" label-width="120px" style="width:60%">
                    <el-input v-model="form.fundsTradeType" auto-complete="off"></el-input>
                </el-form-item>
            </el-col>
            <el-col>
                <el-form-item  label="资金分类" label-width="120px" style="width:60%">
                    <el-input v-model="form.fundsType" auto-complete="off"></el-input>
                </el-form-item>
            </el-col>

            <el-col>
                <el-button  type="primary" label-width="120px" style="width:60%" @click="search">搜 索</el-button>
            </el-col>

        </el-row>
</el-form >

    <div>
        <el-table
                :data="tableData"
                style="width:80%"
                border
        >
            <el-table-column
                    prop="id"
                    label="序号"
                    sortable
                    show-overflow-tooltip>
            </el-table-column>
            <el-table-column
                    prop="comName"
                    label="交易流水号"
                    sortable
                    show-overflow-tooltip>
            </el-table-column>

            <el-table-column
                    prop="cashAccount"
                    label="现金账户"
                    sortable>
            </el-table-column>

            <el-table-column
                    prop="usableCash"
                    label="可用金额"
                    sortable>
            </el-table-column>

            <el-table-column
                    prop="orderCash"
                    label="订单配额"
                    sortable>
            </el-table-column>

            <el-table-column
                    prop="billAccount"
                    label="票据账户"
                    sortable>
            </el-table-column>

            <el-table-column
                    prop="usableBill"
                    label="可用金额"
                    sortable>
            </el-table-column>

            <el-table-column
                    prop="orderBill"
                    label="订单配款"
                    sortable>
            </el-table-column>
            <el-table-column
                    prop="rebateAccount"
                    label="红包账户"
                    sortable>
            </el-table-column>

            <el-table-column label="操作" width="300">
                <template scope="scope">
                    <el-button
                            size="small"
                            type="warning"
                            @click="handlePause(scope.$index, scope.row)">查看明细</el-button>

                    <%--<el-button--%>
                    <%--size="small"--%>
                    <%--type="info"--%>
                    <%--@click="handleResume(scope.$index, scope.row)">恢复</el-button>--%>

                    <%--<el-button--%>
                    <%--size="small"--%>
                    <%--type="danger"--%>
                    <%--@click="handleDelete(scope.$index, scope.row)">删除</el-button>--%>

                    <%--<el-button--%>
                    <%--size="small"--%>
                    <%--type="success"--%>
                    <%--@click="handleUpdate(scope.$index, scope.row)">修改</el-button>--%>
                </template>
            </el-table-column>
 </el-table>





    </div>


</div>

<script src="../js/CapitalTrade.js"></script>
</body>


</html>