package com.polaris.alertLayoutDesign.action;

import java.util.concurrent.ConcurrentHashMap;

public class CHashmap {

	public static void main(String[] args) throws Exception
	{
		try
		{
		ConcurrentHashMap<String,String> ch = new ConcurrentHashMap<String,String>();
		//ch.put(null,null);
		ch.put("K1", "Value-1");
		ch.put("K2","Value-2");
		System.out.println(ch.entrySet());
		System.out.println(ch.containsKey("k2"));
		System.out.println(ch);
		ch.put("K3","Value-3");
		ch.clear();
		System.out.println(ch);
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			System.out.println("Finally called..");
		}
			
		

	}

}
