package com.Anderson.homework3;

import java.util.Date;

public final class A {

	private String S;
	private Date d;
	
	public Date getDate() 
	{
		return (Date) d.clone();
		
	}
	
	public String getString()
	{
		return S;
	}
	
	public A (String Str, Date c)
	{
		this.S = Str;
		this.d = c;
	}
}
