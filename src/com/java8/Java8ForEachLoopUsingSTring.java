package com.java8;

import java.util.Arrays;
import java.util.List;

public class Java8ForEachLoopUsingSTring {
public static void main(String[] args) {
	//Looping Java
	String str="Alice,Bob,Charlie";
	 List<String> users = Arrays.asList(str.split("\\,"));
     // Using a Lambda expression to iterate and print
     users.forEach(user -> System.out.println(user));
	
}
}
