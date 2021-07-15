package strings;

import java.util.Arrays;
import java.util.Scanner;

public class check_permutation {

	public static boolean permutation(String str,String str1) {
		int i,j;
		char ch1[]=str.toCharArray();
		char ch2[]=str1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(str.length()!=str1.length())
			return false;
		for(i=0;i<str.length();i++) {
			if(ch1[i]!=ch2[i])
				return false;
		}
		return true;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.next();
		String st=s.next();
		//System.out.println(str.length());
		System.out.println(permutation(str,st));
	}

}
