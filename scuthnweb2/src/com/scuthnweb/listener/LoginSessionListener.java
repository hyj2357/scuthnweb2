package com.scuthnweb.listener;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.scuthnweb.dao.AccountDao;
import com.scuthnweb.dao.Login_sessionDao;
import com.scuthnweb.domain.Login_session;

public class LoginSessionListener implements HttpSessionListener{
	
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println(event.getSession().getId()+" session create!");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		//System.out.println("Have Listened session "+event.getSession().getId()+" destroyed\n");
		HttpSession session = event.getSession();
		Integer uid = (Integer)session.getAttribute("user_id");
		if(uid!=null){
			this.deleteLogin_session(uid);
		    session.removeAttribute("user_id");
			session.removeAttribute("user_account");			
		}
		else{
			System.out.println("Session NO Login!");
			return;
		}
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
                //执行sql语句对象  
                Statement statement = (Statement) connect.createStatement();  
                //Sql语句  
                String sql = "DELETE FROM log_session l WHERE l.uid="+uid+";";  
                ResultSet rs = statement.executeQuery(sql);  
                System.out.println("--------------------------");  
                System.out.println("------执行结果如下-------");  
                System.out.println("--------------------------");  
                rs.close();  
                connect.close();  
            }  
        }catch(Exception e){}    
	}
}
