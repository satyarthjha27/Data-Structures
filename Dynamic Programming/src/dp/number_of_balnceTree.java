package dp;

import java.util.Scanner;

public class number_of_balnceTree {
	public static int bal(int n) {
		if(n==0||n==1) {
			return 1;
		}
		int x=bal(n-1);
		int y=bal(n-2);
		int ans=((x*x)+(2*x*y));
		return ans;
	}
	public static int balM(int n) {
		int storage[]=new int[n+1];
		return balM(n,storage);
	}
	private static int balM(int n, int[] storage) {
		if(n==0||n==1) {
			storage[n]=1;
			return 1;
		}
		if(storage[n]!=0) {
			return storage[n];
		}
		int x=balM(n-1,storage);
		int y=balM(n-2,storage);
		storage[n]=((x*x)+(2*x*y));
		return storage[n];
	}
	public static int balDP(int n) {
		int dp[]=new int[n+1];
		dp[0]=dp[1]=1;
		for(int i=2;i<=n;i++) {
			int x=dp[i-1];
			int y=dp[i-2];
			dp[i]=((x*x)+(2*x*y));
		}
		return dp[n];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(balM(n));
		System.out.println(bal(n));
		System.out.println(balDP(n));
	}

}
