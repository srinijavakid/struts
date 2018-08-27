package com.tutorials4u.interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class SampleAction extends ActionSupport{

	private static final long serialVersionUID = 1L;

	public void validate()
	{
		System.out.println("validate() method called");
	}
	
	public String populate()
	{
		System.out.println("populate() method called");
		return "populate";
	}
	
	public String execute()
	{
		System.out.println("execute() method called");
		return SUCCESS;
	}
}
