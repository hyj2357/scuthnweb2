<%@ page import="com.scuthnweb.domain.Sy_user,com.scuthnweb.domain.Account,com.scuthnweb.domain.Sy_user_pic" language="java" contentType="text/html; charset=GBK" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
  <%
         	 	Sy_user_pic sp = (Sy_user_pic)(((Object[])session.getAttribute("user_info"))[0]);   //获取session数据
         	 	Sy_user s = (Sy_user)(((Object[])session.getAttribute("user_info"))[1]);
         	 	Integer uid = (Integer)session.getAttribute("user_id");
         	 	String  sid = (String)session.getId();
         	 	
  %>
  <link rel="icon" href="favicon.ico" mce_href="favicon.ico" type="image/x-icon"/> 
  <meta http-equiv="Content-Type" content="text/html; charset=GBK" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=0.4, user-scalable=no" />  <!-- 移动端用户不可缩放页面 -->
  <title>modifyInfo</title>
  <link rel="stylesheet" type="text/css" href="css/ActionHomePage/style.css" />
  <link rel="stylesheet" type="text/css" href="css/UserManage/UserManage.css" />
  <script src="js/public/jquery-2.1.4.min.js"></script>
  <script src="js/ActionHomePage/singleActionInfo/singleActionInfoScript.js"></script>
  <script src="js/UserManage/UserManage.js"></script>
  <script src="js/ActionHomePage/script.js"></script>  
  <script type="text/javascript">
  
  window.onresize=function(){
 	 var w=window.innerWidth
      || document.documentElement.clientWidth
      || document.body.clientWidth;
      var _w = parseInt(w);   //获取屏幕宽度
      if(_w>1200){
 		 var v = (_w -1200)/2;
 		 _w = 1200;
 		 $("#wrap").css("width","1200px");
 		 $("#wrap").css("margin-left",(v-8)+"px");
         $("#wrap").css("margin-right",(_w+v-8)+"px");
         
         $(".blackC_t").css("width","1200px");
         $(".blackC_t").css("height","120px");         
         $("#tbar").css("width","1200px"); 
         $("#tbar").css("height","120px"); 
         
      }else{
 		 $("#wrap").css("width","100%");
 		 $("#wrap").css("margin-left",-8+"px");
         //$("#wrap").css("margin-right",-8+"px");
         
         $(".blackC_t").css("width",_w+"px");
         $(".blackC_t").css("height",(_w*0.1)+"px");
         $("#tbar").css("width",_w+"px");
         $("#tbar").css("height",(_w*0.1)+"px");
      }
  }
  
  function sendUserIcon(){
	  var formData = new FormData($( "#uploadForm" )[0]);
	  $.ajax({
	    url:  'http://imagescuthn.applinzi.com/image/upUserIcon.php?uid=<%out.print(uid);%>&sid=<%out.print(sid);%>',
	    type: 'POST',
	    data: formData,
	    dataType: 'json',
	    async: false,
	    cache: false,
	    contentType: false,
	    processData: false,
	    success: function (returndata) {
	    	console.info(returndata);
	    	var rd = eval(returndata);
	    	console.info(rd.url);
	    	$("#profile").attr("src",rd.url);
	    },
	    error: function (returndata) {
	    	console.info(returndata);
	        //alert(returndata);
	    }
	  });
  }
  </script>
</head>

