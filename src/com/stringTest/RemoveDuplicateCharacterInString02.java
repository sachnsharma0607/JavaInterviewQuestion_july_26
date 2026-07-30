package com.stringTest;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateCharacterInString02 {
public static void main(String[] args) {
	String string = "aabbccdefatafaz";

 List<String> ch = Arrays.asList(string.split("\\W"));
 System.out.println(ch);
 Set<String> remoeduplicate=new LinkedHashSet<>(ch);
 
 System.out.println(remoeduplicate);
}
}
