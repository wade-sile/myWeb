package com.util;

import java.security.MessageDigest;
import org.springframework.util.DigestUtils;

public class MD5Util {
	private static final String salt="salt^****@Y$*";
	
	public static String getMD5(String str) {
		String base = str+"/"+salt;
		String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
		return md5;
	}
	//非框架的方法
//	public static String encrypt(String dataStr) {
//		try {
//			dataStr = dataStr + salt;
//			MessageDigest m = MessageDigest.getInstance("MD5");
//			m.update(dataStr.getBytes("UTF8"));
//			byte s[] = m.digest();
//			String result = "";
//			for (int i = 0; i < s.length; i++) {
//				result += Integer.toHexString((0x000000FF & s[i]) | 0xFFFFFF00).substring(6);
//			} 
//			return result;
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return "";
//	}
}
