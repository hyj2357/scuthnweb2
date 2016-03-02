package com.scuthnweb.action.useradmodule;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Account;
import com.scuthnweb.listener.SessionContainer;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

public class LoginAction extends ActionSupport{
	private String user_account;
	private String user_password;
	
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	private SessionContainer sessionContainer;
	
	private String errMsg;
	
	public String execute(){
		
		 ActionContext ctx = ActionContext.getContext();
		 /**
		 if(this.queryValidateModule.isLogin(this.user_account)){
			 this.errMsg = "���û���������������ϻ�����ļ��������������ϵ�¼.���˳��˺ź��ٵ�¼�����Ժ�����.<br/>";
			 ctx.getSession().put("errMsg", errMsg);
			 return ERROR;
		 } **/
		 HttpServletRequest request = (HttpServletRequest) ctx.get(ServletActionContext.HTTP_REQUEST);		 		 
		 HttpSession session = request.getSession();
         
		 Account account = this.userAdModule.login(user_account, user_password);
		 if(account==null){
			 this.errMsg = "�û������������.<br/>";
			 session.setAttribute("errMsg", errMsg);
			 return ERROR;
		 }else{ 
			 //��ӻ����޸Ŀͻ���cookie
			 Cookie ck = new Cookie("scuthn.user",account.getId()+":"+account.getAccount());
			 HttpServletResponse response = (HttpServletResponse) ctx.get(ServletActionContext.HTTP_RESPONSE);		 
	         response.addCookie(ck);
	         //���õ�ǰ�Ự��¼��ʶ
			 session.setAttribute("user_account", account.getAccount());
			 session.setAttribute("user_id", account.getId());
			 return SUCCESS;
		 }			 
	}

	public String getUser_account() {
		return user_account;
	}

	public void setUser_account(String user_account) {
		this.user_account = user_account;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public UserAdModule getUserAdModule() {
		return userAdModule;
	}

	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}

	public QueryValidateModule getQueryValidateModule() {
		return queryValidateModule;
	}

	public void setQueryValidateModule(QueryValidateModule queryValidateModule) {
		this.queryValidateModule = queryValidateModule;
	}

	public SessionContainer getSessionContainer() {
		return sessionContainer;
	}

	public void setSessionContainer(SessionContainer sessionContainer) {
		this.sessionContainer = sessionContainer;
	}
}
