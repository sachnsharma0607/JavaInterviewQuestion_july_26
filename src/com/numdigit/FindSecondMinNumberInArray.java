package com.numdigit;

public class FindSecondMinNumberInArray {

	public static void main(String[] args) {
		int[] n = { 25, 35, 28, 30, 45, 40, 22 };
		int firstMin = Integer.MAX_VALUE;
		int SecondMin = Integer.MAX_VALUE;
		for (int i = 0; i < n.length; i++) {
			if(n[i]<firstMin)
			{
				SecondMin=firstMin;
				firstMin=n[i];
			}
			else if(n[i]<SecondMin) {
				
				SecondMin=n[i];
				
			}
			
		}
		System.out.println("Second Min value : "+SecondMin);
	}
}
