package com.tutorials4u.interceptor;

public class TestLoggerAction {

	public String execute()
	{
		System.out.println("From Action");
		return "success";
	}
}
