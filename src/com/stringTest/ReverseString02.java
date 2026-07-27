package com.stringTest;

public class ReverseString02 {

	public static void main(String[] args) {
		String str="Sachin";
		
		System.out.println(revStr01(str));
	}
	
	public static String revStr01(String str)
	{
		if(str.isEmpty())
		{
			return str;
		}
		return revStr01(str.substring(1))+str.charAt(0);
	}
}
