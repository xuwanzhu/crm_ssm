package com.qidi.crm_ssm.common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLFunctions
{
	/**
	 * 以指定的编码方式对字符串进行解码
	 * @param s：要解码的字符串
	 * @param enc：解码的编码方式，如 utf-8
	 * @return 解码后的字符串
	 */
	public static String decode(String s, String enc)
	{
		try
		{
			return URLDecoder.decode(s, enc);
		} 
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * 以指定的编码方式对字符串进行编码
	 * @param s：要编码的字符串
	 * @param enc：解码的编码方式，如 utf-8
	 * @return 编码后的字符串
	 */
	public static String encode(String s, String enc)
	{
		try
		{
			return URLEncoder.encode(s, enc);
		} 
		catch (UnsupportedEncodingException e)
		{
			throw new RuntimeException(e);
		}
	}
}