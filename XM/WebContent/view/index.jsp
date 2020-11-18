
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>首页面</title>

    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <!--样式修改-->
    <style>
        /*div{
             border: solid red 1px;
         }*/
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

        /*消掉a标签的下划线*/

        a:link {
            text-decoration: none;
            color: black;
        }

        a:active {
            text-decoration: black;
        }

        a:hover {
            text-decoration: underline;
            color: red
        }

        a:visited {
            text-decoration: none;
            color: black
        }

        /*改变div03的标签样式*/
        #div03 {
            border-bottom: lightgrey solid 1px;
        }

        #div03 a {
            font-size: 20px;
            color: #67b168;
        }

        /*设置div04的子容器间隔*/
        #div04 div{
            margin-bottom: 20px;

        }
        /*设置字体*/
        #div04 div .col-md-2 font{
            font-size: 30px;
            color: red;
        }
        #div04 div .col-md-2{
            padding-top: 5%;
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
            <img src="../img/logo.png"/>&nbsp;&nbsp;&nbsp;&nbsp;
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

           <p>
               <font style="font-size: 20px;color: white;">${User.u_name}</font>&nbsp;&nbsp;
               <span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;&nbsp;
               <a id="A1" style="color: black ;font-family: 'Californian FB';font-style: oblique ;font-size:20px" href="login.jsp">登录&nbsp;&nbsp;&nbsp;/</a>
               <a id="A2" style="color: black ;font-family: 'Californian FB';font-style: oblique ;font-size: 20px " href="regist.jsp">注册</a>
               <a id="A3" style="color: black ;font-family: 'Californian FB';font-style: oblique ;font-size: 20px " href="/XM/indexServlet?method=exit"></a>
           </p>
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
                            <li class="active"><a href="#">主页</a></li>
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

<!--图片轮播-->
<div class="container">
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
            <li data-target="#carousel-example-generic" data-slide-to="3"></li>
        </ol>

        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="../img/1.jpg" alt="...">
            </div>
            <div class="item">
                <img src="../img/2.jpg" alt="...">
            </div>
            <div class="item">
                <img src="../img/3.jpg" alt="...">
            </div>
            <div class="item">
                <img src="../img/4.jpg" alt="...">
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>


</div>

<div class="container">
    <!--地址-->
    <h3 style="border-bottom:lightgrey solid 1px;font-family: 'Bodoni MT Poster Compressed';font-size: 30px;color: #67b168">
        区域</h3>
    <div>
        <dl>
            <dd>
                <a href="#" style="color: red">不限</a>
                <a href="#">黄洲</a>
                <a href="#">麻城</a>
                <a href="#">蕲春</a>
                <a href="#">武穴</a>
                <a href="#">浠水</a>
                <a href="#">红安</a>
                <a href="#">罗田</a>
                <a href="#">团风</a>
            </dd>
        </dl>
    </div>
    <!-- 租金 -->
    <div>
        <dl>
            <dd>
                <a href="" onClick="clickLog('from=fcpc_list_hg_Zujin_')">租金</a>
                <a href="" style="color: red">不限</a>
                <a href="">500元以下</a>
                <a href="">500-1000元</a>
                <a href="">1000-1500元</a>
                <a href="">1500-2000元</a>
                <a href="">2500-3000元</a>
                <a href="">3500-4000元</a>
                <a href="">4500以上</a>
                <span class="text">
                    <input type="text" para="minprice" muti="1" min="0" max="999999" name="b_q" autocomplete="off">
                </span>
                <span class="dev"> - </span>
                <span class="text">
                    <input type="text" para="minprice" muti="1" min="0" max="999999" name="b_q" autocomplete="off">
                </span>
                <span class="dev">元</span>
                <span class="shaixuanbtn none">
                    <a rel='nofollow' href="javascript:;"
                       onClick="clickLog('from=fcpc_list_hg_Zujin_shaixuan')">价格筛选</a>
                </span>
                </span>
            </dd>
        </dl>
    </div>
    <!--厅室-->
    <div>
        <dl>
            <dd>
                <a href="#">厅室</a>
                <a href="#" style="color: red">不限</a>
                <a href="#">一室</a>
                <a href="#">两室</a>
                <a href="#">三室</a>
                <a href="#">四室</a>
                <a href="#">四室以上</a>
            </dd>
        </dl>

    </div>
    <!--f方式-->
    <div>
        <dd>
            <a href="#">方式</a>
            <a href="#" style="color: red">不限</a>
            <a href="#">整套出租</a>
            <a href="#">单间出租</a>
        </dd>
    </div>

    <h3 style="border-bottom:lightgrey solid 1px;font-family: 'Bodoni MT Poster Compressed';font-size: 30px;color: #67b168">出租屋</h3>

    <div class="row" id="div04">

        <%--租房信息回显--%>
    </div>
