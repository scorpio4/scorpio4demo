package com.scorpio4.demo;

/**
 * scorpio4-oss (c) 2014
 * Module: com.scorpio4.demo
 * User  : lee
 * Date  : 3/07/2014
 * Time  : 11:59 AM
 */
public class Example1 {
	String msg="undefined";

	public Example1() {
		msg = "Example1";
	}

	public Example1(String msg) {
		this.msg=msg;
	}

	public Example1(String msg, Example1_1 example1_1) {
		this.msg=msg+" @ "+example1_1;
	}

	public String toString() {
		return msg;
	}
}
