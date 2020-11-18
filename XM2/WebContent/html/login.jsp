<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

	<title>管理员登录</title>
 	<!-- Bootstrap -->
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    
    <%--样式修改--%>
    <style>

        /*头页显示*/
        #div001 {
            width: 100%;
            height: 230px;
            padding-left: 5%;
        }
        /*导航栏修改*/
        #div002 ul {
            margin-right: 5.5%;
        }


    </style>
    
</head>
<body>
    <!-- jQuery (Bootstrap 的所有 JavaScript 插件都依赖 jQuery，所以必须放在前边) -->
    <script src="../js/jquery-3.1.0.min.js"></script>
    <!-- 加载 Bootstrap 的所有 JavaScript 插件。你也可以根据需要只加载单个插件。 -->
    <script src="../js/bootstrap.min.js"></script>
    
    <!-- 页头-->
<div class="container-fluid" style="background-image: url(../img/01.jpg);" id="div001">
    <div class="row">
        <div class="col-md-12">
            <img src="../img/logo.png"/>&nbsp;&nbsp;&nbsp;&nbsp;
            <font style="font-family: 'Copperplate Gothic Bold' ;font-size: 80px ; color:darkgreen  ;">安&nbsp;&nbsp;租&nbsp;&nbsp;客</font>
            <div style="margin-left: 18%">
                <font style="font-size:30px;font-family: 'Arial Rounded MT Bold';color:darkgreen;">后台管理系统</font>
            </div>
        </div>
    </div>

    
</div>

    <div style="text-align: center ;margin-top: 1%">
		<font style="font-size: 40px">账号登录</font>
	</div>
	<div style="text-align: center;color: red;">
	<h4>${ LoginMSG01 }</h4>
	<h4>${ LoginMSG02 }</h4>
	</div>
	
	<div style="width: 50%; background-color: orange; text-align: center; margin-left: 25%; margin-top: 50px; padding-top: 5%; padding-bottom: 5%">

		<div style="width: 55%; text-align: center; margin-left: 20%;">
			<form class="form-horizontal" action="/XM2/LoginServlet?method=Login"  method="post">
				<div class="form-group" id="div01">
					<label for="inputEmail3" class="col-sm-2 control-label">账号</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" id="input001" name="a_username"
							placeholder="请输入账号" onblur="isUsers()">
					</div>
				</div>
				<div class="form-group" id="div02">
					<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
					<div class="col-sm-10">
						<input type="password" class="form-control" id="input002" name="a_password"
							placeholder="请输入密码" onblur="isUsers()">
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<div class="checkbox">
							<label> <input type="checkbox"> 记住密码
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default" id="but01" disabled= "disabled">登录</button>
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
        <img src="../img/logo.png">
        <h3 style="color: #67b168">只为您专心选好房</h3>
    </div>
    <div class="col-md-4">
        <h4><img src="../img/08.png" style="width: 30px;height: 30px" >友情链接</h4>
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
        <p><img src="../img/07.png" style="width: 30px;height: 30px"><font style="font-size:20px">特此感谢</font></p>
        <p> &nbsp;&nbsp;<a href="https://hg.58.com/house.shtml?PGTID=0d400008-0772-aa9a-6e92-f197b1d0294e&ClickID=3">58同城</a></p>
        <p>&nbsp;&nbsp;<a href="https://huanggang.anjuke.com/?pi=PZ-baidu-pc-all-biaoti">安居客</a></p>
        <p>&nbsp;&nbsp;<a href="https://www.zuke.com/">租房网</a></p>
    </div>

</div>

<script type="text/javascript">
	
	 //判断用户是否存在的方法
	function isUsers(){
		//拿到用户输入的用户名
		var username = $("#input001").val();
		//进行判断
		var password = $("#input002").val();
		if(username === ""){
			//提示用户账号不能为空
			$("#input001").attr("placeholder","用户名不能为空");
			$("#div01").addClass("has-error");
			$("#but01").attr("disabled",true);
		}else if(password === ""){
			//提示用户密码不能为空
			$("#input002").attr("placeholder","密码不能为空")
			$("#div02").addClass("has-error");
			$("#but01").attr("disabled",true);
		}else{
			//进行登录
			//解除禁止登录
			$("#but01").attr("disabled",false);
			$("#div02").addClass("has-success");
			$(document).ready(function(){
				
				//AJAX 的post请求
				$.post("/day0214/index?method=isLogin",{name:username},function(data){
					//判断
					if(data === "false"){
						//用户不存在
						$("#input001").val("")
						$("#input001").attr("placeholder","该用户名不存")
						$("#div01").addClass("has-error");
						$("#but01").attr("disabled",true);
					}else{
						$("#div01").removeClass("has-error");
						$("#div01").addClass("has-success");
						$("#div02").removeClass("has-error");
						$("#div02").addClass("has-success");
						$("#but01").attr("disabled",false);
					}
				})
			})
			
		}
	}
	
	 
	 $("#button01").click(function(){
		 window.location.href = "#"
	 })
	
	
	</script>
</body>
</html>