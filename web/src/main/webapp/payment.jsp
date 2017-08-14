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
                <span class="text-normal">单反品牌类别</span>
              </a>
            </div>
            <ul class="sidebar-trans">
              <!--二级菜单循环从这里开始 ，动态循环显示二级菜单-->
                  <li>
                    <a href="#">
                      <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                      <span class="text-normal">佳能（Canon）</span>
                    </a>
                  </li>
              <li>
                <a href="#">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">尼康（Nikon）</span>
                </a>
              </li>
              <li>
                <a href="#">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">宾得（PENTAX）</span>
                </a>
              </li>
              <li>
                <a href="#">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">徕卡（Leica）</span>
                </a>
              </li>
              <li>
                <a href="#">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">索尼（SONY）</span>
                </a>
              </li>
              <li>
                <a href="#">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">Panasonic </span>
                </a>
              </li>
              <li>
                <a href="#">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">威图</span>
                </a>
              </li>
              <li>
                <a href="#">
                  <b class="sidebar-icon"><img src="Images/icon_author.png" width="16" height="16" /></b>
                  <span class="text-normal">其他</span>
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
            <span class="fr text-small text-normal padding-top">发布时间：2016-07-08</span>
            <span class="fr margin-large-right padding-top text-small text-normal">最新版本：<em class="text-main">2.4.0.160708</em></span>
          </h6>
        </div>
      </div>
      <div class="company_identify">
        <div class="manage-head">
          <h6 class="padding-left manage-head-con">支付信息</h6>
        </div>
        <form name="setp0" action="#" method="post" autocomplete="off">

          <div class="authority-content">
            <div class="list-content show">
              <div class="offcial-table tr-border margin-big-top clearfix">
                <h4 class="real-name-head margin-large-top">支付信息</h4>
                <div class="tr-th clearfix">
                  <div class="th w10">
                    订单时间
                  </div>
                  <div class="th w10">
                    订单状态
                  </div>
                  <div class="th w20">
                    租用商品
                  </div>
                  <div class="th w10">
                    租赁商品数量
                  </div>
                  <div class="th w10">
                    租赁类型
                  </div>
                  <div class="th w10">
                    押金
                  </div>
                  <div class="th w10">
                    租金
                  </div>
                  <div class="th w20">
                    订单总金额
                  </div>
                </div>

                <div class="tr clearfix border-bottom-none">
                  <div class="td w10">
                    ${o.otime}
                  </div>
                  <div class="td w10">
                    ${o.orderstatusinfo.sname}
                  </div>
                  <div class="td w20">
                    ${o.commodityinfo.cname}
                  </div>
                  <div class="td w10">
                    ${o.rentalamount}
                  </div>
                  <div class="td w10">
                    ${o.rentaltypeinfo.tname}
                  </div>
                  <div class="td w10">
                    ${o.deposit}
                  </div>
                  <div class="td w10">
                    ${o.ordertotal-o.deposit}
                  </div>
                  <div class="td w20">
                     ${o.ordertotal}
                  </div>
                </div>
                <div class="real-name-con height-main margin-top-25">
                  <p class="content-left-zoon">
                    支付方式
                  </p>
                  <div class="content-right-zoon">
                    <select class="width-main select " name="payment">
                      <option value="1">银行卡支付</option>
                      <option value="2">支付宝支付</option>
                      <option value="3">微信支付</option>
                    </select>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <div class="unit-style padding-large-tb clearfix">
            <div class="margin-large-top padding-left text-left content-right-zoon">
              <input type="submit" value="确认支付" class="submit fl">
              <a href="#" class="submit fl margin-large-left">取消</a>
            </div>
          </div>
        </form>
      </div>

      <div class="authority-content">
        <div class="list-content show">
          <div class="offcial-table tr-border margin-big-top clearfix">
            <h4 class="real-name-head margin-large-top">合同信息</h4>
            <div class="tr-th clearfix">
              <div class="th w10">
                起租时间
              </div>
              <div class="th w10">
                结租时间
              </div>
              <div class="th w15">
                甲方
              </div>
              <div class="th w10">
                乙方
              </div>
              <div class="th w9">
                违约金
              </div>
              <div class="th w20">
                合同状态
              </div>
              <div class="th w20">
                合同内容
              </div>
            </div>

              <div class="tr clearfix border-bottom-none">
                <div class="td w10">
                  ${c.beginrentdate}
                </div>
                <div class="td w10">
                  ${c.overrentdate}
                </div>
                <div class="td w15">
                  ${c.firstparty}
                </div>
                <div class="td w10">
                  ${c.secondparty}
                </div>
                <div class="td w9">
                  ${c.penalty}
                </div>
                <div class="td w20">
                  未生效，支付成功才会生效
                </div>
                <div class="td w20">
                  ${c.content}
                </div>
              </div>
          </div>
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