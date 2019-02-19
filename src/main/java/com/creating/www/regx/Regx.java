package com.creating.www.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regx {

	public static void main(String[] args) {
		String filePath = "doc/busiaccess.^2018-09-14.log11";
		String reg = "[^0-9]+";
		Pattern p = Pattern.compile(reg);
		Matcher mc = p.matcher(filePath);
		int count = 0;
		while (mc.find()) {
			count++;
			System.out.println(count + "," + mc.group());
			System.out.println(mc.start() + "," + mc.end());
		}
		// System.out.println(filePath.length()+" "+mc.regionEnd());
		// System.out.println(mc.replaceAll(" "));
		System.out.println(mc.matches());// 整个匹配才会是true
		System.out.println(mc.lookingAt());// 匹配到开头才会是TRUE
		mc.reset();
		StringBuffer sb = new StringBuffer();
		while (mc.find()) {
			mc.appendReplacement(sb, "-");
		}
		System.out.println(sb.toString());
		mc.appendTail(sb);
		System.out.println(sb.toString());
	}

}