<body style="width:100%;height:100%;background-color:#00CCFF;text-align:center;">
   <div id="wrap" style="width:100%;margin-top:-8px;margin-left:-8px;height:100%;">
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
		   <div class="barEl" onmouseover="cc($(this))" onmouseout="ccb($(this))"style="color:#00CCFF;" onclick="window.location = 'http://139.129.24.81:8082/scuthnhtml/html/homepage/homepage.html';">首页</div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccg($(this))"style="color:#CCFF00;" onclick="window.location = 'http://139.129.24.81:8082/scuthnhtml/html/ActionHomePage/actionHomePage.html';">活动中心</div>&nbsp;&nbsp;&nbsp;
           <div class="barEl" onmouseover="cc($(this))" onmouseout="ccr($(this))"style="color:#FF9900;">资讯</div>&nbsp;&nbsp;&nbsp;
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
     <div id="top" style="background-color:#00CCFF;text-align:left;width:100%;">
       <div>
       </div>
       <div style="padding:10% 0% 10% 0%;color:#FFFFFF;">
         <div style="cursor:pointer;display:inline;padding" onclick="window.location='../homepage/homepage.html';">
            <img style="vertical-align:middle;" src="image/ActionHomePage/u70.png"/>
            <span style="font-family:微软雅黑;font-size:1em;">
               <strong>返回首页</strong>
            </span>
         </div>
         <div style="display:inline;margin-left:30%;">
            <span style="font-family:微软雅黑;font-size:3em;">
               <strong>用户中心</strong>
            </span>
         </div>
       </div>
     </div>
     <div id="v" style="font-family:微软雅黑;background-color:#FFFFFF;width:100%;">
        <br/>
        <span style="color:#00CCFF;font-family:微软雅黑;font-size:2em;">
           <strong>修改个人资料</strong>
        </span><br/><br/><br/>
        <div>
           <div style="background-color:#FFFFFF;width:70%;display:inline-block;vertical-align:top;">
	           <div style="text-align:left;display:inline-block;vertical-align:top;">
	           	<form  id="uploadForm" method="post" enctype="multipart/form-data" style="width:150px;text-align:center;">
		           <img id="profile" style="width:129px;height:129px;border-radius:150px;box-shadow:0px 0px 8px 0px;" src="<% out.print(sp.getUrl());%>"/><br/><br/>	           
		           <input type="file" name="file" id="file" style="width:150px;color:#ff9900;font-family:微软雅黑;"/>		           
				   <div class="xbi" style="cursor:pointer;background-color:#FF9900;color:#FFFFFF;border-radius:6px;border:none;margin-top:10%;margin-left:7%" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbcr($(this));cc($(this));" onclick="sendUserIcon();">
				   	上传头像
				   </div>     		  		
               	</form>
               </div>
               <div style="display:inline-block;padding-left:8%;">
               	<form action="ModifyUserInfo" method="post">
               	   <table style="text-align:left;font-size:24px;" border="0">
               	   	<tr>
               	   		<td>
		               	   	<img style="width:50px;height:50px;vertical-align:middle;" src="image/UserManage/mf.png"/>               
					        <span style="color:#00CCFF;">
					        	<strong>用户名</strong>
					        </span>:
			        	</td>
			        	<td>
					        <input class="inputTxt" name="account" style="width:60%;" value="<% out.print(s.getAccount().getAccount());%>"/>
			        	</td>
			        </tr>
			        <tr>
               	   		<td>
		               	   	<img style="width:50px;height:50px;vertical-align:middle;" src="image/UserManage/gender.png"/>               
					        <span style="color:#00CCFF;">
					        	<strong>性别</strong>
					        </span>:
			        	</td>
			        	<td>
				     		<select name="gender" style="width:45px;" class="inputTxt">
		  						<option value ="boy" <% if(s.getGender().equals("boy")) out.print("selected=\"selected\"");%>>男</option>
		  						<option value ="girl" <% if(s.getGender().equals("girl")) out.print("selected=\"selected\"");%>>女</option>
							</select>			        	
					    </td>
			        </tr>
			        <tr>
               	   		<td>
		               	   	<img style="width:50px;height:50px;vertical-align:middle;" src="image/UserManage/major.png"/>               
					        <span style="color:#00CCFF;">
					        	<strong>专业</strong>
					        </span>:
			        	</td>
			        	<td>
					        <input class="inputTxt" name="major" style="width:60%;" value="<% out.print(s.getMajor());%>"/>
			        	</td>
			        </tr>
			        <tr>
               	   		<td>
		               	   	<img style="width:50px;height:50px;vertical-align:middle;" src="image/UserManage/grade.png"/>               
					        <span style="color:#00CCFF;">
					        	<strong>年级</strong>
					        </span>:
			        	</td>
			        	<td>
					        <input class="inputTxt" name="grade" style="width:60%;"  value="<% out.print(s.getGrade());%>"/>
			        	</td>
			        </tr>
			        <tr>
               	   		<td>
		               	   	<img style="width:50px;height:50px;vertical-align:middle;" src="image/UserManage/phone_icon.png"/>               
					        <span style="color:#00CCFF;">
					        	<strong>电话号码</strong>
					        </span>:
			        	</td>
			        	<td>
					        <input class="inputTxt" name="phone_number" style="width:60%;"  value="<% out.print(s.getPhone_number()==null?"":s.getPhone_number());%>"/>
			        	</td>
			        </tr>
			        <tr>
               	   		<td>
		               	   	<img style="width:50px;height:50px;vertical-align:middle;" src="image/UserManage/wechat.png"/>               
					        <span style="color:#00CCFF;">
					        	<strong>微信号</strong>
					        </span>:
			        	</td>
			        	<td>
					        <input class="inputTxt" name="wechat_number" style="width:60%;"  value="<% out.print(s.getWechat_number()==null?"":s.getWechat_number());%>"/>
			        	</td>
			        </tr>
			        <tr>
               	   		<td>
		               	   	<img style="width:50px;height:50px;vertical-align:middle;" src="image/UserManage/QQ.png"/>               
					        <span style="color:#00CCFF;">
					        	<strong>QQ号</strong>
					        </span>:
			        	</td>
			        	<td>
					        <input class="inputTxt" name="qq_number" style="width:60%;"  value="<% out.print(s.getQq_number()==null?"":s.getQq_number());%>"/>
			        	</td>
			        </tr>			        			        			        			        
               	   </table>
               	   	<%
	     				String errMsg = (String)session.getAttribute("errMsg");
	     				if(errMsg!=null){
	     					out.print("<div style=\"color:#FF0000;font-family:微软雅黑;margin-left:25%;width:50%;background:#FF9900;border-radius:5px;\">"+
	     					            "<span>"+
	    					              "<strong>"+errMsg+"<br/></strong>"+
	    				              	"</span>"+
	    					          "</div><br/>");
			           	    session.removeAttribute("user_info");
	     					session.removeAttribute("errMsg");
	     				}
	     			 %>
	               <div style="text-align:center;margin-top:15%;">
						<input class="si" style="cursor:pointer;background-color:#FF9900;color:#FFFFFF;border-radius:6px;border:none;" onmouseover="cbc($(this));ccr($(this));" onmouseout="cbcr($(this));cc($(this));" type="submit" value="确认修改"/>     		  		
	               </div>
				</form>
               </div>
           </div>
           <div style="box-shadow:0px 0px 8px 0px;border-radius:6px;background-color:#CCFF00;width:25%;display:inline-block;">
           	   <div class="si">
           	   	   <span style="color:#666666;">
           	   	      <strong>用户面板</strong>
           	   	   </span>
           	   	   <ul class="xbi" style="list-style:none;margin-left:-40px;">
           	   	   	  <li>
           	   	   	  	<div class="clickBoard">
           	   	   	  		<span>
           	   	   	  			个人资料
           	   	   	  		</span>
           	   	   	  	</div>
           	   	   	  </li>
           	   	   	  <li>
           	   	   	  	<div class="ncBoard" onmouseover="mouseOverNcboard($(this));" onmouseout="mouseOutNcboard($(this));">
           	   	   	  		<span>
           	   	   	  			活动中心
           	   	   	  		</span>
           	   	   	  	</div>
           	   	   	  </li>
           	   	   	  <li>
           	   	   	  	<div class="ncBoard" onmouseover="mouseOverNcboard($(this));" onmouseout="mouseOutNcboard($(this));">
           	   	   	  		<span>
           	   	   	  			资源共享
           	   	   	  		</span>
           	   	   	  	</div>
           	   	   	  </li>
           	   	   	  <li>
           	   	   	  	<div class="ncBoard" onmouseover="mouseOverNcboard($(this));" onmouseout="mouseOutNcboard($(this));">
           	   	   	  		<span>
           	   	   	  			咨询中心
           	   	   	  		</span>
           	   	   	  	</div>
           	   	   	  </li>
           	   	   	  <li>
           	   	   	  	<div class="ncBoard" onmouseover="mouseOverNcboard($(this));" onmouseout="mouseOutNcboard($(this));">
           	   	   	  		<span>
           	   	   	  			通知中心
           	   	   	  		</span>
           	   	   	  	</div>
           	   	   	  </li>
           	   	   </ul>
           	   </div>
           </div>
        </div>
        <br/><br/>    
     </div>
     <div id="foot" style="font-family:微软雅黑;border-radius:6px;margin-top:-5%;box-shadow: 0px 0px 18px 0px;width:100%;height:30%;background-color:#CCCCCC;left:0px;bottom:0px;">   
       <div style="font-family:微软雅黑;margin-top:5%;">  
	     <div>
	        <a target="_blank" style="text-decoration:none;" href="#"><span class="si">联系我们</span></a>
	     </div><br/>
	     <div style="font-family:微软雅黑;display:inline;">
		      <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">首页</span></div>&nbsp;&nbsp;&nbsp;
              <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">活动</span></div>&nbsp;&nbsp;&nbsp;
              <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">资讯</span></div>&nbsp;&nbsp;&nbsp;
              <div class="barEl" onmouseover="cc($(this))" onmouseout="ccB($(this))"><span class="si">管理员中心</span></div>&nbsp;&nbsp;&nbsp;
	     </div><br/>
	     <div>
	          <a target="_blank" style="text-decoration:none;" href="http://www.scut.edu.cn/"><span style="color:#999999;" class="xsi">友情链接:华南理工大学官网</span></a>
	     </div><br/>
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
     var _w = parseInt(w);   //获取屏幕宽度
     
	 if(_w>1200){
		 var v = (_w -1200)/2;
		 _w = 1200;
		 $("#wrap").css("width","1200px");
		 $("#wrap").css("margin-left",(v-8)+"px");
         $("#wrap").css("margin-right",(_w+v-8)+"px");
         $(".blackC_t").css("width","1200px");
         $(".blackC_t").css("height",_w*0.1);
         $("#tbar").css("width","1200px"); 
         $("#tbar").css("height",_w*0.1);
	 }else{
		 $("#wrap").css("width","100%");
		 $("#wrap").css("margin-left",-8+"px");
         //$("#wrap").css("margin-right",_w+"px");
         
         $(".blackC_t").css("width",_w+"px");
         $(".blackC_t").css("height",_w*0.1);
         $("#tbar").css("width",_w+"px");  
         $(".blackC_t").css("height",_w*0.1);
	 }
</script>
</html> 