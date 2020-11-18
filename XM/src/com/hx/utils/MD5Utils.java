package com.hx.utils;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 * 使用MD5进行设置一个工具类
 */
public class MD5Utils {
	//制作一个MD5加密的方法
	public static String md5Code(String msg) {
		//定义一个字节数组对象
		byte[] secretBytes = null;
		//设置异常捕获
		try {
			//当前我们通过一个MD5的加密对象计算加密
			MessageDigest md = MessageDigest.getInstance("MD5");
			//对字符串进行加密的处理
			md.update(msg.getBytes());
			//获取加密之后的数据
			secretBytes = md.digest();
		}catch(Exception e) {
			//当前如果出现了任何异常，我们都算是一个异常的出现。
			System.out.println("很抱歉，当前的加密失败了！");
		}
		//将加密后的数据转换成16进制的一个数字
		String result = new BigInteger(1,secretBytes).toString(16);//16就是16进制。
		//如果当前生成的字符结果为满足32位，我们需要在前端，左边补充0
		for (int i = 0; i < 32 - result.length(); i++) {
			result = "0" + result;
		}
		//做完后，就可以返回result字符串，结果。
		return result;
	}
}
