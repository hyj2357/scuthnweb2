package com.scuthnweb.action.useradmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Sy_user;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

public class RegisterAction extends ActionSupport{
	private String account;
	private String name;
	private String grade;
	private String college;
	private String major;
	private String mail;
	private String password;
	private String cpassword;
	private String errMsg;
	
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	
	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		if(this.validate_()){
			ctx.getSession().put("errMsg", errMsg);
			return ERROR;
		}
		else{
			Sy_user sy_user = this.userAdModule.register(account, name, grade,major, mail, password);
			ctx.getSession().put("user_id", sy_user.getAccount().getId().intValue());
			ctx.getSession().put("user_account", sy_user.getAccount().getAccount());
			return SUCCESS;
		}
	}
	
	private boolean validate_(){
		boolean wrong = false;
		this.errMsg = "";
		if(!Pattern.matches("^([\u4e00-\u9fa5]|[a-z]|[A-Z]|[0-9]|_){2,24}$", this.account)){
			this.errMsg  += "�û���Ϊ2-24λ������Ӣ�����ֻ��»�����ɵ��ַ���<br/>";
			wrong = true;
		}else{
			if(this.queryValidateModule.accountMultiple(account)){
				this.errMsg += "�û����Ѵ���...<br/>";
				wrong = true;
			};
		}
		if(!Pattern.matches("^[\u4e00-\u9fa5]{2,6}$", this.name)){
			this.errMsg += "��ʵ������ʽ����ӦΪ2-6λ�����ַ�<br/>";
			wrong = true;
		}
		if(!Pattern.matches("^([A-Z]|[a-z]|[0-9]|_)+@([A-Z]|[a-z]|[0-9]|_)+.(com|cn)$",this.mail)){
			this.errMsg += "�����ʽ����ӦΪxxx@xx.com����xxx@xx.cn���ݲ�֧�ֽ���������.<br/>";
			wrong = true;
		}
		if(!Pattern.matches("^([A-Z|[a-z]|[0-9]]){6-24}$",this.password)){
			this.errMsg += "�����ʽ����ӦΪ6-24λӢ�Ļ������ַ�.<br/>";
			wrong = true;			
		}
		if(!this.password.equals(this.cpassword)){
			this.errMsg += "����������ԭ���벻ƥ��.<br/>";
			wrong = true;	
		}
		if(!this.queryValidateModule.nameAndGradeAndMajorMultiple(name, grade, major)){
			this.errMsg += "��ͬ�꼶��רҵ���Ѵ��ڸ�����...<br/>";
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public QueryValidateModule getQueryValidateModule() {
		return queryValidateModule;
	}

	public void setQueryValidateModule(QueryValidateModule queryValidateModule) {
		this.queryValidateModule = queryValidateModule;
	}
	
	
}
