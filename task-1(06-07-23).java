/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

class GFG {
    public static boolean isSubstring(String s1, String s2)
    {
        int M = s1.length();
        int N = s2.length();
    
        for (int i = 0; i <= N - M; i++) {
            int j;
            for (j = 0; j < M; j++)
                if (s2.charAt(i+j) != s1.charAt(j))
                    break;
     
            if (j == M)
                return true;
        }
     
        return false;
    }
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int no_of_string = scn.nextInt();
        
        String first = scn.next();
        
	    ArrayList<String> arr = new ArrayList<String>(no_of_string);
	    
	    for(int i = 0; i < no_of_string; i++) {
	        String s = scn.nextLine();
	        arr.add(s);
	    }
	    
	    for(String str : arr) {
	        if(isSubstring(str, first)){
	            System.out.println('Y');
	        }else {
	            System.out.println('N');
	        }
	    }
	    
	}
}
