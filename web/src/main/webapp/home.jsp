<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>爱租相机网</title>
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
      <a href="usercentral.jsp" class="topbar-home-link topbar-btn text-center fl"><span>个人中心</span></a>
    </div>
  </div>
  <div class="">
    <div class="margin-center padding-little-top" align="center">
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
                <span class="text-normal">品牌：</span>
              </a>
            </div>
            <ul class="sidebar-trans">
              <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->
                <li>
                  <a href="FindCommodityByBrandServlet?brand=尼康（Nikon）">
                    <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                    <span class="text-normal">尼康（Nikon）</span>
                  </a>
                </li>
              <li>
                <a href="FindCommodityByBrandServlet?brand=佳能（Canon）">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">佳能（Canon）</span>
                </a>
              </li>
              <li>
                <a href="FindCommodityByBrandServlet?brand=索尼（SONY）">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">索尼（SONY）</span>
                </a>
              </li>
              <li>
                <a href="FindCommodityByBrandServlet?brand=徕卡（Leica）">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">徕卡（Leica）</span>
                </a>
              </li>
              <li>
                <a href="FindCommodityByBrandServlet?brand=卡西欧（CASIO）">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">卡西欧（CASIO）</span>
                </a>
              </li>
            </ul>
          </div>
      <!--一级菜单循环从这里结束 ，动态循环显示一级菜单-->

      <!--一级菜单循环从这里开始 ，动态循环显示一级菜单-->
      <div class="sidebar-nav">
        <div class="sidebar-title">
          <a href="#">
            <span class="icon"><b class="fl icon-arrow-down"></b></span>
            <span class="text-normal">分类：</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->

          <li>
            <a href="FindCommodityByLevelServlet?level=入门级">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">入门级</span>
            </a>
            </li>
          <li>
            <a href="FindCommodityByLevelServlet?level=中高级">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">中高级</span>
            </a>
          </li>
          <li>
            <a href="FindCommodityByLevelServlet?level=中高级">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">中端</span>
            </a>
          </li>
          <li>
            <a href="FindCommodityByLevelServlet?level=专业级">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">专业级</span>
            </a>
          </li>
        </ul>
      </div>
      <!--一级菜单循环从这里结束 ，动态循环显示一级菜单-->
    </div>
  </div>
  <div class="view-product">
    <div class="authority">
      <div class="authority-head">
        <div class="manage-head">
          <h6 class="layout padding-left manage-head-con">用户管理
            <%--<span class="fr text-small text-normal padding-top">发布时间：2016-07-08</span>
            <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em class="text-main">2.4.0.160708</em></span>
          --%>
          </h6>
          <div class="margin-tb manage-detail-con clearfix">
            <form action="SearchByKeywordServlet">
              <div style="float: right">
                <input type="text" name="keyword" placeholder="关键字" style="border: 1px solid #ccc;height: 30px;width: 175px;border-radius: 3px"/>
                <input type="submit" style="display:  inline-block" class="custom" value="搜索"/>
              </div>
            </form>
          </div>
      </div>
      <div class="authority-content">
        <div class="list-content show">
          <div class="offcial-table tr-border margin-big-top clearfix">
            <div class="tr-th clearfix">
              <div class="th w20">
                相机名称
              </div>
              <div class="th w20">
                分类
              </div>
              <div class="th w20">
                库存
              </div>
              <div class="th w20">
                押金
              </div>
              <div class="th w20">
                操作
              </div>
            </div>
            <c:forEach var="c" items="${list1}" varStatus="rs">
              <div class="tr clearfix border-bottom-none">
                <div class="td w20">
                  <span class="text-normal"> ${c.cname}</span>
                </div>
                <div class="td w20">
                  <span class="text-normal"> ${c.collocationInfo.level}</span>
                </div>
                <div class="td w20">
                  <span class="text-normal">  ${c.stock}</span>
                </div>
                <div class="td w20">
                  <span class="text-normal"> ${c.deposit}</span>
                </div>
                <div class="td w20">
                  <a href="findcommentbycommodity?cid=${c.cid}"  class="button-word2 btn_ajax_confirm">查看详细信息</a>
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
                <li><span class="fl">共<em class="margin-small-left margin-small-right">1</em>页</span></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
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

</html>