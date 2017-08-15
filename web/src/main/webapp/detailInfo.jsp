<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html >
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>首页</title>
  <meta name="keywords" content="首页" />
  <meta name="description" content="首页" />
  <link rel="stylesheet" type="text/css" href="Css/normalize.css"/>
  <script type="text/javascript" src="Js/jquery-1.9.1.min.js"></script>
  <script src="Js/common.js" type="text/javascript" charset="utf-8"></script>
  <script type="text/javascript">
    $(document).ready(function(){
      var showproduct = {
        "boxid":"showbox",
        "sumid":"showsum",
        "boxw":400,//宽度,该版本中请把宽高填写成一样
        "boxh":400,//高度,该版本中请把宽高填写成一样
        "sumw":60,//列表每个宽度,该版本中请把宽高填写成一样
        "sumh":60,//列表每个高度,该版本中请把宽高填写成一样
        "sumi":7,//列表间隔
        "sums":5,//列表显示个数
        "sumsel":"sel",
        "sumborder":1,//列表边框，没有边框填写0，边框在css中修改
        "lastid":"showlast",
        "nextid":"shownext"
      };//参数定义
      $.ljsGlasses.pcGlasses(showproduct);//方法调用，务必在加载完后执行
    });
  </script>
</head>
<body>
<div class="showall">
  <!--left -->
  <div class="showbot">
    <div id="showbox">
      <img src="${c.imageList.image1}" width="400" height="400" />
      <img src="${c.imageList.image2}" width="400" height="400" />
      <img src="${c.imageList.image3}" width="400" height="400" />
      <img src="${c.imageList.image4}" width="400" height="400" />
      <img src="${c.imageList.image5}" width="400" height="400" />
    </div><!--展示图片盒子-->
    <div id="showsum">
      <!--展示图片里边-->
    </div>
    <p class="showpage">
      <a href="javascript:void(0);" id="showlast"> < </a>
      <a href="javascript:void(0);" id="shownext"> > </a>
    </p>
  </div>
  <!--conet -->
  <form action="#">
  <div class="tb-property">
    <div class="tr-nobdr">
      <%--相机名称--%>
      <h3>
        <span class="text-normal"> ${c.cname}</span>
      </h3>
    </div>
    <div class="txt">
      <span class="nowprice">￥<a href="">${c.singlecost}</a></span>
      <div class="cumulative">
        <span class="number ty1">累计租出<br /><em id="add_sell_num_363">370</em></span>
        <span class="number tyu">累计评价<br /><em id="add_sell_num_363">25</em></span>
      </div>
    </div>
    <div class="txt-h">
      <span class="tex-o">租赁类型</span>
      <ul class="glist" id="glist" data-monitor="goodsdetails_fenlei_click">
        <select style="font-size: medium;" name="price">
          <option selected value="dayprice">日租价格：${c.dayprice}</option>
          <option value="monthprice">月租价格：${c.monthprice}</option>
          <option value="yearprice">年租价格:${c.yearprice}</option>
        </select>
        <%--<li><a title="红色36g" href="">红色36g</a></li>
        <li><a title="蓝色16g" href="">红色36g</a></li>--%>
        <!--<li><a title="红色36g" href="">红色36g</a></li>
            <li><a title="蓝色16g" href="">红色36g</a></li>-->
      </ul>
    </div>
    <div class="gcIpt">
      <span class="guT">租赁时间</span>
      <input type="text" placeholder="" name="time" nullmsg="请填写租赁时间">
    </div>
    <script>
      $(document).ready(function(){
        var t = $("#text_box");
        $('#min').attr('disabled',true);
        $("#add").click(function(){
          t.val(parseInt(t.val())+1)
          if (parseInt(t.val())!=1){
            $('#min').attr('disabled',false);
          }

        })
        $("#min").click(function(){
          t.val(parseInt(t.val())-1);
          if (parseInt(t.val())==1){
            $('#min').attr('disabled',true);
          }

        })
      });
    </script>
    <div class="gcIpt">
      <span class="guT">数量</span>
      <input id="min" name="" type="button" value="-" />
      <input id="text_box" name="number" type="text" value="1"style="width:30px; text-align: center; color: #0F0F0F;"/>
      <input id="add" name="" type="button" value="+" />
      <span class="Hgt">库存（${c.stock}）</span>
    </div>
    <div class="nobdr-btns">
      <%--<button class="addcart hu"><img src="Images/shop.png" width="25" height="25"/>加入购物车</button>--%>
      <button class="addcart yh"><img src="Images/ht.png" width="25" height="25"/>确认下单</button>
    </div>
    <%--<div class="guarantee">--%>
      <%--<span>邮费：包邮&nbsp;&nbsp;支持货到付款 <a href=""><img src="images/me.png"/></a></span>--%>
    <%--</div>--%>
  </div>
