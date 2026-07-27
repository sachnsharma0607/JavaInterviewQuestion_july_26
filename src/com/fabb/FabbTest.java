package com.fabb;

public class FabbTest {
public static void main(String[] args) {
	int a=1;
	int b=1;
	int c=0;
	System.out.print(a+" ");
	System.out.print(a+" ");
	for(int i=1;i<6;i++)
	{
		c=a+b;
		System.out.print(c+" ");
		b=a;
		a=c;
		
	}
}
}
