<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  style="text-align:center;">

<head>
  <link rel="icon" href="favicon.ico" mce_href="favicon.ico" type="image/x-icon"/> 
  <meta http-equiv="Content-Type" content="text/html; charset=GBK" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=0.4, user-scalable=no" />  <!-- 移动端用户不可缩放页面 -->
  <title>华工xx同乡会</title>
  <link rel="stylesheet" type="text/css" href="css/ActionHomePage/style.css" />
  <link rel="stylesheet" type="text/css" href="css/public/grid-slider.css" />

  <script src="js/public/jquery-2.1.4.min.js"></script>
  <script src="js/ActionHomePage/script.js"></script>
  
  <link rel="stylesheet" href="css/orbit-1.2.3.css">
  <link rel="stylesheet" href="css/lanrenzhijia.css">
  <script type="text/javascript" src="js/jquery.orbit-1.2.3.min.js"></script>

  <link rel="stylesheet" type="text/css" href="css/public/style.css" media="screen" />
	<script type="text/javascript" src="js/public/jquery-1.8.3.min.js"></script>
	<script type="text/javascript" src="js/public/jquery.banner.revolution.min.js"></script>
	<script type="text/javascript" src="js/public/banner.js"></script>
  
  <script type="text/javascript">
     //var w=window.innerWidth|| document.documentElement.clientWidth|| document.body.clientWidth;
     //if(parseFloat(w)>768){
		$(window).load(function() {
			$('#featured').orbit();
		});

        window.onresize=function(){  
                 window.setTimeout("ctop();",200);
        } 
	 //}
	 /**
	 window.onload=function(){
		 var w=window.innerWidth
         || document.documentElement.clientWidth
         || document.body.clientWidth;
         var _w = parseInt(w);
         
            var userAgentInfo = navigator.userAgent; 
            var Agents = new Array("Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod"); 
            var flag = true; 
            for (var v = 0; v < Agents.length; v++) { 
                if (userAgentInfo.indexOf(Agents[v]) > 0) { flag = false; break; } 
            }      

		 if(_w>1200 && flag){
		   var v = (_w -1200)/2;
		   _w = 1200;
		   $("#wrap").css("margin-left",v+"px");
           $("#wrap").css("margin-right",v+"px");
		 }else if(_w<786 && flag){
			$("#topLogo").css("display","block");
		   	$("#topBtn").css("visibility","hidden");    //尺寸过低隐藏按钮
	        $("#otherContent").css("visibility","hidden");   //尺寸过低隐藏内容
		 }else if(_w<400 && flag){
			//$("body").css("background-color","#FFFFFF");
            $(".blackC_t").css("visibility","hidden");			
            $(".topbar").css("visibility","hidden");
			//$(".fillContent").css("background-image","url()");
			$("#topLogo").css("display","block");
		   	$("#topBtn").css("visibility","hidden");    //尺寸过低隐藏按钮
	        $("#otherContent").css("visibility","hidden");   //尺寸过低隐藏内容
		 }else{                                             //移动端访问页面格局自适应
			$(".top").css("box-shadow","0px 0px 0px 0px");
            $("#introimgf").css("width","15%");
            $("#introimgs").css("width","15%");
            $("#introimgt").css("width","15%");
            $("#logoimg").css("height","25%");

			$("#content").css("left","5%");
            $("#content").css("margin-top","10%");
			$(".xbi").css("font-size","0.6em");
			$("body").css("background-color","#FFFFFF");
            $(".blackC_t").css("visibility","hidden");			
            $(".topbar").css("visibility","hidden");

			$(".floatInfo").css("display","none");     //移动端隐藏浮动微信二维码

			//$(".fillContent").css("background-image","url()");
			$("#topLogo").css("display","block");
		   	$("#topBtn").css("visibility","hidden");    //尺寸过低隐藏按钮
	        $("#otherContent").css("visibility","hidden");   //尺寸过低隐藏内容
			$("#foot").css("visibility","hidden");
			$("hr").css("visibility","hidden");
            $(".floatInfo").css("display","none");    //隐藏浮动微信二维码
            
            $("#sp").css("display","block");
            $("#wechat").css("display","block");
		 }

		 $(".top").css("width",_w);
		 $(".top").css("height",_w*0.5);

         $(".blackC_t").css("width",_w);
         $(".blackC_t").css("height",_w*0.1);
		 $(".topbar").css("width",_w);		 
		 $(".topbar").css("height",_w*0.1);
		 
		 $("#v").css("top",_w*0.5);
		 $("#v").css("height",_w*2);
         $("#v").css("width",_w);

         var _w_foot = _w*2+_w*0.5;
		 $("#foot").css("top",_w_foot);
		 $("#foot").css("width",_w);		 
		 $("#foot").css("height",_w/4);
		 
	 }**/
  </script>    

