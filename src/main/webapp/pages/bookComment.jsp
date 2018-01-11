<%--
  Created by IntelliJ IDEA.
  User: huangm
  Date: 2017/11/18
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>读书笔记</title>
    <meta charset="utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://unpkg.com/element-ui/lib/theme-chalk/index.css">
    <script src="https://unpkg.com/vue/dist/vue.js"></script>
    <script src="http://cdn.bootcss.com/vue-resource/1.3.4/vue-resource.js"></script>
    <script src="https://unpkg.com/element-ui/lib/index.js"></script>
</head>
<body>
<h4 style="text-align: center">读书笔记</h4>
<div id="book_mark">
<el-form :modal="form" style="padding-left: 200px;padding-top: 50px">


            <el-form-item class="item" label="书名" label-width="50px" style="width: 30%;text-align: center">
                <el-input  v-model="form.bookName" auto-complete="off"></el-input>
            </el-form-item>



            <el-form-item class="item" label="作者" label-width="50px" style="width:30%">
                <el-input v-model="form.bookAthor" auto-complete="off"></el-input>
            </el-form-item>


            <el-form-item class="item" label="笔记" label-width="50px" style="width:50%">
                <el-input v-model="form.bookMark" auto-complete="off"></el-input>
            </el-form-item>


           <div style="padding-left: 500px">
            <el-button  type="primary" label-width="50px" style="width:10%;padding-left: 20px" @click="commitMark">提 交</el-button>

               </div>

</el-form >
</div>
<script type="text/css">
    .item{
        text-align: center;
    }
</script>
<script >
    var vueBook = new Vue({
        el:"#book_mark",
        data:{
            form:{
                bookName:'',
                bookMark:'',
                bookAthor:''
            }
        },
        methods:{
            commitMark:function () {
              this.$http.post('book/commitMark',{"bookMark":this.form.bookMark,"bookName":this.form.bookName,"bookAuthor":this.form.bookAthor},{emulateJSON:true}).then(
                  function(res){
                      this.form.bookAthor='';
                      this.form.bookName='';
                      this.form.bookMark='';
//                     this.showModalDialog("bookCommentMarkList.jsp");
                      window.location.href = "bookCommentMarkList.jsp"
                  }


              ),function () {
                  alert("保存失败")
              }
            },
        },
    });

//    this.showModalDialog("pages/bookCommentMarkList.jsp");
</script>
</body>
</html>