</form>
  <!--订单头右边空白处right -->
  <div class="extInfo">




  </div>
</div>
<!-- 推荐搭配 -->
<div class="gdetail">

  <div class="dp_wrap">
    <!-- 结算 -->
    <!-- 搭配1 -->
    <!-- 搭配2 -->
    <!-- 搭配3 -->
    <!-- 搭配4 -->
    <div class="dp_prd">
      <!-- 产品结束 -->
    </div>
  </div>
</div>

<!-- 商品介紹 -->
<div class="gdetail">
  <!-- left -->
  <div class="aside">
    <h3>看了还看<span><img src="Images/fod.png"width="22" height="22"/>换一批</span></h3>
    <dl class="ac-mod-list">
      <dt><a href=""><img src="Images/photos/small_sony1.png"/></a></dt>
      <dd>
        O2+索尼（SONY） DSC-H400 长焦数码相机
        <span>￥1949</span>
      </dd>
    </dl>
    <dl class="ac-mod-list">
      <dt><a href=""><img src="Images/photos/small_canon1.png"/></a></dt>
      <dd>
        O2+佳能（Canon）EOS 800D 单反套机
        <span>￥5499</span>
      </dd>
    </dl>
    <dl class="ac-mod-list">
      <dt><a href=""><img src="Images/photos/small_nikon1.png"/></a></dt>
      <dd>
        O2+尼康（Nikon）D5300套机
        <span>￥4799</span>
      </dd>
    </dl>
  </div>
  <!-- right -->
  <script>
    var detail = document.querySelector('.detail');
    var origOffsetY = detail.offsetTop;
    function onScroll(e) {
      window.scrollY >= origOffsetY ? detail.classList.add('sticky') :
              detail.classList.remove('sticky');
    }
    document.addEventListener('scroll', onScroll);
  </script>
  <div class="detail">
    <div class="active_tab" id="outer">
      <ul class="act_title_left" id="tab">
        <li class="act_active">
          <a href="#">规格参数</a>
        </li>
        <li>
          <a href="#">商品介绍</a>
        </li>
        <li>
          <a href="#">商品评价</a>
        </li>
        <li>
          <a href="#">售后保障</a>
        </li>
      </ul>
      <ul class="act_title_right">

      </ul>
      <div class="clear"></div>
    </div>
    <div id="content" class="active_list">
      <!--1.规格参数-->
      <div id="ui-a" class="ui-a">
        <ul style="display:block;">
          <li>相机名称：${c.cname}</li>
          <li>相机编号：${c.cid}</li>
          <li>品牌：${c.brand}</li>
          <li>单反级别：${c.collocationInfo.level}</li>
          <li>屏幕尺寸：${c.collocationInfo.screensize}</li>
          <li>颜色：${c.collocationInfo.color}</li>
          <li>像素：${c.collocationInfo.pixel}</li>
          <li>成色：${c.collocationInfo.condition}</li>
          <li>传感器：${c.collocationInfo.sensor}</li>
          <li>电池类型：${c.collocationInfo.battery}</li>

<%--          <li>上架时间：2016-05-24</li>--%>
          <%--<li>商品毛重：0克</li>--%>
          <%--<li>库存：${c.stock} </li>--%>
          <li><img src="${c.imageList.image6}" width="400" height="400" /></li>
        </ul>
      </div>
      <!--2.商品介绍-->
      <div id="bit" class="bit">
        <ul style="display:none;">
          <p>商品介绍</p>
        </ul>
      </div>

      <!--3.商品评价-->
      <div id="ui-c" class="ui-c">
        <ul style="display:none;">
          <p>商品评价</p>
        </ul>
      </div>
      <!--4.售后保障-->
      <div id="uic" class="uic">
        <ul style="display:none;">
          <p>售后保障</p>
        </ul>
      </div>
    </div>
    <script>
      $(function(){
        window.onload = function()
        {
          var $li = $('#tab li');
          var $ul = $('#content ul');

          $li.mouseover(function(){
            var $this = $(this);
            var $t = $this.index();
            $li.removeClass();
            $this.addClass('act_active');
            $ul.css('display','none');
            $ul.eq($t).css('display','block');
          })
        }
      });
    </script>
  </div>
</div>

</body>
</html>