</head>

<body style="text-align:center;">
 <div id="wrap" style="border-radius:8px;left:0px;top:0px;position:absolute;">
  <div class="floatInfo" onclick="clickFI($(this));" onmouseover="ccg($(this));" onmouseout="cc_1($(this));">
  </div>
  <div class="top">
    <div class="fillContent" style="background-size: 100% auto;background-repeat: no-repeat;">
	   <!--<img  style="max-width:100%;" class="fillContent" src="http://images.macx.cn/forum/201410/23/091432yk20q1qbko04xy94.jpg"/>-->
	</div>
	<div class="blackC">
	</div>
	<div class="blackC_t">
	</div>
	<div id="tbar" class="topbar">
	  <div style="display:inline;">
	     <img style="max-width:8.296%;max-height:80%;vertical-align: middle;width:8.296%;height:80%;" src="image/homepage/u6.png"/>
	  </div>
	  <div style="font-family:微软雅黑;color:#FF9900;display:inline;">
	     <div style="display:inline;">
		   <span>
	          <strong>华工xx同乡会</strong>
	       </span>
		 </div>
		 <div style="padding-left:18%;display:inline;">
		   <div class="barEl" onmouseover="cc($(this))" onmouseout="ccb($(this))"style="color:#00CCFF;" onclick="window.location = 'http://139.129.24.81:8082/scuthnhtml/html/homepage/homepage.html';">首页</div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccg($(this))"style="color:#CCFF00;" onclick="window.location = 'http://139.129.24.81:8082/scuthnhtml/html/ActionHomePage/actionHomePage.html';">活动中心</div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccr($(this))">资讯</div>&nbsp;&nbsp;&nbsp;
           <%
	            String i = (String)session.getAttribute("user_account");
	           	if(i==null)
	           		out.print("<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccb($(this))\" style=\"color:#00CCFF;\" onclick=\"window.location='pfs?p=login/login.jsp';\">登录</div>&nbsp;&nbsp;&nbsp;"+
	 	                      "<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccg($(this))\" onclick=\"window.location='pfs?p=register/register.jsp';\" style=\"color:#CCFF00;\">注册</div>&nbsp;&nbsp;&nbsp;");
	           	else
	           		out.print("<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccb($(this))\" style=\"color:#00CCFF;\" onclick=\"window.location='CheckUserInfo';\" >"+i+"</div>&nbsp;&nbsp;&nbsp;"+
	 	                      "<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccg($(this))\" onclick=\"window.location='LoginOut';\" style=\"color:#CCFF00;\">退出</div>&nbsp;&nbsp;&nbsp;");	            
	 	    %>
		 </div>
	  </div>
    </div>
    
	<div id="content" style="position:absolute;Z-index:99;margin-top:15%;left:21%;color:#FF9900;font-size:2.5em;font-family:华文楷体;">
	       <div id="topLogo" style="display:inline;">
		     <img id="logoimg" style="max-width:100%;max-height:100%;vertical-align:middle;width:20%;height:20%;" src="image/ActionHomePage/u64.png"/>
		   </div>
		   <span class="xbi">
		     <strong>活动中心</strong>
		   </span><br/></br>
		   <span id="otherContent" class="xsi" style="font-family:微软雅黑;color:#E4E4E4;">
		     <strong>加入华工XX同乡会,和我们一起成长吧!</strong>
		   </span>
		   <div id="topBtn" style="height:3em;width:40%;border-width:0.1em;cursor:pointer;border-color:#FF9900;color:#FF9900;border-style:solid;border-radius:19px;font-size:0.5em;margin-left:auto;margin-right:auto;margin-top:2%;" onmousemove="cover();" onmouseout="cout();" onclick="var pos = $('#v').offset().top;$('html,body').animate({ scrollTop: pos },300);">
		     <div style="padding-top:8%;">
		        <span class="xsi" style="font-family:微软雅黑;">
			      <strong>进入主题看看</strong>
			    </span>
			 </div>
		   </div>
	</div>

  </div>

  <div id="v" style="position:absolute;left:0px;top:72%;width:100%;height:100%;background-color:#FFFFFF;">
     <div id="title1" style="width:100%;height:5%;background-color:#FF9900;">
	     <img src="image/ActionHomePage/relax1.jpg" style="width:10%;height:100%;max-width:10%;vertical-align:middle;"/>
		 <span class="si" style="font-family:微软雅黑;color:#FFFFFF;padding: 0% 10% 0% 10%;">
		     <strong>近期活动</strong>
		 </span>
         <img src="image/ActionHomePage/swim.jpg" style="width:8%;height:60%;max-width:8%;vertical-align:middle;"/>
	 </div>
	 
	 <!--
	 <div id="actions" style="cursor:pointer;text-align:center;padding:10% 0% 3% 0%;background-image:url(../../image/ActionHomePage/u66.jpg);background-size:100% 100%;
