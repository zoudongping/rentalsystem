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
      <div class="view-product">
        <div class="authority">
          <div class="authority-head">
            <div class="manage-head">
              <h6 class="layout padding-left manage-head-con">评论信息
              </h6>
            </div>
          </div>
          <div class="authority-content">
            <div class="list-content show">
              <div class="offcial-table tr-border margin-big-top clearfix">
                <div class="tr-th clearfix">
                  <div class="th w25">
                    评论商品名
                  </div>
                  <div class="th w25">
                    评论等级
                  </div>
                  <div class="th w30">
                    评论内容
                  </div>
                  <div class="th w20">
                    评论人
                  </div>
                </div>
                <c:forEach var="c" items="${clist}">
                  <div class="tr clearfix border-bottom-none">
                    <div class="td w25">
                        ${c.commodityinfo.cname}
                    </div>
                    <div class="td w25">
                        ${c.levelinfo.lname}
                    </div>
                    <div class="td w30">
                        ${c.content}
                    </div>
                    <div class="td w20">
                        ${c.userinfo.uname}
                    </div>
                  </div>
                </c:forEach>
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