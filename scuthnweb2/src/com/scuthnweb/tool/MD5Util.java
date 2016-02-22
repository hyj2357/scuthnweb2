package com.scuthnweb.tool;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	/**
	 * ���ַ�������MD5ת��
	 * @param pw	ת���ַ���
	 * @return	MD5�ַ���
	 */
	public static String stringMD5(String pw) {
	  try {  
	        // ��ȡMD5ת���������ʹ��SHA1�򽫲�����Ϊ"SHA1"��  
	        MessageDigest messageDigest =MessageDigest.getInstance("MD5");  
	        // ������ַ���ת�����ֽ�����  
	        byte[] inputByteArray = pw.getBytes();  
	        // inputByteArray�������ַ���ת���õ����ֽ�����  
	        messageDigest.update(inputByteArray);  
	        // ת�������ؽ����Ҳ���ֽ����飬����16��Ԫ��  
	        byte[] resultByteArray = messageDigest.digest();  
	        // �ַ�����ת�����ַ�������  
	        return byteArrayToHex(resultByteArray);  
	     } catch (NoSuchAlgorithmException e) {  
	        return null;  
	     }  
	 }

	/**
	 * ���ֽ�����ת��Ϊ16�����ַ���
	 * @param byteArray	�ֽ�����
	 * @return	��Ӧ��16�����ַ���
	 */
    public static String byteArrayToHex(byte[] byteArray) {  
        // ���ȳ�ʼ��һ���ַ����飬�������ÿ��16�����ַ�  
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9', 'A','B','C','D','E','F' };  
        // newһ���ַ����飬�������������ɽ���ַ����ģ�����һ�£�һ��byte�ǰ�λ�����ƣ�Ҳ����2λʮ�������ַ���2��8�η�����16��2�η�����  
        char[] resultCharArray =new char[byteArray.length * 2];  
        // �����ֽ����飬ת�����ַ��ŵ��ַ�������  
        int index = 0; 
        for (byte b : byteArray) {  
           resultCharArray[index++] = hexDigits[b>>> 4 & 0xf];  
           resultCharArray[index++] = hexDigits[b& 0xf];  
        }
        // �ַ�������ϳ��ַ�������  
        return new String(resultCharArray);  
    }
}
