package dp;

import java.util.Scanner;

public class edit_Distance {

	public static int ed(String s,String t) {
		if(s.length()==0) {
			return t.length();
		}
		if(t.length()==0) {
			return s.length();
		}
		if(s.charAt(0)==t.charAt(0)) {
			return ed(s.substring(1),t.substring(1));
		}
		else {
			int op1=ed(s,t.substring(1));
			int op2=ed(s.substring(1),t);
			int op3=ed(s.substring(1),t.substring(1));
			return 1+Math.min(op1, Math.min(op2, op3));
		}
		
	}
	public static int edM(String s,String t) {
		int storage[][]=new int[s.length()+1][t.length()+1];
		for(int i=0;i<=s.length();i++) {
			for(int j=0;j<=t.length();j++) {
				storage[i][j]=-1;
			}
		}
		return edM(s,t,storage);
	}
	private static int edM(String s, String t, int[][] storage) {
		int m=s.length();
		int n=t.length();
		if(s.length()==0) {
			storage[m][n]=n;
			return n;
		}
		if(t.length()==0) {
			storage[m][n]=m;
			return m;
		}
		if(storage[m][n]!=-1) {
			return storage[m][n];
		}
		if(s.charAt(0)==t.charAt(0)) {
			storage[m][n]=edM(s.substring(1),t.substring(1),storage);
			return storage[m][n];
		}
		else {
			int op1=edM(s,t.substring(1),storage);
			int op2=edM(s.substring(1),t,storage);
			int op3=edM(s.substring(1),t.substring(1),storage);
			storage[m][n]=1+Math.min(op1, Math.min(op2, op3));
		}
		return storage[m][n];
	}
	public static int edDP(String s, String t) {
		int m=s.length();
		int n=t.length();
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++) {
			dp[i][0]=i;
		}
		for(int j=0;j<=n;j++) {
			dp[0][j]=j;
		}
		for(int i=1;i<=m;i++) {
			for(int j=1;j<=n;j++) {
				if(s.charAt(m-i)==t.charAt(n-j)) {
					dp[i][j]=dp[i-1][j-1];
				}
				else {
					dp[i][j]=1+Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j]));
				}
			}
		}
		return dp[m][n];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String t=s.next();
		System.out.println(edM(str,t));
		System.out.println(edDP(str,t));
		System.out.println(ed(str,t));

	}

}