;width:80%;height:20%;margin: 2% 10% 2% 10%;box-shadow:0px 0px 8px 0px;" onclick="window.location='singleActionInfo/singleActionInfo.html';">
        <div style="margin-top:-12.5%;text-align:center;width:100%;height:20%;background-color:#000000;opacity:.5;">
		</div>
		<div style="margin-top:-8%;color:#FF9900;">
		   <span class="si" style="font-family:微软雅黑;">
		       <strong>同乡会出游活动</strong>
		   </span>
		</div>
		<div style="margin-top:51%;text-align:center;width:100%;height:20%;background-color:#000000;opacity:.5;">
		   <div style="cursor:pointer;padding-top:2%;">
		      <img style="width:5%;max-width:20%;vertical-align:middle;" src="../../image/ActionHomePage/stare_1.png">
		      <span class="si" style="color:#00CCFF;font-family:微软雅黑;">
		          <strong>关注该活动</strong>
		      </span>
		   </div>
		</div>
	 </div>
-->
	<div id="wrapper1"  style="margin-bottom:5%;">
		<div class="fullwidthbanner-container">
			<div class="fullwidthbanner">
				<ul>
					<li data-transition="3dcurtain-horizontal" data-slotamount="15" data-masterspeed="300">
						<img src="image/public/slides/slide3.jpg" alt="" />									
					</li>
					<li data-transition="3dcurtain-vertical" data-slotamount="15" data-masterspeed="300" data-link="#">
						<img src="image/public/slides/slide5.jpg" alt="" />
					</li>
					<li data-transition="papercut" data-slotamount="15" data-masterspeed="300" data-link="#">
						<img src="image/public/slides/slide2.jpg" alt="" />
					</li>
					<li data-transition="turnoff" data-slotamount="15" data-masterspeed="300">
						<img src="image/public/slides/slide1.jpg" alt="" />
					</li>	
					<li data-transition="flyin" data-slotamount="15" data-masterspeed="300">
						<img src="image/public/slides/slide6.jpg" alt="" />	 
					</li>					
				</ul>
			</div>
		</div>
	</div>
	 <div id="actsList" style="text-align:center;padding:0% 0% 5% 0%;font-family:微软雅黑;">
	    <div class="si" style="margin-left: 45%;width:10%;color:#FFFFFF;background-color:#FF9900;border-radius:6px 6px 0px 0px;">
		   <strong>全部活动</strong>
		</div>
		<hr style="margin-top:-1px;border:3px solid #FF9900;width:60%;"/>
		<div id="actsListsContent">
	      <ul style="display:inline-block;list-style:none;width:30%;text-align:left;">
		     <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
				    同乡会出游活动
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
                   清补凉DIY
				</div>
			 </li>
             <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       创新创业
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       考研经验专题会
				</div>
			 </li>
             <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       ACM经验专题会
				</div>
			 </li>
		     <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       四叶草运动会
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       同乡会实习经验专题会
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       同乡会技术竞赛组队沙龙
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       同乡会技术团队招新
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       阿拉阿拉阿拉阿拉阿拉
				</div>
			 </li>
		  </ul>
		  <ul style="display:inline-block;list-style:none;">
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名结束...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	进行中...
		  	 </li>		  	 
		  	 <li>
		  	 	进行中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>
		  </ul>
		  <div>
		    <span style="cursor:pointer;width:5%;border-radius:3px;background-color:#FF9900;color:#FFFFFF;" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbcr($(this));cc($(this));">
		      上一页
		    </span>
            <span style="cursor:pointer;margin-left:10%;width:5%;border-radius:3px;background-color:#FF9900;color:#FFFFFF;" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbcr($(this));cc($(this));">
		      下一页
		    </span>
		  </div>
	   </div>
	   <hr style="border:3px solid #FF9900;width:60%;"/>
	 </div>
	 <div id="title2" style="border-style:solid;border-color:#FFFFFF;border-width:15px 0px 0px 0px;width:100%;height:5%;background-color:#FF9900;">
	     <img src="image/ActionHomePage/dopin.jpg" style="width:10%;height:70%;max-width:10%;vertical-align:middle;"/>
		 <span class="si" style="font-family:微软雅黑;color:#FFFFFF;padding: 0% 10% 0% 10%;">
		     <strong>活动相册</strong>
		 </span>
         <img src="image/ActionHomePage/shark.jpg" style="width:8%;height:60%;max-width:8%;vertical-align:middle;"/>
	 </div>

	<div id="wrapper2" style="margin-bottom:5%;">
		<div class="fullwidthbanner-container">
			<div class="fullwidthbanner">
				<ul>
					<li data-transition="3dcurtain-horizontal" data-slotamount="15" data-masterspeed="300">
						<img src="image/public/slides/slide3.jpg" alt="" />									
					</li>
					<li data-transition="3dcurtain-vertical" data-slotamount="15" data-masterspeed="300" data-link="#">
						<img src="image/public/slides/slide5.jpg" alt="" />
					</li>
					<li data-transition="papercut" data-slotamount="15" data-masterspeed="300" data-link="#">
						<img src="image/public/slides/slide2.jpg" alt="" />
					</li>
					<li data-transition="turnoff" data-slotamount="15" data-masterspeed="300">
						<img src="image/public/slides/slide1.jpg" alt="" />
					</li>	
					<li data-transition="flyin" data-slotamount="15" data-masterspeed="300">
						<img src="image/public/slides/slide6.jpg" alt="" />	 
					</li>					
				</ul>
			</div>
		</div>
	</div>

	<div id="albumsList" style="text-align:center;padding:0% 0% 5% 0%;font-family:微软雅黑;">
	    <div class="si" style="margin-left: 45%;width:10%;color:#FFFFFF;background-color:#FF9900;border-radius:6px 6px 0px 0px;">
		   <strong>全部相册</strong>
		</div>
		<hr style="margin-top:-1px;border:3px solid #FF9900;width:60%;"/>
		<div id="albumsListsContent">
	      <ul style="display:inline-block;list-style:none;width:30%;text-align:left;">
		     <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
				    同乡会出游活动
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
                   清补凉DIY
				</div>
			 </li>
             <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       创新创业
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       考研经验专题会
				</div>
			 </li>
             <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       ACM经验专题会
				</div>
			 </li>
		     <li>
			    <div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       四叶草运动会
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       同乡会实习经验专题会
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       同乡会技术竞赛组队沙龙
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       同乡会技术团队招新
				</div>
			 </li>
             <li>
			 	<div class="action" onmouseover="msonAction($(this));" onmouseout="msoutAction($(this));">
   			       阿拉阿拉阿拉阿拉阿拉
				</div>
			 </li>
		  </ul>
		  <ul style="display:inline-block;list-style:none;">
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名结束...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>		  	 
		  	 <li>
		  	 	进行中...
		  	 </li>		  	 
		  	 <li>
		  	 	进行中...
		  	 </li>		  	 
		  	 <li>
		  	 	报名中...
		  	 </li>
		  </ul>
		  <div>
		    <span style="cursor:pointer;width:5%;border-radius:3px;background-color:#FF9900;color:#FFFFFF;" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbcr($(this));cc($(this));">
		      上一页
		    </span>
            <span style="cursor:pointer;margin-left:10%;width:5%;border-radius:3px;background-color:#FF9900;color:#FFFFFF;" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbcr($(this));cc($(this));">
		      下一页
		    </span>
		  </div>
	   </div>
	   <hr style="border:3px solid #FF9900;width:60%;"/>
	 </div>
     <!--
		<div id="real_album" class="container si" style="">
		  <div id="featured" style="">
			<div class="content" style="">
			  <h1>Orbit does content now.</h1>
			  <h3>Highlight me...I'm text.</h3>
			</div>
			<a href=""  data-caption="#htmlCaption" ><img id="album1" src="images/overflow.jpg""/></a>
			<a href=""><img  id="album2" src="images/captions.jpg"/></a>
			<a href=""><img  id="album3" src="images/features.jpg""/></a>
			<a href=""><img  id="album4" src="../../image/ActionHomePage/shark.jpg""/></a>
		  </div>
		  <span class="orbit-caption" id="htmlCaption">
			<strong>I'm A Badass Caption:</strong> 
			I can haz <a href="#">links</a>, <em>style</em> or anything that is valid markup :)
		  </span> 
		</div>
