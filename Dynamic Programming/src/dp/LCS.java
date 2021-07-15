package dp;

import java.util.Scanner;

public class LCS {

	public static int lcs(String s, String t) {
		if(s.length()==0 || t.length()==0) {
			return 0;
		}
		if(s.charAt(0)==t.charAt(0)) {
			return 1+ lcs(s.substring(1),t.substring(1));
		}
		else {
			int op1=lcs(s.substring(1),t);
			int op2=lcs(s,t.substring(1));
			//int op3=lcs(s.substring(1),t.substring(1)); not needed as this case is already taken in the above 2 option.
			return Math.max(op1, op2);
		}
	}
	public static int lcsM(String s,String t) {
		int storage[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<=s.length();i++) {
			for(int j=0;j<=t.length();j++) {
				storage[i][j]=-1;
			}
		}
		return lcsM(s,t,storage);
	}
	private static int lcsM(String s, String t, int[][] storage) {
		int m=s.length();
		int n=t.length();
		if(storage[m][n]!=-1) {
			return storage[m][n];
		}
		if(m==0 || n==0) {
			storage[m][n]=0;
			return 0;
		}
		if(s.charAt(0)==t.charAt(0)) {
			storage[m][n]= 1+ lcsM(s.substring(1),t.substring(1),storage);
		}
		else {
			int op1=lcsM(s.substring(1),t,storage);
			int op2=lcsM(s,t.substring(1),storage);
			//int op3=lcs(s.substring(1),t.substring(1)); not needed as this case is already taken in the above 2 option.
			storage[m][n]=Math.max(op1, op2);
		}
		return storage[m][n];
	}
	public static int lcsDP(String s,String t) {
		int m=s.length();
		int n=t.length();
		int dp[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<m;i++) {
			dp[i][0]=0;
		}
		for(int j=0;j<n;j++) {
			dp[0][j]=0;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(m-i)==t.charAt(n-j)) {
					dp[i][j]=1+dp[i-1][j-1];
				}
				else {
					dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
				}
			}
		}
		return dp[m][n];
	}
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		String t=s.next();
		String str=s.next();
		System.out.println(lcs(t,str));
		System.out.println(lcsM(t,str));
		System.out.println(lcsDP(t,str));
	}

}
