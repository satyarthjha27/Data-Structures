package dp;

import java.util.Scanner;

public class shortest_subsequence {

	public static int ss(String s,String t) {
		int m=s.length();
		int n=t.length();
		int dp[][]=new int[m+1][n+1];
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String t=s.next();
		System.out.println(ss(str,t));

	}

}
