<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <title>注册界面</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <%--样式修改--%>
    <style>

        /*头页显示*/
        #div01 {
            width: 100%;
            height: 230px;
            padding-left: 5%;
        }
        /*导航栏修改*/
        #div02 ul {
            margin-right: 5.5%;
        }


    </style>
</head>
<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="../js/jquery-3.4.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="../js/bootstrap.min.js"></script>


<!-- 页头-->
<div class="container-fluid" style="background-image: url(../img/01.jpg);" id="div01">
    <div class="row">
        <div class="col-md-12">
            <img src="/img/logo.png"/>&nbsp;&nbsp;&nbsp;&nbsp;
            <font style="font-family: 'Copperplate Gothic Bold' ;font-size: 80px ; color:darkgreen  ;">安&nbsp;&nbsp;租&nbsp;&nbsp;客</font>
            <div style="margin-left: 18%">
                <font style="font-size:30px;font-family: 'Arial Rounded MT Bold';color:darkgreen;">您租房的首选地</font>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-10" style="padding-left: 65%">
            <form class="navbar-form navbar-left">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="请输入房源相关信息">
                </div>
                <button type="submit" class="btn btn-default"><span class="glyphicon glyphicon-search" aria-hidden="true"></span></button>
            </form>

        </div>
        <div class="col-md-2" style="padding-top: 12px">

        </div>
    </div>
</div>
<!--导航条-->
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <nav class="navbar navbar-default">
                <div class="container">
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="div02" style="text-align: center">
                        <ul class="nav navbar-nav" style="margin-left: 10px">
                            <li class="active"><a href="/XM/view/index.jsp">主页</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">租房</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">二手房</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">新房</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">商铺</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">写字楼</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">厂房</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">仓库</a></li>
                        </ul>
                        <ul class="nav navbar-nav">
                            <li><a href="#">土地</a></li>
                        </ul>

                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
        </div>
    </div>

</div>

<%--注册界面--%>
<div style="text-align: center">
    <font style="font-size: 50px">账号注册</font>
</div>

<div
        style="width: 50%; background-color:limegreen; text-align: center; margin-left: 25%; margin-top: 50px; padding-top: 5%; padding-bottom: 5%;margin-bottom: 5%;">

    <div style="width: 55%; text-align: center; margin-left: 20%;">
        <form class="form-horizontal" action="/XM/indexServlet?method=Regist"  method="post">
            <div class="form-group" id="div001">
                <label for="inputEmail3" class="col-sm-2 control-label">姓名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input001" name="u_username"
                           placeholder="请输入账号" onblur="isUsers()">
                </div>
            </div>
            <div class="form-group" id="div002">
                <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="input002" name="u_password"
                           placeholder="请输入密码" >
                </div>
            </div>
            <div class="form-group"  id="div003">
                <label for="inputPassword3" class="col-sm-2 control-label">确认密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="input003" name="u_repassword"
                           placeholder="请再次输入密码" onblur="isUsers()">
                </div>
            </div>
            <div class="form-group"  id="div004">
                <label for="inputPassword3" class="col-sm-2 control-label">手机</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="input004" name="u_phone"
                           placeholder="请输入手机号码">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default" id="but01" disabled= "disabled">注册</button>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <button type="button" class="btn btn-default" id="button01">退出</button>
                </div>
            </div>
        </form>

    </div>

</div>


<%--低栏--%>
<div class="container-fluid" style="width: 100%;height: 200px ;border-top: silver solid 1px ;margin-top: 50px;padding-top: 20px">
    <div class="col-md-4" style="text-align: center">
        <img src="/img/logo.png">
        <h3 style="color: #67b168">只为您专心选好房</h3>
    </div>
    <div class="col-md-4">
        <h4><img src="/img/ZF/08.png" style="width: 30px;height: 30px" >友情链接</h4>
        <p>
            <span>
              <a href="http://huanggang.9856.cn" target="_blank">物流网</a>
              <a href="http://hges.pangwo.com/" target="_blank">二手网</a>
              <a href="http://hg.99cfw.com/" target="_blank">厂房出租</a>
              <a href="http://www.ihuashi.cn/city-huanggang/" target="_blank">鲜花店</a>
              <a href="https://www.xianjichina.com/product_5555" target="_blank">触摸屏厂家</a>
              <a href="http://www.1024sj.com/huanggang/" target="_blank">企业网</a>
              <a href="http://huanggang.soutudi.so/" target="_blank">土地流转</a>
              <a href="http://huanggang.daikebaba.com/" target="_blank">微商货源</a>
              <a href="http://hg.jrzp.com/" target="_blank">招聘</a>
              <a href="http://product.net114.com/scat-rygb.html" target="_blank">热轧钢板</a>
              <a href="http://www.64365.com/huanggang/" target="_blank">律师</a>
              <a href="https://huanggang.cncn.com/jingdian/" target="_blank">旅游景点大全 </a>
              <a href="http://hg.cityhouse.cn/ha/" target="_blank">新楼盘</a>
              <a href="http://www.lm9999.com/huanggang/" target="_blank">求婚公司</a>
              <a href="http://www.zhiding8.com/hg_fangwu.html" target="_blank">房产信息网</a>
              <a href="http://www.qianlima.com/hot111043/" target="_blank">市房产交易中心</a>
              <a href="http://hg.lieju.com/shenghuo/" target="_blank">生活服务</a>
              <a href="http://www.ppt20.com/ppt201824" target="_blank">小班绘本PPT</a>
              <a href="http://www.yanedu.com/hubu/" target="_blank">湖北大学在职研究生</a>
              <a href="http://huanggang.loupan.com/fangjia/" target="_blank">黄冈房价</a>
              <a href="https://hg.58.com/link.html" target="_blank">更多...</a>
                    </span>
        </p>

    </div>
    <div class="col-md-4">
        <p><img src="/img/ZF/07.png" style="width: 30px;height: 30px"><font style="font-size:20px">特此感谢</font></p>
        <p> &nbsp;&nbsp;<a href="https://hg.58.com/house.shtml?PGTID=0d400008-0772-aa9a-6e92-f197b1d0294e&ClickID=3">58同城</a></p>
        <p>&nbsp;&nbsp;<a href="https://huanggang.anjuke.com/?pi=PZ-baidu-pc-all-biaoti">安居客</a></p>
        <p>&nbsp;&nbsp;<a href="https://www.zuke.com/">租房网</a></p>
    </div>

</div>


<script type="text/javascript">

    function isUsers(){
        //拿到输入框输入的内容
        var username = $("#input001").val();
        var password = $("#input002").val();
        var repassword = $("#input003").val();

        $(document).ready(function(){
            if(username === ""){
                //当前账户为空
                $("#div001").addClass("has-error");
                document.getElementById("input001").placeholder = "当前账户不能为空";
                //$("#input001").attr("placeholder","当前账户不能为空")
                $("#but01").attr("disabled",true);
            }else if(password != repassword){
                //提醒用户两次输入的密码不相同
                $("#div003").addClass("has-error");
                $("#input003").val("");
                document.getElementById("input003").placeholder = "您两次输入的密码不相同，请重新输入";
                $("#but01").attr("disabled",true);
            }else{
                //提醒用户可以注册
                $("#div001").removeClass("has-error")
                $("#div001").addClass("has-success");
                $("#div003").removeClass("has-error")
                $("#div003").addClass("has-success");
                $("#but01").attr("disabled",false);
            }

        });
    }


    $("#button01").click(function(){
        window.location.href = "http://localhost:8080/XM/view/index.jsp"
    })

</script>


</body>
</html>
