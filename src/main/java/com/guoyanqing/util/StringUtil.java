package com.guoyanqing.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	/*
	 * 方法功能：将字符串转换成html文本，如果遇到“\n”换行换符， 则要将这一段文本使用<p></p>标签
	 * 包起来。如果遇到“\n\r”两个在一起按上面\n处理。如果只遇到一个“\r”则替换成<br/>标签。
	 * 使用场景：网页文本框传到后台的字符串就可能就会回车换行。
	 */
	public static String isHtml(String text) {
		StringBuffer buffer = new StringBuffer();
		String[] split = text.split("(\r\n)");
		for (String string : split) {
			buffer.append("<p>");
			String replaceAll = string.replaceAll("(\r)", "<br/>");
			buffer.append(replaceAll);
			buffer.append("</p>");
		}
		return buffer.toString();
	}

	/*
	 * 测试StringUtil工具类 是否为中国地区手机号码isPhone()工具方法
	 */
	public static boolean isPhone(String phone) {
		Pattern pattern = Pattern.compile("^1[3|4|5|7|9]\\d{9}$");
		Matcher matcher = pattern.matcher(phone);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	/*
	 * 测试StringUtil工具类中的是否为邮箱isEmail()工具方法
	 */
	public static boolean isEmail(String email) {
		Pattern pattern = Pattern.compile("^[A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]+$");
		Matcher matcher = pattern.matcher(email);
		if (matcher.matches()) {
			return true;
		}
		return false;
	}

	/*
	 * 判断不为空
	 */
	public static boolean isNull(String string) {
		if (string != null && string != "") {
			return true;
		}
		return false;
	}
}
