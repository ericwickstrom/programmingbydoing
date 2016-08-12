package com.beardsmcgee.programmingbydoing;

/*
 * Write a program that prints the numbers from 1 to 100. 
 * But for multiples of three print "Fizz" instead of the number and for the multiples of five print "Buzz". 
 * For numbers which are multiples of both three and five print "FizzBuzz".
 */

public class FizzBuzz {
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";
	private static final String SPACE = " ";
	
	public static final void main(String[] args){
		for(int i = 1; i <= 100; i++){
			StringBuilder sb = new StringBuilder();
			sb.append(String.valueOf(i));
			sb.append(SPACE);
			if(i % 3 == 0){
				sb.append(FIZZ);
			}
			if(i % 5 == 0){
				sb.append(BUZZ);
			}
			System.out.println(sb.toString());
		}
	}
}
