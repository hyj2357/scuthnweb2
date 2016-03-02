package com.scuthnweb.tool;

import javax.servlet.http.Cookie;

public class CookieUtil {
	/**
	 * 返回对应的cookie
	 * @param cookies
	 * @param name
	 * @param value
	 * @return
	 */
	public static Cookie getCookieFromCookieArray(Cookie[] cookies,String name,String value){
		Cookie ck = null;
		for(int i=0;i<cookies.length;i++){
			if(cookies[i].getName().equals(name)&&cookies[i].getValue().equals(value)){
				ck = cookies[i];
				break;
			}				
		}
		return ck;
	}
	
	/**
	 * 
	 * @param cookies
	 * @param name
	 * @return
	 */
	public static Cookie getCookieByNameFromCookieArray(Cookie[] cookies,String name){
		Cookie ck = null;
		for(int i=0;i<cookies.length;i++){
			System.out.println(cookies[i].getValue());
			if(cookies[i].getName().equals(name)&&!cookies[i].getValue().equals("")){
				ck = cookies[i];
				break;
			}				
		}
		return ck;
	}
}
