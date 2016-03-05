package com.scuthnweb.action.useradmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

/**
 * 
 * @author YJ.Huang
 *
 */
public class InviteRegisterAction extends ActionSupport{
	private String user_account;
	private String user_password;
	private String cpassword;
	private String invite_code;
	private String errMsg;
	
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	
	public String execute(){
		return SUCCESS;
	}
	
	private boolean validate_(){
		boolean wrong = false;
		this.errMsg = "";
		if(!Pattern.matches("^([\u4e00-\u9fa5]|[a-z]|[A-Z]|[0-9]|_){2,24}$", this.user_account)){
			this.errMsg  += "�û���Ϊ2-24λ������Ӣ�����ֻ��»�����ɵ��ַ���<br/>";
			wrong = true;
		}else{
			if(this.queryValidateModule.accountMultiple(user_account)){
				this.errMsg += "�û����Ѵ���...<br/>";
				wrong = true;
			};
		}
		if(!Pattern.matches("^([A-Z|[a-z]|[0-9]]){6,24}$",this.user_password)){
			this.errMsg += "�����ʽ����ӦΪ6-24λӢ�Ļ������ַ�.<br/>";
			wrong = true;			
		}
		if(!this.user_password.equals(this.cpassword)){
			this.errMsg += "����������ԭ���벻ƥ��.<br/>";
			wrong = true;	
		}
		return wrong;
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

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String getInvite_code() {
		return invite_code;
	}

	public void setInvite_code(String invite_code) {
		this.invite_code = invite_code;
	}

	public UserAdModule getUserAdModule() {
		return userAdModule;
	}

	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}
}
