<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <%--地图--%>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta name="viewport" content="initial-scale=1.0, user-scalable=no"/>
    <style type="text/css">
        body, html {
            width: 100%;
            height: 100%;
            margin: 0;
            font-family: "微软雅黑";
        }

        #allmap {
            width: 100%;
            height: 500px;
        }

        p {
            margin-left: 5px;
            font-size: 14px;
        }
    </style>
    <%--引进密钥--%>
    <script type="text/javascript" src="//api.map.baidu.com/api?v=2.0&ak=nSxiPohfziUaCuONe4ViUP2N"></script>

    <title>查看购买页面</title>
    <!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">

    <style>
        /* div{
             border: solid red 1px;
         }*/
    </style>

</head>
<body>
<!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
<script src="../js/jquery-3.4.1.min.js"></script>
<!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
<script src="../js/bootstrap.min.js"></script>

<!--导航条-->
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <nav class="navbar navbar-default">
                <div class="container">
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="div02" style="text-align: center">
                        <ul class="nav navbar-nav" style="margin-left: 10px">
                            <li class="active"><a href="index.jsp">主页</a></li>
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
						<ul class="nav navbar-nav navbar-right" style="padding-top: 15px">
                        <li><span class="glyphicon glyphicon-user" aria-hidden="true"></span>&nbsp;&nbsp;<font id="fontuser">${User.u_name }</font></li>
                        </ul>
                    </div><!-- /.navbar-collapse -->
                </div><!-- /.container-fluid -->
            </nav>
        </div>
    </div>
</div>
<%--图标--%>
<div class="container">
    <div class="row">
        <div class="col-md-6">
            <p><img src="../img/logo.png">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font style="font-size: 40px;color: green">安居客</font>
            </p>
        </div>
    </div>
</div>

<div class="container">
    <div>
        <h3 id="h01">新黄高对面 豪装三房 金家上城 首赐出租 带车位</h3>
    </div>
    <div class="row">
        <div class="col-md-3">
            <%--房屋图片--%>
            <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
                <!-- Wrapper for slides -->
                <div class="carousel-inner" role="listbox">
                    <div class="item active">
                        <img src="/XM/ShowServlet?method=Show02&h_id=${ id }&id=1" style="width: 100%;height: 20%">
                    </div>
                    <div class="item">
                        <img src="/XM/ShowServlet?method=Show02&h_id=${ id }&id=2" style="width: 100%;height: 20%">
                    </div>
                    <div class="item">
                        <img src="/XM/ShowServlet?method=Show02&h_id=${ id }&id=3" style="width: 100%;height: 20%">
                    </div>
                </div>
                <!-- 控件 -->
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
        <%--房屋信息--%>
        <div class="col-md-5" style="margin-top: 10px">
            <p><font id="ft01" style="color: red;font-size: 25px">3000</font><font>元/月</font>&nbsp;&nbsp;<font id="ft02">面议</font></p>
            <p><font>租贷方式：</font>&nbsp;&nbsp;<font id="ft03">整租</font></p>
            <p><font>房屋类型：</font>&nbsp;&nbsp;<font id="ft04">整租</font>㎡</p>
            <p><font>朝向楼层：</font>&nbsp;&nbsp;<font id="ft05">整租</font></p>
            <p><font>所在小区：</font>&nbsp;&nbsp;<font id="ft06">整租</font></p>
            <p><font>所属区域：</font>&nbsp;&nbsp;<font id="ft07">整租</font></p>
            <p><font>详细地址：</font>&nbsp;&nbsp;<font id="ft08">整租</font>&nbsp;&nbsp;<a href="#"><font
                    style="color: #2aabd2" onclick="run01()">查看地图</font></a></p>
        </div>
        <%--房东信息--%>
        <div class="col-md-4" style="margin-top: 10px">
            <p><img src="../img/ZF/tx.jpeg" alt="..." class="img-circle" style="width: 100px;height: 100px">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<font >联系电话：</font><font id="ft11">15623266489</font>
            </p>
            <p><font id="ft12">张翠花</font><font>（经纪人）</font></p>
            <p><font id="ft13">个人经济</font></p>
            <p><font id="ft14">湖北和致盛房地产评估测绘有限公司建设路友缘</font></p>
            <button type="button" class="btn btn-success"  onclick="addyy()">预约租房</button>
        </div>
    </div>
</div>