</div>

<%-- 底栏--%>
<div class="container-fluid" style="width: 100%;height: 200px ;border-top: silver solid 1px ;margin-top: 50px;padding-top: 20px">
    <div class="col-md-4" style="text-align: center">
        <img src="../img/logo.png">
        <h3 style="color: #67b168">只为您专心选好房</h3>
    </div>
    <div class="col-md-4">
        <h4><img src="../img/ZF/08.png" style="width: 30px;height: 30px" >友情链接</h4>
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
        <p><img src="../img/ZF/07.png" style="width: 30px;height: 30px"><font style="font-size:20px">特此感谢</font></p>
        <p> &nbsp;&nbsp; &nbsp;&nbsp;<a href="https://hg.58.com/house.shtml?PGTID=0d400008-0772-aa9a-6e92-f197b1d0294e&ClickID=3">58同城</a></p>
        <p>&nbsp;&nbsp; &nbsp;&nbsp;<a href="https://huanggang.anjuke.com/?pi=PZ-baidu-pc-all-biaoti">安居客</a></p>
        <p> &nbsp;&nbsp; &nbsp;&nbsp;<a href="https://www.zuke.com/">租房网</a></p>
    </div>

</div>

<%--js方法区--%>
<script>


    /*用户名显示*/
    var u_num = ${User.u_num}
      if(u_num != ""){
        $("#A1").html("");
        $("#A2").html("");
        $("#A3").html("退出");
      }else{

      }
</script>

<script>

    /*租房信息显示*/
    $.post("/XM/indexServlet?method=findHomeMsg",function(data){
        //将json字符串变成javaScript 对象
        var obj = eval("("+data+")")

        for(var i = 0; i <obj.length ; i++){
            //进行拼接回显
            $("#div04").append(
            "<div class='col-md-12 ' style='border-bottom:lightgrey 1px dashed'>"+
                "<div class='col-md-3'>"+
                "<img src='/XM/ShowServlet?method=Show01&h_id="+obj[i].h_id+"' style='width:80%'  onclick='run02("+obj[i].h_id+")'>"+
                "</div>"+
                " <div class='col-md-7'>"+
                "<span onclick='run02("+obj[i].h_id+")'><a href='#'><h3><font>"+obj[i].h_way+"</font>| <font>"+obj[i].h_ms+"</font></h3><a></span>"+
                "<a><p><font>"+obj[i].h_type+"</font>㎡</p></a>"+
            "<a><p><font>"+obj[i].h_address2+"</font>&nbsp;&nbsp;<font>"+obj[i].h_address1+"</font></p></a>"+
            "来自经纪人：<font>"+obj[i].h_hostmsg+"</font>"+
            "</div>"+
            "<div class='col-md-2'>"+
                "<font>"+obj[i].h_money+"</font><font>元/月</font>"+
            "</div>"+
            "</div>"
            )
        }

    })

    //点击信息跳转到页面
    function  run02(id) {
        $.post("/XM/indexServlet?method=findIdMsg01",{id:id},function(data){
            //判断
            if(data === "true"){
                window.location.href ="http://localhost:8080/XM/view/index2.jsp"
            }
        })
    }






</script>



</body>
</html>
