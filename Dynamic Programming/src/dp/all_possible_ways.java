package dp;

import java.util.Scanner;

public class all_possible_ways {
	public static int ways(int a, int b) {
		int n=(int)(Math.log(a)/Math.log(b));
		int dp[]=new int[n+1];
		return n;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int b=s.nextInt();
		System.out.println(ways(n,b));

	}

}