<%--图标显示区--%>
<div class="container">
    <h3 style="border-bottom:lightgrey solid 1px;font-family: 'Bodoni MT Poster Compressed';font-size: 30px;color: #67b168">
        房屋详情</h3>
    <div class="row" style="text-align: center">
        <div class="col-md-2">
            <img src="../img/TB/床.png" style="width: 60px;height: 60px">
            <h4>床</h4>
        </div>
        <div class="col-md-2">
            <img src="../img/TB/沙发.png" style="width: 60px;height: 60px">
            <h4>沙发</h4>
        </div>
        <div class="col-md-2">
            <img src="../img/TB/爱心.png" style="width: 60px;height: 60px">
            <h4>爱心</h4>
        </div>
        <div class="col-md-2">
            <img src="../img/TB/冰箱.png" style="width: 60px;height: 60px">
            <h4>冰箱</h4>
        </div>
        <div class="col-md-2">
            <img src="../img/TB/电视.png" style="width: 60px;height: 60px">
            <h4>电视</h4>
        </div>
        <div class="col-md-2">
            <img src="../img/TB/卷纸.png" style="width: 60px;height: 60px">
            <h4>卷纸</h4>
        </div>
        <div class="col-md-2">
            <img src="../img/TB/空调.png" style="width: 60px;height: 60px">
            <h4>空调</h4>
        </div>
        <div class="col-md-2">
            <img src="../img/TB/洗衣机.png" style="width: 60px;height: 60px">
            <h4>洗衣机</h4>
        </div>
    </div>

    <div>
        <h3>房屋描述:</h3>
        <p id="p01">金龙华府，临移民公园，可休闲锻炼，家居生活均方便；房屋精装修,
            家具家电齐全，拎包入住；正南朝向，采光充足；有钥匙，随时看房！</p></font>
    </div>

</div>


<div class="container">
    <h3 style="border-bottom:lightgrey solid 1px;font-family: 'Bodoni MT Poster Compressed';font-size: 30px;color: #67b168">
        小区位置</h3>
    <%--地图空键--%>
    <div id="allmap"></div>

</div>


<%-- 底栏--%>
<div class="container-fluid"
     style="width: 100%;height: 200px ;border-top: silver solid 1px ;margin-top: 50px;padding-top: 20px">
    <div class="col-md-4" style="text-align: center">
        <img src="../img/logo.png">
        <h3 style="color: #67b168">只为您专心选好房</h3>
    </div>
    <div class="col-md-4">
        <h4><img src="../img/ZF/08.png" style="width: 30px;height: 30px">友情链接</h4>
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
        <p> &nbsp;&nbsp; &nbsp;&nbsp;<a
                href="https://hg.58.com/house.shtml?PGTID=0d400008-0772-aa9a-6e92-f197b1d0294e&ClickID=3">58同城</a></p>
        <p>&nbsp;&nbsp; &nbsp;&nbsp;<a href="https://huanggang.anjuke.com/?pi=PZ-baidu-pc-all-biaoti">安居客</a></p>
        <p> &nbsp;&nbsp; &nbsp;&nbsp;<a href="https://www.zuke.com/">租房网</a></p>
    </div>

</div>


<script type="text/javascript">

    //定义全局变量
    var address = "";

    /**
     * 根据用户点击的房子信息进行回显
     *
     */
    $.post("/XM/indexServlet?method=findIdMsg02", function (data) {
        //将 json 字符创 转变成javaScript
        var obj = eval("(" + data + ")");
        //修改值
        $("#h01").html(obj.h_ms)
        $("#ft01").html(obj.h_money)
        $("#ft02").html(obj.h_buyway)
        $("#ft03").html(obj.h_way)
        $("#ft04").html(obj.h_type)
        $("#ft05").html(obj.h_direction)
        $("#ft06").html(obj.h_address1)
        $("#ft07").html(obj.h_address2)
        $("#ft08").html(obj.h_address3)
        $("#p01").html(obj.h_msg)
        var address1 = obj.h_address1;
        address = address1;
        run01();
    })

    /*
     *    百度地图API功能
     */


    function run01() {
        var map = new BMap.Map("allmap");
        map.centerAndZoom(address, 16);
		
        
        // 初始化地图， 设置中心点坐标和地图级别
        var marker = new BMap.Marker(address);
        map.addOverlay(marker);
        
        var top_left_control = new BMap.ScaleControl({anchor: BMAP_ANCHOR_TOP_LEFT});// 左上角，添加比例尺
        var top_left_navigation = new BMap.NavigationControl();  //左上角，添加默认缩放平移控件
        var top_right_navigation = new BMap.NavigationControl({
            anchor: BMAP_ANCHOR_TOP_RIGHT,
            type: BMAP_NAVIGATION_CONTROL_SMALL
        }); //右上角
        //添加控件和比例尺
        map.addControl(top_left_control);
        map.addControl(top_left_navigation);
        map.addControl(top_right_navigation);
    }


    /*显示房东信息*/
    $.post("/XM/indexServlet?method=findHostMsg",function (data) {
        //将json字符串 转变成javaScript对象
        var obj = eval("("+data+")")
        $("#ft11").html(obj.f_phone)
        $("#ft12").html(obj.f_name)
        $("#ft13").html(obj.f_jiyi)
        $("#ft14").html(obj.f_company)

    })

    /**
     * 提交预约信息
     */
    function addyy(){
    		$.post("/XM/indexServlet?method=addyyHome",function (data) {
                //判断
                if(data === "true"){
                    alert("您已预约成功，请联系房东")
                }else{
                    alert("请先登录，才能预约")
                }
            })
    	}
  


</script>


</body>
</html>
