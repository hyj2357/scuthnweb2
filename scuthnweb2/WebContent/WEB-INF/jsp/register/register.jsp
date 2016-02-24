<%@ page language="java" contentType="text/html; charset=GBK" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  style="text-align:center;">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=GBK"/>
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=0.4, user-scalable=no" />  <!-- 移动端用户不可缩放页面 -->
  <title>注册新账号</title>
  <!-- <link rel="stylesheet" type="text/css" href="css/ActionHomePage/style.css" /> -->
  <link rel="stylesheet" type="text/css" href="css/register/register.css" />
  <script src="js/public/jquery-2.1.4.min.js"></script>
  <script src="js/ActionHomePage/script.js"></script> 
  <script type="text/javascript"></script> 
</head>

<body style="text-align:center;">
  <div id="wrap">
     <div id="v">
     	<form action="Register" method="post">
     	    <div>
	     		<span class="bi" style="color:#00CCFF;">
	     			<strong>新用户注册</strong><br/>
	     			<a style="text-decoration:none;color:#FF9900;font-size:0.5em;" href="inviteRegister.html">我有邀请码</a>
	     		</span>
     		</div><br/>   		
     		<div>
     			<div  class="si" style="vertical-align:top;text-align:left;display:inline-block;">
		     		<span style="color:#CCFF00;">
		     			<strong>用户名</strong>
		     		</span><br/><br/>
		     		<span style="color:#CCFF00;">
		     			<strong>真实姓名</strong>
		     		</span><br/><br/>
		     		<span style="color:#CCFF00;">
		     			<strong>性别</strong>
		     		</span><br/><br/>		     		
		     		<span style="color:#CCFF00;">
		     			<strong>专业</strong>
		     		</span><br/><br/>
		     		<span style="color:#CCFF00;">
		     			<strong>年级(如'2011')</strong>
		     		</span><br/><br/>
		     		<span style="color:#CCFF00;">
		     			<strong>验证邮箱</strong>
		     		</span><br/><br/>	
		     		<span style="color:#CCFF00;">
		     			<strong>密码</strong>
		     		</span><br/><br/>	
		     		<span style="color:#CCFF00;">
		     			<strong>确认密码</strong>
		     		</span><br/><br/>  		
     			</div>		
     			<div class="si" style="display:inline-block;width:25%;">
		     		<input name="account" class="inputTxt" type="text"/><br/><br/>
		     		<input name="name" class="inputTxt" type="text"/><br/><br/>
		     		<select name="gender" style="width:45px;" class="inputTxt">
  						<option value ="boy" selected = "selected">男</option>
  						<option value ="girl">女</option>
					</select><br/><br/>
		     		<input name="major" class="inputTxt" type="text"/><br/><br/>
		     		<input name="grade" class="inputTxt" type="text"/><br/><br/>
		     		<input name="mail" class="inputTxt" type="text"/><br/><br/>
		     		<input name="password" class="inputTxt" type="password"/><br/><br/>
		     		<input name="cpassword" class="inputTxt" type="password"/><br/><br/>
     			</div>
     			<%
     				String errMsg = (String)session.getAttribute("errMsg");
     				if(errMsg!=null){
     					out.print("<div style=\"color:#FF0000;font-family:微软雅黑;margin-left:40%;width:20%;background:#FF9900;border-radius:5px;\">"+
     					            "<span>"+
    					              "<strong>"+errMsg+"<br/></strong>"+
    				              	"</span>"+
    					          "</div><br/>");
     					session.removeAttribute("errMsg");
     				}
     			 %>
     		</div>
            <input class="bi" style="cursor:pointer;background-color:#FF9900;color:#FFFFFF;border-radius:6px;border:none;" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbcr($(this));cc($(this));" type="submit" value="注册"/>     		  		
     	</form>
     </div><br/><br/><br/>
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

</html>