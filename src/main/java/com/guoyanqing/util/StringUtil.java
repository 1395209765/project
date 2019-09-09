package com.guoyanqing.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtil {
	/*
	 * �������ܣ����ַ���ת����html�ı������������\n�����л����� ��Ҫ����һ���ı�ʹ��<p></p>��ǩ
	 * �����������������\n\r��������һ������\n�������ֻ����һ����\r�����滻��<br/>��ǩ��
	 * ʹ�ó�������ҳ�ı��򴫵���̨���ַ����Ϳ��ܾͻ�س����С�
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
	 * ����StringUtil������ �Ƿ�Ϊ�й������ֻ�����isPhone()���߷���
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
	 * ����StringUtil�������е��Ƿ�Ϊ����isEmail()���߷���
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
	 * �жϲ�Ϊ��
	 */
	public static boolean isNull(String string) {
		if (string != null && string != "") {
			return true;
		}
		return false;
	}
}
