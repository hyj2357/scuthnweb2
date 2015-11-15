package com.scuthnweb.action.authority;


import com.opensymphony.xwork2.ActionSupport;

public class PageForwardServlet extends ActionSupport{
    private String pagePath;
    private final String PREFIX_PATH = "/WEB-INF/jsp/";
    
    public String execute(){
    	return PREFIX_PATH + pagePath;
    }

	public String getPagePath() {
		return pagePath;
	}

	public void setPagePath(String pagePath) {
		this.pagePath = pagePath;
	}
    
}
