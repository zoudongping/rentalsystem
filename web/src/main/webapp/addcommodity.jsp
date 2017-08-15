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
      <a href="managercentral.jsp" class="topbar-home-link topbar-btn text-center fl"><span>管理中心</span></a>
    </div>
  </div>
  <div class="topbar-info">
    <ul class="fr">

      <li class="fl topbar-info-item">
        <div class="dropdown">
          <a href="managercentral.jsp" class="topbar-btn">
            <span class="fl text-normal">${manager.mname}</span>
            <span class="icon-arrow-down"></span>
          </a>
          <ul class="dropdown-menu">
            <li><a href="managerlogin.html">退出</a></li>
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
            <span class="text-normal">品牌</span>
          </a>
        </div>
        <ul class="sidebar-trans">
          <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->

          <li>
            <a href="${child_r.resurl}">
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">佳能</span>
            </a>
          </li>
          <li>
            <a href="${child_r.resurl}" >
              <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
              <span class="text-normal">索尼</span>
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
          <h6 class="layout padding-left manage-head-con">增加相机
          </h6>
        </div>
      </div>
      <form name="setp0" action="AddCommodityServlet" method="post" autocomplete="off">
        <div class="basic-info-detail clearfix">

          <div class="unit-style padding-big-lr clearfix">
            <h4 class="real-name-head margin-large-top">基本信息</h4>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                相机名称
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="cname" >
              </div>
            </div>

            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                日租价格
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="dayprice">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                月租价格
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="monthprice" >
              </div>
            </div>

            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                年租价格
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="yearprice">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                押金
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="deposit" >
              </div>
            </div>

            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                配置级别
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="collocation">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                库存
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="stock" >
              </div>
            </div>

            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                品牌
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="brand">
              </div>
            </div>
            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                单个成本
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="singlecost">
              </div>
            </div>

            <div class="real-name-con height-main margin-top-25">
              <p class="content-left-zoon">
                图片编号
              </p>
              <div class="content-right-zoon">
                <input class="width-main input" type="text" name="image">
              </div>
            </div>

            <div class="unit-style padding-big-lr clearfix">
              <h4 class="real-name-head margin-large-top">配置信息</h4>
              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  级别
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="level">
                </div>
              </div>

              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  屏幕尺寸
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="screensize">
                </div>
              </div>
              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  颜色
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="color">
                </div>
              </div>

              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  像素
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="pixel">
                </div>
              </div>
              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  成色
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="condition">
                </div>
              </div>

              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  传感器
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="sensor">
                </div>
              </div>
              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  电池类型
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="battery">
                </div>
              </div>

          </div>
            <div class="unit-style padding-big-lr clearfix">
              <h4 class="real-name-head margin-large-top">图片列表</h4>
              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  图片地址1
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="image1">
                </div>
              </div>

              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  图片地址2
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="image2">
                </div>
              </div>
              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  图片地址3
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="image3">
                </div>
              </div>

              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  图片地址4
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="image4">
                </div>
              </div>
              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  图片地址5
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="image5">
                </div>
              </div>

              <div class="real-name-con height-main margin-top-25">
                <p class="content-left-zoon">
                  图片地址6
                </p>
                <div class="content-right-zoon">
                  <input class="width-main input" type="text" name="image6">
                </div>
              </div>
            </div>
        </div>
        <div class="unit-style padding-large-tb clearfix">
          <div class="margin-large-top padding-left text-left content-right-zoon">
            <input type="submit" value="确认" class="submit fl">
          </div>
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

</html>