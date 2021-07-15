package dp;

import java.util.Scanner;

public class loot_house {
	public static int loot(int arr[]) {
		int dp[]=new int[arr.length];
		if(arr.length==0) {
			return 0;
		}
		if(arr.length==1) {
			return arr[0];
		}
		if(arr.length==2) {
			return Math.max(arr[1], arr[0]);
		}
		dp[0]=arr[0];
		dp[1]=Math.max(arr[1], arr[0]);
		for(int i=2;i<arr.length;i++) {
			dp[i]=Math.max(dp[i-2]+arr[i], dp[i-1]);
		}
		return dp[arr.length-1];
	}

//	private static int loot(int[] arr, int i) {
//		if(i==0) {
//			return 0;
//		}
//		if(i==1) {
//			return arr[i];
//		}
//		if(i==2) {
//			return Math.max(arr[0], arr[1]);
//		}
//		int val1=arr[0];
//		int val2=Math.max(arr[0], arr[1]);
//		for(int i=2;i<n;i++)
//	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(loot(arr));
	}

}
