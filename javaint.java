import java.util.Arrays;
import java.util.List;

/**
  * The following program has a reverse method that has a String parameter "in".
  * The Program is meant to return the reverse of the input parameter.
  * Fix all issues which are preventing this Program from achieving this purpose.
  * 
  * Copyright (c) 2019 3M Health Information Systems. All rights reserved.
  */

class InterviewProgramThree {
	static String reverseString;
	
	public String reverse(String in) {
        reverseString = "";
        int x = in.length()-1;
		for (int i = 0; i <=x; i++) {
            x = in.length()-1;
            reverseString += in.charAt(x - i);
            System.out.println(x-i);
		}
		return reverseString;
    }
    public static void main (String [] args){
        InterviewProgramThree mysolution = new InterviewProgramThree();
        System.out.println(mysolution.reverse("hello"));
    }
}