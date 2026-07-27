package com.triangle;

public class TriangleTest01 {
public static void main(String[] args) {
	
	//1 2 3 4 5 6 7
	//1 2 3 4 5 6
	//1 2 3 4 5
	//1 2 3 4
	//1 2 3
	//1 2 
	//1
	int increment=1;
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=8-i;j++) {
			System.out.print(j+" ");
			increment++;
				}
		System.out.println();
	}

}
}
