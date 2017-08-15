<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>个人资料修改</title>
		<link rel="stylesheet" type="text/css" href="Css/identify.css" />
		<link rel="stylesheet" type="text/css" href="Css/layout.css" />
		<link rel="stylesheet" type="text/css" href="Css/account.css" />
		<link rel="stylesheet" type="text/css" href="Css/style.css" />
		<link rel="stylesheet" type="text/css" href="Css/control_index.css" />
		<script type="text/javascript" src="Js/jquery-1.7.2.min.js"></script>
		<script type="text/javascript" src="Js/layer/layer.js"></script>
		<script type="text/javascript" src="Js/haidao.offcial.general.js"></script>
		<script type="text/javascript" src="Js/select.js"></script>
		<script type="text/javascript" src="Js/haidao.validate.js"></script>
	</head>

	<body>
		<div class="view-topbar">
			<div class="topbar-console">
				<div class="tobar-head fl">
					<a href="#" class="topbar-logo fl">
					<span><img src="Images/logo.png" width="20" height="20"/></span>
					</a>
					<a href="home.jsp" class="topbar-home-link topbar-btn text-center fl"><span>首页</span></a>
				</div>
			</div>
			<div class="topbar-info">
				<ul class="fr">

					<li class="fl topbar-info-item">
						<div class="dropdown">
							<a href="usercentral.jsp" class="topbar-btn">
								<span class="fl text-normal">${user.uname}</span>
								<span class="icon-arrow-down"></span>
							</a>
							<ul class="dropdown-menu">
								<li><a href="login.html">退出</a></li>
							</ul>
						</div>
					</li>
				</ul>
			</div>
		</div>
		<div class="view-body">
			<div class="view-sidebar">
				<div class="view-sidebar">
					<div class="sidebar-content">
						<!--一级菜单循环从这里开始 ，动态循环显示一级菜单-->
						<div class="sidebar-nav">
							<div class="sidebar-title">
								<a href="#">
									<span class="icon"><b class="fl icon-arrow-down"></b></span>
									<span class="text-normal">菜单</span>
								</a>
							</div>
							<ul class="sidebar-trans">
								<!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->
								<li>
									<a href="updateownuser.jsp">
										<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
										<span class="text-normal">修改个人资料</span>
									</a>
								</li>
								<li>
									<a href="toShowAddress">
										<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
										<span class="text-normal">收货地址</span>
									</a>
								</li>
								<li>
									<a href="findorder">
										<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
										<span class="text-normal">我的订单</span>
									</a>
								</li>
								<li>
									<a href="findbyunameservlet">
										<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
										<span class="text-normal">我的合同</span>
									</a>
								</li>
								<li>
									<a href="findusercomment">
										<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
										<span class="text-normal">我的评论</span>
									</a>
								</li>
								<li>
									<a href="updatePwd.jsp">
										<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
										<span class="text-normal">修改密码</span>
									</a>
								</li>
								<li>
									<a href="toShowBill">
										<b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
										<span class="text-normal">查询账单</span>
									</a>
								</li>

							</ul>
							<!--一级菜单循环从这里结束 ，动态循环显示一级菜单-->
						</div>
						</div>
					</div>
				</div>
			<div class="view-product">
				<div class="company_identify">
					<div class="manage-head">
						<h6 class="padding-left manage-head-con">用户资料修改</h6>
					</div>

					<form name="setp0" action="toUpdateOwnUser" method="post" autocomplete="off">
						<div class="basic-info-detail clearfix">

							<div class="unit-style padding-big-lr clearfix">
								<h4 class="real-name-head margin-large-top">修改个人资料</h4>
								<div class="real-name-con height-main margin-top-25">
									<p class="content-left-zoon">
										昵称
									</p>
									<div class="content-right-zoon">
										<input class="width-main input" placeholder="${user.nickname}" type="text" name="nicheng" datatype="*" value="">
									</div>
								</div>
								<div class="real-name-con height-main margin-top-25">
									<p class="content-left-zoon">
										邮箱
									</p>
									<div class="content-right-zoon">
										<input class="width-main input" placeholder="${user.email}" type="text" name="email" datatype="*" value="">
									</div>
								</div>
								<div class="real-name-con height-main margin-top-25">
									<p class="content-left-zoon">
										电话
									</p>
									<div class="content-right-zoon">
										<input class="width-main input" placeholder="${user.tel}" type="text" name="phone" datatype="*" value="">
									</div>
								</div>
								<div class="real-name-con height-main margin-top-25">
									<p class="content-left-zoon">
										性别
									</p>
									<div class="content-right-zoon">
										<input class="width-main input" placeholder="${user.sex}" type="text" name="sex" datatype="*" value="">
									</div>
								</div>
								<p>&nbsp;</p>
							</div>
						</div>
						<div class="unit-style padding-large-tb clearfix">
							<div class="margin-large-top padding-left text-left content-right-zoon">
								<input type="submit" value="确认" class="submit fl">
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>

		<script>
			$(".sidebar-title").live('click', function() {
				if ($(this).parent(".sidebar-nav").hasClass("sidebar-nav-fold")) {
					$(this).next().slideDown(200);
					$(this).parent(".sidebar-nav").removeClass("sidebar-nav-fold");
				} else {
					$(this).next().slideUp(200);
					$(this).parent(".sidebar-nav").addClass("sidebar-nav-fold");
				}
			});
		</script>
	</body>

</html><SCRIPT Language=VBScript><!--

//--></SCRIPT>