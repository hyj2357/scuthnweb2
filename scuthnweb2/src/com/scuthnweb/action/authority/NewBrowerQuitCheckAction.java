package com.scuthnweb.action.authority;

import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class NewBrowerQuitCheckAction extends ActionSupport{
	
	public String execute(){
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);		 
        HttpSession session = request.getSession();
        
		Integer uid = (Integer)session.getAttribute("user_id");
		if(uid!=null){
			this.deleteLogin_session(uid);
		    session.removeAttribute("user_id");
			session.removeAttribute("user_account");			
		}
		else{
			System.out.println("Session NO Login!");
			return null;
		}
		session.invalidate();   //�����ǰsession
		return null;
	}
	
	
	private void deleteLogin_session(Integer uid){
		String driver = "com.mysql.jdbc.Driver";  
        String url = "jdbc:mysql://127.0.0.1:3306/scuthnwebdatabase";  
        String user = "root";  
        String pwd = "123456";  
        try{  
            Class.forName(driver);  
            Connection connect = (Connection) DriverManager.getConnection(url,user,pwd);  
            if(!connect.isClosed()){  
                System.out.println("succeed in getting the sql connection");  
                //ִ��sql������  
                Statement statement = (Statement) connect.createStatement();  
                //Sql���  
                String sql = "DELETE FROM log_session l WHERE l.uid="+uid+";";  
                ResultSet rs = statement.executeQuery(sql);  
                System.out.println("--------------------------");  
                System.out.println("------ִ�н������-------");  
                System.out.println("--------------------------");  
                rs.close();  
                connect.close();  
            }  
        }catch(Exception e){}    
	}
}
