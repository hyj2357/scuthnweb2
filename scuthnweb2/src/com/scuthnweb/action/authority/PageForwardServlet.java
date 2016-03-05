package com.scuthnweb.action.authority;


import com.opensymphony.xwork2.ActionSupport;

/**
 * 
 * @author YJ.Huang
 *
 */
public class PageForwardServlet extends ActionSupport{
    private String p;
    private final String PREFIX_PATH = "/WEB-INF/jsp/";
    
    public String execute(){
    	return PREFIX_PATH + p;
    }

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
	}
    
}
