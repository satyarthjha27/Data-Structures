package dp;

import java.util.Scanner;

public class Longest_increading_subsequence {
//
//	public static int lis(int arr[]) {
//		return lis(arr,Integer.MIN_VALUE,0);
//	}
//	private static int lis(int[] arr, int prev, int i) {
//		if(i==arr.length) {
//			return 0;
//		}
//		int taken=0;
//		if(arr[i]>prev) {
//			return 1+lis(arr,arr[i],i+1);
//		}
//		int nottaken=lis(arr,prev,i+1);
//		
//		return Math.max(taken, nottaken);
//	}
//	public static int lisM(int arr[]) {
//		int storage[][]=new int[arr.length+1][arr.length];
//		for(int i=0;i<arr.length+1;i++) {
//			for(int j=0;j<arr.length;j++) {
//				storage[i][j]=-1;
//			}
//		}
//		return lisM(arr,Integer.MIN_VALUE,0,storage);
//	}
//	private static int lisM(int[] arr, int prev, int i, int[][] storage) {
//		if(arr.length==i) {
//			storage[i][i]=0;
//			return 0;
//		}
//		return 0;
//	}
	public static int lisDP(int arr[]) {
		int dp[]=new int[arr.length];
		dp[0]=1;
		int ans=0;
		for(int i=1;i<arr.length;i++) {
			int maxval=0;
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					if(dp[j]>maxval) {
						maxval=dp[j];
					}
				}
			}
			dp[i]=maxval+1;
			ans=Math.max(ans, dp[i]);
		}
			return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(lisDP(arr));

	}

}
