<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>合同信息</title>
  <link rel="stylesheet" type="text/css" href="Css/identify.css"/>
  <link rel="stylesheet" type="text/css" href="Css/layout.css"/>
  <link rel="stylesheet" type="text/css" href="Css/style.css"/>
  <link rel="stylesheet" type="text/css" href="Css/control_index.css"/>
  <script type="text/javascript" src="Js/jquery-1.7.2.min.js"></script>
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
      <a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>合同管理系统</span></a>
    </div>
  </div>
  <div class="topbar-info">
    <ul class="fr">

      <li class="fl topbar-info-item">
        <div class="dropdown">
          <a href="#" class="topbar-btn">
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
    <div class="sidebar-content">
      <!--一级菜单循环从这里开始 ，动态循环显示一级菜单-->
      <div class="sidebar-nav">
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">修改个人资料</span>
          </a>
        </div>
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">收货地址</span>
          </a>
        </div>
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">我的订单</span>
          </a>
        </div>
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">我的合同</span>
          </a>
        </div>
        <div class="sidebar-title">
          <a href="findcomment">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">我的评论</span>
          </a>
        </div>
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">修改密码</span>
          </a>
        </div>
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">绑定银行账户</span>
          </a>
        </div>
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">查询账单</span>
          </a>
        </div>
      </div>

      <!--一级菜单循环从这里结束 ，动态循环显示一级菜单-->

    </div>
  </div>

  <div class="view-product">
    <div class="authority">
      <div class="authority-head">
        <div class="manage-head">
          <h6 class="layout padding-left manage-head-con">合同管理平台
          </h6>
          <div class="margin-tb manage-detail-con clearfix">
            <a class="h5 margin-large-left custom fl" href="addcontract.jsp">新增合同</a>
            <a class="h5 margin-large-left custom fl" href="updatecontract.jsp">修改合同状态</a>
            <%--<form action="#">--%>
              <%--<div class="name border-bottom">--%>
                  <%--<input type="text" name="a" style="border: dotted">--%>
                <%--<button class="h5 margin-large-right custom fl"  type="submit">搜索</button>--%>
                <%--</div>--%>
            <%--</form>--%>
          </div>
        </div>
      </div>
      <div class="authority-content">
        <div class="list-content show">
          <div class="offcial-table tr-border margin-big-top clearfix">
            <div class="tr-th clearfix">
              <div class="th w15">
                合同号
              </div>
              <div class="th w20">
                租赁单位
              </div>
              <div class="th w20">
                起租时间
              </div>
              <div class="th w20">
                结租时间
              </div>
              <div class="th w10">
                合同状态
              </div>
              <div class="th w15">
                操作
              </div>
            </div>
            <c:forEach var="r" items="${all}">
              <div class="tr clearfix border-bottom-none">
                 <div class="td w15">
                   ${r.cid}
                 </div>
                <div class="td w20">
                    ${r.secondparty}
                </div>
                <div class="td w20">
                    ${r.beginrentdate}
                </div>
                <div class="td w20">
                    ${r.overrentdate}
                </div>
                <div class="td w10">
                    ${r.cstatusid}
                </div>
                <div class="td w15">
                  <a href="deletecontractinfo.action?pid=${r.cid}" class="button-word2 btn_ajax_confirm">删除</a>
                </div>

              </div>
            </c:forEach>
          </div>
        </div>
        <div class="show-page padding-big-right">
          <div class="page">
            <div class="page">
              <ul class="offcial-page margin-top margin-big-right">
                <li>共<em class="margin-small-left margin-small-right">1</em>条数据</li>
                <li>每页显示<em class="margin-small-left margin-small-right">15</em>条</li>
                <li><a class="next disable">上一页</a></li>
                <li></li>
                <li><a class="next disable">下一页</a></li>
                <li><span class="fl">共<em class="margin-small-left margin-small-right">1</em>页</span>
                </li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>

<script>
  $(".sidebar-title").live('click', function () {
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

</html>