package com.numdigit;

public class RevDigit {
	public static void main(String[] args) {
		int n = 12456;
		int revnumber = 0;
		while (n > 0) {
			revnumber=10*revnumber+n%10;
			n=n/10;
			
		}
		System.out.println(revnumber);
	}
}
