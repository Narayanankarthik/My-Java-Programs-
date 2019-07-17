package com.polaris.alertLayoutDesign.action;

public class StringImmutableExe {
	
	public StringImmutableExe()
	{
		System.out.println("cons");
	}
	

	public static void main(String[] args) 
	{
		String s="hello";
		String s1="hello";
		if(s==s1)
		{
			System.out.println("true");
		}
		s1="hell";
		if(s.equals(s1))
		{
			System.out.println("true2");
		}
		
		System.out.println(s.concat("hello"));

	}

}