-->
	 <!-- 
	 <div id="actionsAlbum" style="text-align:center;padding:10% 0% 3% 0%;background-image:url(../../image/ActionHomePage/u1.jpg);background-size:100% 100%;
;width:60%;height:15%;margin: 2% 20% 2% 20%;box-shadow:0px 0px 8px 0px;">
        <div style="margin-top:-16.5%;text-align:center;width:100%;height:20%;background-color:#000000;opacity:.5;">
		</div>
		<div style="margin-top:-8%;color:#FF9900;">
		   <span class="si" style="font-family:微软雅黑;">
		       <strong>同乡会出游活动</strong>
		   </span>
		</div>
		<div style="margin-top:51%;text-align:center;width:100%;height:20%;background-color:#000000;opacity:.5;">
		   <div style="cursor:pointer;padding-top:2%;">
		      <img style="width:5%;max-width:20%;vertical-align:middle;" src="../../image/ActionHomePage/stare_1.png">
		      <span class="si" style="color:#00CCFF;font-family:微软雅黑;">
		          <strong>收藏该相册</strong>
		      </span>
		   </div>
		</div>
	 </div> -->
	 <hr id="sp" style="display:none;width:60%;">
     <div id="wechat" style="display:none;">
        <div>
	       <img src="http://139.129.24.81:8082/scuthnhtml/image/homepage/w3.jpeg">
	    </div>
		<div style="font-family:微软雅黑;width:100%;height:30%;background-color:#CCCCCC;">
		   <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">首页</span></div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">活动</span></div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">资讯</span></div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">管理员中心</span></div>&nbsp;&nbsp;&nbsp;
		   <div>
	         <span class="xsi">备案信息:xxxxxxxxxxxxxxxxxxxxxx</span>
	       </div>
		</div>
     </div>
  </div>
  <div id="foot" style="font-family:微软雅黑;border-radius:6px;box-shadow: 0px 0px 18px 0px;position:absolute;width:100%;height:30%;background-color:#CCCCCC;left:0px;bottom:0px;">   
    <div style="font-family:微软雅黑;margin-top:5%;">  
	  <div>
	     <a target="_blank" href="#"><span class="si">联系我们</span></a>
	  </div>
	  <div style="font-family:微软雅黑;display:inline;">
		   <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">首页</span></div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">活动</span></div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">资讯</span></div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">管理员中心</span></div>&nbsp;&nbsp;&nbsp;
	  </div>
	  <div>
	       <a target="_blank" href="http://www.scut.edu.cn/"><span style="color:#999999;" class="xsi">友情链接:华南理工大学官网</span></a>
	  </div>
	  <div>
	     <span class="xsi">备案信息:xxxxxxxxxxxxxxxxxxxxxx</span>
	  </div>
	</div>
  </div>
 </div>
