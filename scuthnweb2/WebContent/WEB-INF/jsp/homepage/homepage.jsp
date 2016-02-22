<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  style="text-align:center;">

	<head>
	  <meta http-equiv="Content-Type" content="text/html; charset=GBK" />
	  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
	  <title>华工xx同乡会</title>
	  <link rel="stylesheet" type="text/css" href="css/homepage/style.css" />
	  <script src="js/public/jquery-2.1.4.min.js"></script>
	  <script src="js/homepage/script.js"></script>
	  
	  <script type="text/javascript">
	     //var w=window.innerWidth|| document.documentElement.clientWidth|| document.body.clientWidth;
	     //if(parseFloat(w)>768){
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
			 }else{
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
	
	            $("#sp").css("visibility","visible");
	            $("#wechat").css("visibility","visible");
			 }
	
			 $(".top").css("width",_w);
			 $(".top").css("height",_w*0.5);
	
	         $(".blackC_t").css("width",_w);
	         $(".blackC_t").css("height",_w*0.1);
			 $(".topbar").css("width",_w);		 
			 $(".topbar").css("height",_w*0.1);
			 
			 $("#v").css("top",_w*0.5);
			 $("#v").css("height",_w*1);
	         $("#v").css("width",_w);
	
	         var _w_foot = _w*1+_w*0.5;
			 $("#foot").css("top",_w_foot);
			 $("#foot").css("width",_w);		 
			 $("#foot").css("height",_w/4);
			 
		 }**/
	  </script>    
	
	</head>
	
	<body style="text-align:center;">
	 <div id="wrap" style="border-radius:8px;left:0px;top:0px;position:absolute;">
	  <div class="floatInfo" onclick="clickFI($(this));" onmouseover="ccr($(this));" onmouseout="cc_1($(this));">
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
		  <div style="font-family:微软雅黑;color:#00CCFF;display:inline;">
		     <div style="display:inline;">
			   <span>
		          <strong>华工xx同乡会</strong>
		       </span>
			 </div>
			 <div style="padding-left:18%;display:inline;">
			   <div class="barEl" onmouseover="cc($(this))" onmouseout="ccb($(this))" onclick="window.location = 'http://139.129.24.81:8082/scuthnhtml/html/homepage/homepage.html';">首页</div>&nbsp;&nbsp;&nbsp;
	           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccg($(this))" style="color:#CCFF00;" onclick="window.location = 'http://139.129.24.81:8082/scuthnhtml/html/ActionHomePage/actionHomePage.html';">活动中心</div>&nbsp;&nbsp;&nbsp;
	           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccr($(this))" style="color:#FF9900;">资讯</div>&nbsp;&nbsp;&nbsp;
	           <%
		            String i = (String)session.getAttribute("user_account");
		           	if(i==null)
		           		out.print("<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccb($(this))\">登录</div>&nbsp;&nbsp;&nbsp;"+
		 	                      "<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccg($(this))\" style=\"color:#CCFF00;\">注册</div>&nbsp;&nbsp;&nbsp;");
		           	else
		           		out.print("<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccb($(this))\">"+i+"</div>&nbsp;&nbsp;&nbsp;"+
		 	                      "<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccg($(this))\" style=\"color:#CCFF00;\">退出</div>&nbsp;&nbsp;&nbsp;");	            
		 	    %>
			 </div>
		  </div>
	    </div>
	    
		<div id="content" style="position:absolute;Z-index:99;margin-top:15%;left:18%;color:#00CCFF;font-size:2.5em;">
		       <div id="topLogo" style="display:inline;">
			     <img id="logoimg" style="max-width:100%;max-height:100%;vertical-align:middle;width:20%;height:20%;" src="image/homepage/u6.png"/>
			   </div>
			   <span class="xbi">
			     <strong>华南理工大学XX同乡会</strong>
			   </span><br/></br>
			   <span id="otherContent" class="xsi" style="font-family:微软雅黑;color:#E4E4E4;">
			     <strong>加入华工XX同乡会,和我们一起成长吧!</strong>
			   </span>
			   <div id="topBtn" style="height:3em;width:30%;border-width:0.1em;cursor:pointer;border-color:#00CCFF;border-style:solid;border-radius:19px;font-size:0.5em;color:#00CCFF;margin-left:auto;margin-right:auto;margin-top:2%;" onmousemove="cover();" onmouseout="cout();" onclick="var pos = $('#v').offset().top;$('html,body').animate({ scrollTop: pos },300);">
			     <div style="padding-top:8%;">
			        <span class="xsi" style="font-family:微软雅黑;">
				      <strong>进入主题看看</strong>
				    </span>
				 </div>
			   </div>
		</div>
	
	  </div>
	
	  <div id="v" style="position:absolute;left:0px;top:72%;width:100%;height:100%;background-color:#FFFFFF;">
	     <div class="intro">
		    <img id="introimgf" style="max-width:100%;width:5%;" src="image/homepage/u28.png"/>
			<div style="font-family:微软雅黑;color:#00CCFF;" onmouseover="addMediaf($(this));" onmouseout="removeMedia($(this));">
			   <span class="bi"><strong>同乡会活动</strong></span><br/>
	           <span class="si">查看并加入近期同乡会开启的各种活动
			</div>
		 </div>
		 <hr style="width:60%;">
		 <div class="intro">
		    <img id="introimgs" style="max-width:100%;width:5%;" src="image/homepage/u34.png"/>
			<div style="font-family:微软雅黑;color:#CCFF00;" onmouseover="addMedias($(this));" onmouseout="removeMedia($(this));">
			   <span class="bi"><strong>同乡会资讯</strong></span><br/>
	           <span class="si">开启查看同乡会近期各种资讯
			</div>
		 </div>
		 <hr style="width:60%;">
		 <div class="intro">
		    <img id="introimgt" style="max-width:100%;width:5%;" src="image/homepage/u40.png"/>
			<div style="font-family:微软雅黑;color:#FF9900;" onmouseover="addMediat($(this));" onmouseout="removeMedia($(this));">
			   <span class="bi"><strong>资源共享</strong></span><br/>
	           <span class="si">开启查看各种资源链接
			</div>
		 </div>
		 <hr id="sp" style="visibility:hidden;width:60%;">
	     <div id="wechat" style="visibility:hidden;">
	        <div>
		       <img src="image/homepage/w3.jpeg">
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
			 }else if(!flag){
				$(".top").css("box-shadow","0px 0px 0px 0px");
	            $("#introimgf").css("width","15%");
	            $("#introimgs").css("width","15%");
	            $("#introimgt").css("width","15%");
	            $("#logoimg").css("height","25%");
	
				$("#content").css("left","5%");
	            $("#content").css("margin-top","10%");
				$("#content").css("color","#00FFFF");			
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
	
	            $("#sp").css("visibility","visible");
	            $("#wechat").css("visibility","visible");
			 }
	
			 $(".top").css("width",_w);
			 $(".top").css("height",_w*0.5);
	
	         $(".blackC_t").css("width",_w);
	         $(".blackC_t").css("height",_w*0.1);
			 $(".topbar").css("width",_w);		 
			 $(".topbar").css("height",_w*0.1);
			 
			 $("#v").css("top",_w*0.5);
			 $("#v").css("height",_w*1);
	         $("#v").css("width",_w);
	
	         var _w_foot = _w*1+_w*0.5;
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