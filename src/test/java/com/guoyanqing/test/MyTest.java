package com.guoyanqing.test;

import org.junit.Test;

import com.guoyanqing.util.StringUtil;

public class MyTest {
	@Test
	public void testPhone() {
		boolean phone = StringUtil.isPhone("11111111111");
		System.out.println(phone);
	}

	@Test
	public void testEmail() {
		boolean email = StringUtil.isEmail("1395209765@.com");
		System.out.println(email);
	}

	@Test
	public void testHtml() {
		String html = StringUtil.isHtml("ÄãºÃ\r\n¹ùêÌÇåHellow");
		System.out.println(html);
	}
}
