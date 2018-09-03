
/*
Write a program to print all permutations of a given string
A permutation, also called an “arrangement number” or “order,” is a rearrangement of the elements of an ordered list S into a one-to-one correspondence with S itself. A string of length n has n! permutation.

Below are the permutations of string ABC.
ABC ACB BAC BCA CBA CAB

*/


import java.util.*;
public class Permutation
{
	public static void main(String[] args)
	{
		String str = "ABC";
		int n = str.length();
		Permutation permutation = new Permutation();
		permutation.permute(str,0, new StringBuilder(), new boolean[str.length()]);
	}


	public void permute(String str, int start, StringBuilder sb, boolean[] seen){
	    if(sb.length() == str.length())
	        System.out.println(sb.toString());
	    for(int i = 0; i < str.length(); i++){
	        if(seen[i])
	            continue;
	        sb.append(str.charAt(i));
	        seen[i] = true;
	        permute(str,i+1,sb,seen);
	        sb.deleteCharAt(sb.length()-1);
	        seen[i] = false;
	    }
	    
	}
	

	


