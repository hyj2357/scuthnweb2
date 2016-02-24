<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  style="text-align:center;">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=GBK" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=0.4, user-scalable=no" />  <!-- 移动端用户不可缩放页面 -->
  <title>登录</title>
  <!-- <link rel="stylesheet" type="text/css" href="css/ActionHomePage/style.css" /> -->
  <!--  <link rel="stylesheet" type="text/css" href="css/register/register.css" /> -->
  <link rel="stylesheet" type="text/css" href="css/login/login.css" />
  <script src="js/public/jquery-2.1.4.min.js"></script>
  <script src="js/ActionHomePage/script.js"></script> 
  <script type="text/javascript">
	  window.onresize = function(){
		  var w=window.innerWidth
          || document.documentElement.clientWidth
          || document.body.clientWidth;
          var _w = parseInt(w);
	      $(".blackC_t").css("width",_w+"px");
	      $(".blackC_t").css("height",(_w*0.1)+"px");
          $("#tbar").css("width",_w+"px");
          $("#tbar").css("height",(_w*0.1)+"px");	      
	  }
  </script> 
</head>

<body style="background-color:#FF9900;background-size:100% 100%;background-image:url(image/login/u1.jpg);background-size:100%;text-align:center;">
  <div id="wrap">
     <div>
  	    <div class="blackC_t" style="left:-0px;top:-0px;">
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
		           		out.print("<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccb($(this))\" onclick=\"window.location='pfs?p=login/login.jsp';\">登录</div>&nbsp;&nbsp;&nbsp;"+
		 	                      "<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccg($(this))\" onclick=\"window.location='pfs?p=register/register.jsp';\" style=\"color:#CCFF00;\">注册</div>&nbsp;&nbsp;&nbsp;");
		           	else
		           		out.print("<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccb($(this))\" onclick=\"window.location='CheckUserInfo';\" >"+i+"</div>&nbsp;&nbsp;&nbsp;"+
		 	                      "<div class=\"barEl\" onmouseover=\"cc($(this))\" onmouseout=\"ccg($(this))\" onclick=\"window.location='LoginOut';\" style=\"color:#CCFF00;\">退出</div>&nbsp;&nbsp;&nbsp;");	            
		 	    %>
			 </div>
		  </div>
	     </div>
	 </div>
     <div id="v" style="padding-top:10%">
     	<form action="Login" method="post" style="background-color:#FF9900;border-radius:8px;box-shadow:0px 0px 16px 0px;width:60%;margin-left:20%;">
	     	<div style="color:#FFFFFF;">
	   			<span class="xsbi">
	   				<strong>用户登录</strong><br/>
	   			</span>
	   			<span class="xbi" style="color:#FFFFFF">
	   				tip.如果忘记用户名可以尝试真实姓名+年级(如'张伟2011')
	   			</span>
	   		</div><br/><br/><br/>
	   		<div>
		   		<div style="text-align:left;display:inline-block;">
			   		<span class="bi" style="color:#FFFFFF;">
		     			<strong>用户名</strong>
		     		</span><br/><br/>
		     		<span class="bi" style="color:#FFFFFF;">
		     			<strong>密码</strong>
		     		</span><br/><br/>
		     		<span class="bi" style="color:#FFFFFF;">
		     			<strong>验证码</strong>
		     		</span><br/><br/>	     			     		
		   		</div>
		   		
	            <div style="display:inline-block;width:35%;">
		     		<input name="user_account" class="inputTxt bi" style="border:none;" type="text"/><br/><br/>
		     		<input name="user_password" class="inputTxt bi" style="border:none;" type="password"/><br/><br/>
		     		<input name="" class="inputTxt bi" style="border:none;" type="text"/><br/><br/>
	     		</div><br/> 
     		</div>  
            <input class="bi" style="cursor:pointer;color:#FFFFFF;border-radius:6px;border-style:solid;border-width:2px;border-color:#FFFFFF;background-color:transparent;" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbc_transparent($(this));cc($(this));" type="submit" value="登录"/><br/><br/><br/>      		  		
     	    <a class="si" style="text-decoration:none;color:#FFFFFF;" href="inviteRegister.html">忘记密码？点我...</a> 
     	    <br/><br/><br/>	    
     	</form>
     </div>
     <br/><br/><br/><br/><br/><br/><br/><br/><br/>
     <div id="foot" style="font-family:微软雅黑;border-radius:6px;margin-top:-5%;box-shadow: 0px 0px 18px 0px;width:100%;height:30%;background-color:#CCCCCC;left:0px;bottom:0px;">   
       	<div style="font-family:微软雅黑;margin-top:5%;">  
	    <div>
	       <a  style="text-decoration:none;" target="_blank" href="#"><span class="si">联系我们</span></a>
	    </div><br/>
	     <div style="font-family:微软雅黑;display:inline;">
		      <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))" onclick="window.location='../homepage/homepage.html'"><span class="si">首页</span></div>&nbsp;&nbsp;&nbsp;
              <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">活动</span></div>&nbsp;&nbsp;&nbsp;
              <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">资讯</span></div>&nbsp;&nbsp;&nbsp;
              <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">管理员中心</span></div>&nbsp;&nbsp;&nbsp;
	     </div><br/>
	     <div>
	          <a  style="text-decoration:none;" target="_blank" href="http://www.scut.edu.cn/"><span style="color:#999999;" class="xsi">友情链接:华南理工大学官网</span></a>
	     </div><br/>
	     <div>
	        <span class="xsi">备案信息:xxxxxxxxxxxxxxxxxxxxxx</span>
	     </div>
	 </div>
  </div>
</body>
<script type="text/javascript">
	var w=window.innerWidth
	|| document.documentElement.clientWidth
	|| document.body.clientWidth;
	var _w = parseInt(w);
	$(".blackC_t").css("width",_w+"px");
	$(".blackC_t").css("height",(_w*0.1)+"px");
	$("#tbar").css("width",_w+"px");
	$("#tbar").css("height",(_w*0.1)+"px");
</script>
</html>