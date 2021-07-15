package dp;

import java.util.Scanner;

public class chain_tower {
	public static String chain(int n,int x,int y) {
		boolean dp[]=new boolean[n+1];
		dp[0]=false;
		dp[1]=true;
		for(int i=2;i<=n;i++) {
			if((i-1)>=0 && dp[i-1]==false)
				dp[i]=true;
			else if((i-x)>=0 && dp[i-x]==false)
				dp[i]=true;
			else if((i-y)>=0 && !dp[i-y])
				dp[i]=true;
			else
				dp[i]=false;
		}
		if(dp[n]==true)
			return "Beerus";
		else
			return "Whis";
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt(),y=s.nextInt();
		System.out.println(chain(n,x,y));

	}

}
