package com.cn.test;

/**
 * 
 * 作者：朱俊贵 时间：2019年1月14日下午2:04:08 描述：九九乘法表
 */
public class chengfabiao {
	public static void main(String[] args) {
		int num = 9;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + j * i + "\t");
			}
			System.out.println();
		}
	}
}
