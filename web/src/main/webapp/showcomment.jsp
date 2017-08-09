<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>评论信息</title>
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
      <a href="index.html" class="topbar-home-link topbar-btn text-center fl"><span>管理中心</span></a>
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
      <c:forEach var="r" items="${reslist}">
        <c:if test="${r.parentID==0}">
          <div class="sidebar-nav">
            <div class="sidebar-title">
              <a href="${r.resurl}">
                <span class="icon"><b class="fl icon-arrow-down"></b></span>
                <span class="text-normal">${r.rname}</span>
              </a>
            </div>
            <ul class="sidebar-trans">
              <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->
              <c:forEach var="sec_r" items="${reslist}">
                <c:if test="${sec_r.parentID==r.rid}">
                  <li>
                    <a href="${sec_r.resurl}">
                      <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16"/></b>
                      <span class="text-normal">${sec_r.rname}</span>
                    </a>
                  </li>
                </c:if>
              </c:forEach>
              <!--二级菜单循环从这里结束 ，动态循环显示二级菜单-->
            </ul>
          </div>
        </c:if>
        <!--一级菜单循环从这里结束 ，动态循环显示一级菜单-->
      </c:forEach>
    </div>
  </div>
</div>

<div class="view-product">
  <div class="authority">
    <div class="authority-head">
      <div class="manage-head">
        <h6 class="layout padding-left manage-head-con">评论信息
        </h6>
      </div>
      <form action="findcomment" method="post">
        <!-- Unnamed (Droplist) -->
        <div id="u4" class="ax_droplist">
          <select id="by" name="by">
            <option selected value="all">全部</option>
            <option value="level">评论等级</option>
            <option value="commodity">商品名</option>
          </select>
        </div>

        <!-- Unnamed (Text Field) -->
        <div id="u5" class="ax_text_field">
          <input name="keyword" type="text" value=""/>
        </div>

        <!-- Unnamed (HTML Button) -->
        <div id="u6" class="ax_html_button">

          <input id="u6_input" type="submit" value="搜索"/>

        </div>
      </form>
    </div>
    <div class="authority-content">
      <div class="list-content show">
        <div class="offcial-table tr-border margin-big-top clearfix">
          <div class="tr-th clearfix">
            <div class="th w20">
              评论商品名
            </div>
            <div class="th w20">
              评论等级
            </div>
            <div class="th w20">
              评论内容
            </div>
            <div class="th w20">
              评论人
            </div>
          </div>
          <c:forEach var="c" items="${clist}">
            <div class="tr clearfix border-bottom-none">
              <div class="td w10">
                  ${c.commodityinfo.cname}
              </div>
              <div class="td w30">
                  ${c.levelinfo.lname}
              </div>
              <div class="td w25">
                  ${c.content}
              </div>
              <div class="td w10">
                  ${c.userinfo.uname}
              </div>
              <div class="td w5">
                <a href="#" class="button-word2 btn_ajax_confirm">编辑</a> |
                <a href="#" class="button-word2 btn_ajax_confirm">删除</a>
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