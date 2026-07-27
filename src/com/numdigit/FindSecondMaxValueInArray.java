package com.numdigit;

public class FindSecondMaxValueInArray {
	public static void main(String[] args) {
		int[] n = { 25, 5, 28, 30, 45, 40, 22 };
		int firstMax = 0;
		int SecondMax = 0;

		for (int i = 0; i < n.length; i++) {
			if(n[i]>firstMax)
			{
				//firstMax=n[i];
				SecondMax=firstMax;
				firstMax=n[i];
			}
			else if(n[i]>SecondMax)
			{
				SecondMax=n[i];
//				firstMax=SecondMax;
//							
			}
		}
		System.out.println("2nd Max value : "+SecondMax);
	}
}
