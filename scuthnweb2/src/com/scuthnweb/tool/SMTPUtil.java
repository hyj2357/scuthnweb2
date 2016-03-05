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
	 * ʹ��smtpЭ�鷢���ʼ�
	 * @param host �����ʼ���smtp������,�� smtp.163.com
	 * @param username	�����û���,��hyj23575651
	 * @param password	smtp�����¼����
	 * @param from	���������� hyj23575651@163.com
	 * @param to	�������������� xxx@qq.com
	 * @param subject	�ʼ�����
	 * @param content	�ʼ�����
	 * @return	�Ƿ��ͳɹ�
	 */
	public static boolean sendMail(String host,final String username,final String password,String from,String to,String subject,String content){       
        
		Properties props = System.getProperties();
        props.put("mail.smtp.host", host);                // ����SMTP������
        props.put("mail.smtp.auth", "true");            // ��Ҫ������֤       
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
