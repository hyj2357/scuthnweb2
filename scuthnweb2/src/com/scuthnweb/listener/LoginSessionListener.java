package com.scuthnweb.listener;

import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

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
		String sid = session.getId();

		if(uid!=null){
			//�ӵ�¼�Ự����������Ự
			LoginSessionContainer.delete(session);
			//����־û���¼�Ự��¼
			this.deleteLogin_session(sid);
		    session.removeAttribute("user_id");
			session.removeAttribute("user_account");
		}
		else{
			System.out.println("Session NO Login!");
			return;
		}
	}
	
	private void deleteLogin_session(String sid){
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
                String sql = "DELETE FROM log_session l WHERE l.session_id="+sid+";";  
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
