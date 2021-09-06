/*
 * Given 2 strings, a and b, return a string of the form short+long+short, 
 * with the shorter string on the outside and the longer string on the inside. 
 * The strings will not be the same length, but they may be empty (length 0). 
 * If input is "hi" and "hello", then output will be "hihellohi".
 * */

package com.w3epic.wiprotraining.assignment6;

public class Assignment6 {

	public static void main(String[] args) {
		String a = "hi";
		String b = "hello";
		String output;

		if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;
		
		System.out.println(output);
	}

}
