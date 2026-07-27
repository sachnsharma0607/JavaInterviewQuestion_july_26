package com.stringTest;

public class ReverSTring {
public static void main(String[] args) {
	String str="India";
	System.out.println(revStr(str));
}

 static String revStr(String str1)
{
	if(str1.isBlank())
	{
		return str1;
	}
	else {
		 return   str1.charAt(str1.length()-1) + revStr(str1.substring(0,str1.length()-1));
	}
}
}