</body>

<script type="text/javascript">
   		 var w=window.innerWidth
         || document.documentElement.clientWidth
         || document.body.clientWidth;
         var _w = parseInt(w);
         
         //检测是移动端或PC端访问
            var userAgentInfo = navigator.userAgent; 
            var Agents = new Array("Android", "iPhone", "SymbianOS", "Windows Phone", "iPad", "iPod"); 
            var flag = true; 
            for (var v = 0; v < Agents.length; v++) { 
                if (userAgentInfo.indexOf(Agents[v]) > 0) { flag = false; break; } 
            }      

		 if(_w>1200 && flag){
		   var v = (_w -1200)/2;
		   _w = 1200;
		   $("#wrap").css("margin-left",v+"px");
           $("#wrap").css("margin-right",v+"px");
		 }else if(_w<786 && flag){
			$("#topLogo").css("display","block");
		   	$("#topBtn").css("visibility","hidden");    //尺寸过低隐藏按钮
	        $("#otherContent").css("visibility","hidden");   //尺寸过低隐藏内容
		 }else if(_w<400 && flag){
			//$("body").css("background-color","#FFFFFF");
            $(".blackC_t").css("visibility","hidden");			
            $(".topbar").css("visibility","hidden");
			//$(".fillContent").css("background-image","url()");
			$("#topLogo").css("display","block");
		   	$("#topBtn").css("visibility","hidden");    //尺寸过低隐藏按钮
	        $("#otherContent").css("visibility","hidden");   //尺寸过低隐藏内容
		 }else if(!flag){                                             //移动端访问页面格局自适应
			$(".top").css("box-shadow","0px 0px 0px 0px");
            $("#introimgf").css("width","15%");
            $("#introimgs").css("width","15%");
            $("#introimgt").css("width","15%");
            $("#logoimg").css("height","25%");

			$("#content").css("left","5%");
            $("#content").css("margin-top","10%");
			$(".xbi").css("font-size","0.6em");
			$("body").css("background-color","#FFFFFF");
            $(".blackC_t").css("visibility","hidden");			
            $(".topbar").css("visibility","hidden");

			$(".floatInfo").css("display","none");     //移动端隐藏浮动微信二维码

			//$(".fillContent").css("background-image","url()");
			$("#topLogo").css("display","block");
		   	$("#topBtn").css("visibility","hidden");    //尺寸过低隐藏按钮
	        $("#otherContent").css("visibility","hidden");   //尺寸过低隐藏内容
			$("#foot").css("visibility","hidden");
			$("hr").css("visibility","hidden");
            $(".floatInfo").css("display","none");    //隐藏浮动微信二维码
            
            $("#sp").css("display","block");
            $("#wechat").css("display","block");
		 }

		 //屏幕过小隐藏相册列表
		 if(_w<830)
			$("#albumsList").css("display","none");
		 else
		    $("#albumsList").css("display","block");

		 $(".top").css("width",_w);
		 $(".top").css("height",_w*0.5);

         $(".blackC_t").css("width",_w);
         $(".blackC_t").css("height",_w*0.1);
		 $(".topbar").css("width",_w);		 
		 $(".topbar").css("height",_w*0.1);
		 
		 $("#v").css("top",_w*0.5);
		 $("#v").css("height",_w*2);
         $("#v").css("width",_w);

		 var _title2_top = $("#title2").css("top");
		 console.info(_title2_top);

		 /**
		 //$("#real_album").css("bottom","30px");
         _w_album = w>1200?1200:w;
		 var _h_album = _w_album/2.1;
		 $("#featured").css("width",_w_album);
         $("#featured").css("height",_h_album);
         $(".orbit-wrapper").css("width",_w_album);
         $(".orbit-wrapper").css("height",_h_album);
         
         $("#album1").css("width",_w_album);
         $("#album1").css("height",_h_album);         
		 $("#album2").css("width",_w_album);
         $("#album2").css("height",_h_album);
		 $("#album3").css("width",_w_album);
         $("#album3").css("height",_h_album);
		 $("#album4").css("width",_w_album);
         $("#album4").css("height",_h_album);

		 $("#real_album").css("left",(_w-_w_album)/2);		 
		 $("#real_album").css("top",_w*2*0.4+_w*0.5);
**/
		 var _w_foot = _w*2+_w*0.5;
		 $("#foot").css("top",_w_foot);
		 $("#foot").css("width",_w);		 
		 $("#foot").css("height",_w/4);
		 
		 //设置content居中
		 var _w_top = $(".top").css("width");
		 var _w_content = $("#content").css("width");
		 var _w_topf = parseFloat(_w_top.substring(0,_w_top.length-2));
		 var _w_contentf = parseFloat(_w_content.substring(0,_w_content.length-2));
		 $("#content").css("left",((_w_topf-_w_contentf)/2)+"px");
</script>
</html>