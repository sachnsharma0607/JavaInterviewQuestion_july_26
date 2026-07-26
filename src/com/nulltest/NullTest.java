package com.nulltest;

public class NullTest {
	public static void main(String[] args) {
		String str = null;
		Employee emp=null;
		if (str == null) {
			System.out.println("String has null special value");
		}
		if (emp == null) {
			System.out.println("Employee has null special value with out assgine null value");
		} 
		try {
			emp.equals(null);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("emp used equal method when emp is null. we are going to Exception block");
		}
		
			
		}
}

class Employee {

}