package com.scuthnweb.action.useradmodule;

import java.util.regex.Pattern;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scuthnweb.domain.Sy_user;
import com.scuthnweb.service.UserAdModule;
import com.scuthnweb.tool.QueryValidateModule;

public class ModifyUserInfoAction extends ActionSupport{
	private String account;
	private String gender;
	private String grade;
	private String college;
	private String major;
	private String phone_number;
	private String wechat_number;
	private String qq_number;
	
	private String errMsg;
	
	private UserAdModule userAdModule;
	private QueryValidateModule queryValidateModule;
	

	public String execute(){
		ActionContext ctx = ActionContext.getContext();
		Integer uid;
		//未登录返回error
		if((uid = (Integer)ctx.getSession().get("user_id"))==null)
			return "NO_LOGIN";
		String ac = (String)ctx.getSession().get("user_account");
		if(this.validate_(ac)){
			ctx.getSession().put("errMsg", errMsg);
			return ERROR;
		}
		else{
			Sy_user s = this.userAdModule.modifyUserInfo(uid, account, gender, grade, college, major, phone_number, qq_number, wechat_number);
			ctx.getSession().put("user_info", s);
			ctx.getSession().put("user_account", this.account);
			return SUCCESS;
		}
	}

	private boolean validate_(String account){
		boolean wrong = false;
		this.errMsg = "";
		if(this.account==null||!Pattern.matches("^([\u4e00-\u9fa5]|[a-z]|[A-Z]|[0-9]|_){2,24}$", this.account)){
			this.errMsg  += "用户名为2-24位的中文英文数字或下划线组成的字符串<br/>";
			wrong = true;
		}else{
			if(this.queryValidateModule.accountMultiple(this.account)&&!account.equals(this.account)){
				this.errMsg += "用户名已存在...<br/>";
				wrong = true;
			};
		}
		if(this.gender==null||(!this.gender.equals("boy"))&&(!this.gender.equals("girl"))){
			this.errMsg+= "非法的性别值.请在注册页面进行选择.<br/>";
			wrong = true;
		}
		if(this.grade==null||(!Pattern.matches("^2[0-9]{3}$", this.grade))){
			this.errMsg+= "非法年级值，请在信息修改页面进行选择.<br/>";
			wrong = true;
		}
		if(this.major==null){
			this.errMsg+= "非法专业值，请在信息修改页面进行选择.<br/>";
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getWechat_number() {
		return wechat_number;
	}

	public void setWechat_number(String wechat_number) {
		this.wechat_number = wechat_number;
	}

	public String getQq_number() {
		return qq_number;
	}

	public void setQq_number(String qq_number) {
		this.qq_number = qq_number;
	}
}
