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
      <form action="#" method="post">
        <table>
          <tr>
            <td>
              <input class="width-main input" type="text" name="search" datatype="*" placeholder="请输入你的最爱...">
            </td>
            <td>
              <input class="width-mains input"  type="button" value="搜索">
            </td>
          </tr>
        </table>
      </form>
    </div>
  </div>
  <div class="topbar-info">
    <ul class="fr">

      <li class="fl topbar-info-item">
        <div class="dropdown">
          <a href="#" class="topbar-btn">
            <span class="fl text-normal">${manager.mname}</span>
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
            <span class="text-normal">菜单</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->
          <li>
            <a href="toShowUser">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">用户管理</span>
            </a>
          </li>
          <li>
            <a href="FindAllCommodityServlet">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">商品管理</span>
            </a>
          </li>
          <li>
            <a href="findallorder">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">订单管理</span>
            </a>
          </li>
          <li>
            <a href="getcontractinfo">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">合同管理</span>
            </a>
          </li>
          <li>
            <a href="showcomment.jsp">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">商品评论</span>
            </a>
          </li>
          <li>
            <a href="showtransinfo.jsp">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">交易记录</span>
            </a>
          </li>
          <li>
            <a href="findoperation">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">操作记录</span>
            </a>
          </li>
          <li>
            <a href="findallgeneral">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">总账管理</span>
            </a>
          </li>
          <li>
            <a href="toUpdateManagerPwd.html">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">修改密码</span>
            </a>
          </li>
        </ul>
        <!--一级菜单循环从这里结束 ，动态循环显示一级菜单-->
      </div>
    </div>
  </div>

  <div class="view-product">
    <div class="authority">
      <div class="authority-head">
        <div class="manage-head">
          <h6 class="layout padding-left manage-head-con">用户管理
            <span class="fr text-small text-normal padding-top">发布时间：2016-07-08</span>
            <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em class="text-main">2.4.0.160708</em></span>
          </h6>
        </div>
      </div>
      <div class="company_identify">
        <div class="manage-head">
          <h6 class="padding-left manage-head-con">用户状态信息</h6>
        </div>
        <form name="setp0" action="toUpdateUserStatus" method="post" autocomplete="off">

          <div class="authority-content">
            <div class="list-content show">
              <div class="offcial-table tr-border margin-big-top clearfix">
                <div class="text-center height-main margin-top-25">
                  <p class="content-left-zoon">
                    信用状态：
                  </p>
                  <div class="content-right-zoon">
                    <select class="width-main select " name="status">
                      <option value="1">信用状态不良，禁用</option>
                      <option value="2">信用状态良好，启用</option>
                    </select>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="unit-style padding-large-tb clearfix">
            <div class="margin-large-top padding-left text-left content-right-zoon">
              <input type="submit" value="确认修改用户状态" class="submit fl">
              <a href="toShowUser" class="submit fl margin-large-left">取消</a>
            </div>
          </div>
        </form>
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