package com.scuthnweb.tool;

import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

/**
 * 
 * @author YJ.Huang
 *
 */
public class SMTPUtil {
	/**
	 * 使用smtp协议发送邮件
	 * @param host 发送邮件的smtp主机名,如 smtp.163.com
	 * @param username	邮箱用户名,如hyj23575651
	 * @param password	smtp邮箱登录密码
	 * @param from	邮箱名，如 hyj23575651@163.com
	 * @param to	接受邮箱名，如 xxx@qq.com
	 * @param subject	邮件主题
	 * @param content	邮件内容
	 * @return	是否发送成功
	 */
	public static boolean sendMail(String host,final String username,final String password,String from,String to,String subject,String content){       
        
		Properties props = System.getProperties();
        props.put("mail.smtp.host", host);                // 设置SMTP的主机
        props.put("mail.smtp.auth", "true");            // 需要经过验证       
        Session session = Session.getInstance(props, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);

            Multipart mp = new MimeMultipart();
            MimeBodyPart mbpContent = new MimeBodyPart();
            mbpContent.setText(content);
            mp.addBodyPart(mbpContent);

            msg.setContent(mp);
            msg.setSentDate(new Date());
            Transport.send(msg);
            
        } catch (MessagingException me) {
            me.printStackTrace();
            return false;
        }
        return true;
    }
}
