var vue = new Vue({
    el: "#capital-trade",
    data: {
        mes1: 'hello',
        //表格当前页数据
        tableData: [],

        //请求的URL
        url: '',

        //默认每页数据量
        pagesize: 10,

        //当前页码
        currentPage: 1,

        //查询的页码
        start: 1,

        //默认数据总数
        totalCount: 10,

        //添加对话框默认可见性
        dialogFormVisible: false,

        //修改对话框默认可见性
        updateFormVisible: false,

        //提交的表单
        form: {
            tradeNo: '',
            custName: '',
            fundsType: '',
            itemPrice: "",
        },

        updateform: {
            itemName: '',
            itemCode: '',
            itemNum: '',
        },
    },

    methods: {

        //从服务器读取数据
        loadData: function (pageNum, pageSize) {
            // alert("sadfsaf");
            console.log(sessionStorage.getItem("list"));
           this.tableData =JSON.parse(sessionStorage.getItem("list"));
           this.totalCount = sessionStorage.getItem("number");
        },

        //单行删除
        handleDelete: function (index, row) {
            this.$http.post('item/deleteItem', {
                "itemName": row.itemName,
                "itemCode": row.itemCode
            }, {emulateJSON: true}).then(function (res) {
                this.loadData(this.currentPage, this.pagesize);
            }, function () {
                console.log('failed');
            });
        },

        // //暂停任务
        // handlePause: function(index, row){
        //     this.$http.post('job/pausejob',{"jobClassName":row.job_NAME,"jobGroupName":row.job_GROUP},{emulateJSON: true}).then(function(res){
        //         this.loadData( this.currentPage, this.pagesize);
        //     },function(){
        //         console.log('failed');
        //     });
        // },

        //查看详情
        handleResume: function(index, row){
            this.$http.post('account/getDetailAccountInforByComId',{"pageSize":this.pageSize,"pageNum":this.currentPage,"comId":row.comId,"comType":row.comType,"accountType":row.accountType},{emulateJSON: true}).then(function(res){
                // this.loadData( this.currentPage, this.pagesize);
                window.location.href="CapitalTrade.jsp";
                sessionStorage.setItem("list",res.list)
            },function(){
                console.log('failed');
            });
        },

        //搜索
        search: function () {
//
            var $custName = this.form.custName
            this.$http.get('account/queryCustAccount?' + 'pageNum=' + this.currentPage + '&pageSize=' + this.pagesize+'&comName'+$custName).then(function (res) {
                console.log(res)
                this.tableData = res.body.list;
                this.totalCount = res.body.number;
            }, function () {
                console.log('failed');
            });
        }
    }
})

this.vue.loadData(vue.currentPage, vue.pagesize);