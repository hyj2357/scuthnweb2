package com.scuthnweb.action.useradmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Sy_user;
import com.scuthnweb.service.UserAdModule;

public class RegisterAction extends ActionSupport{
	private String account;
	private String name;
	private String college;
	private String major;
	private String mail;
	private String password;
	private String cpassword;
	private String errMsg;
	
	private UserAdModule userAdModule;
	
	public String execute(){
		if(this.validate_())
			return ERROR;
		else{
			ActionContext ctx = ActionContext.getContext();
			Sy_user sy_user = this.userAdModule.register(account, name, major, mail, password, cpassword);
			ctx.getSession().put("user_id", sy_user.getId().intValue());
			ctx.getSession().put("user_account", sy_user.getAccount().getAccount());
			return SUCCESS;
		}
	}
	
	private boolean validate_(){
		boolean wrong = false;
		if(!Pattern.matches("^([\u4e00-\u9fa5]|[a-z]|[A-Z]|[0-9]|_){2,24}$", this.account)){
			this.errMsg  = "�˻���Ϊ2-24λ������Ӣ�����ֻ��»�����ɵ��ַ���<br/>";
			wrong = true;
		}
		if(!Pattern.matches("^[\u4e00-\u9fa5]{2,6}$", this.name)){
			this.errMsg += "��ʵ������ʽ����ӦΪ2-6λ�����ַ�<br/>";
			wrong = true;
		}
		if(!Pattern.matches("^([A-Z]|[a-z]|[0-9]|_)+@([A-Z]|[a-z]|[0-9]|_)+.(com|cn)$",this.mail)){
			this.errMsg += "�����ʽ����ӦΪxxx@xx.com����xxx@xx.cn���ݲ�֧�ֽ���������.";
			wrong = true;
		}
		if(!Pattern.matches("^([A-Z|[a-z]|[0-9]]){6-24}$",this.password)){
			this.errMsg += "�����ʽ����ӦΪ6-24λӢ�Ļ������ַ�.";
			wrong = true;			
		}
		if(!this.password.equals(this.cpassword)){
			this.errMsg += "����������ԭ���벻ƥ��.";
			wrong = true;	
		}
		return wrong;
	}
	
	public String getAccount() {
		return account;
	}


	public void setAccount(String account) {
		this.account = account;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getCpassword() {
		return cpassword;
	}


	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}


	public UserAdModule getUserAdModule() {
		return userAdModule;
	}

	public void setUserAdModule(UserAdModule userAdModule) {
		this.userAdModule = userAdModule;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	
}
