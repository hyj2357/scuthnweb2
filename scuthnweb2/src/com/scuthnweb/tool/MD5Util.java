package com.scuthnweb.tool;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	/**
	 * 将字符串进行MD5转换
	 * @param pw	转换字符串
	 * @return	MD5字符串
	 */
	public static String stringMD5(String pw) {
	  try {  
	        // 获取MD5转换器（如果使用SHA1则将参数换为"SHA1"）  
	        MessageDigest messageDigest =MessageDigest.getInstance("MD5");  
	        // 输入的字符串转换成字节数组  
	        byte[] inputByteArray = pw.getBytes();  
	        // inputByteArray是输入字符串转换得到的字节数组  
	        messageDigest.update(inputByteArray);  
	        // 转换并返回结果，也是字节数组，包含16个元素  
	        byte[] resultByteArray = messageDigest.digest();  
	        // 字符数组转换成字符串返回  
	        return byteArrayToHex(resultByteArray);  
	     } catch (NoSuchAlgorithmException e) {  
	        return null;  
	     }  
	 }

	/**
	 * 将字节数组转换为16进制字符串
	 * @param byteArray	字节数组
	 * @return	对应的16进制字符串
	 */
    public static String byteArrayToHex(byte[] byteArray) {  
        // 首先初始化一个字符数组，用来存放每个16进制字符  
        char[] hexDigits = {'0','1','2','3','4','5','6','7','8','9', 'A','B','C','D','E','F' };  
        // new一个字符数组，这个就是用来组成结果字符串的（解释一下：一个byte是八位二进制，也就是2位十六进制字符（2的8次方等于16的2次方））  
        char[] resultCharArray =new char[byteArray.length * 2];  
        // 遍历字节数组，转换成字符放到字符数组中  
        int index = 0; 
        for (byte b : byteArray) {  
           resultCharArray[index++] = hexDigits[b>>> 4 & 0xf];  
           resultCharArray[index++] = hexDigits[b& 0xf];  
        }
        // 字符数组组合成字符串返回  
        return new String(resultCharArray);  
    }
}
