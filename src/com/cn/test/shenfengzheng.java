package com.cn.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * 作者：朱俊贵 时间：2019年1月14日下午2:22:04 描述：身份证——要么是15位，要么是18位，最后⼀位可以为字⺟，并写程序提出 其中的年月日
 */
public class shenfengzheng {
	public static void main(String[] args) {
		// 测试是否合法的身份证号码
		String str[] = { "130681198712092019", "12345678901234x", "13068119871209201", "123456789012345",
				"12345678901234x" };
		Pattern p1 = Pattern.compile("(\\d{17}[0-9a-zA-Z]|\\d{14}[0-9a-zA-Z])");
		for (int i = 0; i < str.length; i++) {
			Matcher matcher = p1.matcher(str[i]);
			System.out.println(str[i] + ":" + matcher.matches());
		}

		// 用于提取出生日的字符串
		Pattern p2 = Pattern.compile("(\\d{8})");
		// 将生日字符串进行拆分成年月日
		Pattern p3 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})");
		for (int i = 0; i < str.length; i++) {
			Matcher matcher = p2.matcher(str[i].substring(6, 14));
			boolean b = matcher.find();
			if (b) {
				String s = matcher.group(1);
				Matcher matcher2 = p3.matcher(s);
				if (matcher2.find()) {
					System.out.println(
							"生日为：" + matcher2.group(1) + "年" + matcher2.group(2) + "月" + matcher2.group(3) + "日");

				}

			}

		}

	}

}
