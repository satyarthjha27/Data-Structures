package dp;

import java.util.Scanner;

public class min_cost_path {
	public static int path(int arr[][]) {
		return path(arr,0,0);
		
	}

	private static int path(int[][] arr, int i, int j) {
		int n=arr.length;
		int m=arr[0].length;
		if(i==n-1 && j==m-1) {
			return arr[i][j];
		}
		if(i>=n||j>=m) {
			return Integer.MAX_VALUE;
		}
		int op1=path(arr,i,j+1);
		int op2=path(arr,i+1,j+1);
		int op3=path(arr,i+1,j);
		int ans=Math.min(op1, Math.min(op2, op3));
		ans+=arr[i][j];
		return ans;
	}

	public static int pathM(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		int storage[][]=new int[n][m];
		return (pathM(arr,0,0,storage));
	}


	private static int pathM(int[][] arr, int i, int j, int[][] storage) {
		int n=arr.length;
		int m=arr[0].length;
		if(i==n-1&&j==m-1) {
			storage[i][j]=arr[i][j];
			return storage[i][j];
		}
		if(i>=n||j>=m) {
			return Integer.MAX_VALUE;
		}
		if(storage[i][j]!=0) {
			return storage[i][j];
		}

		int op1=pathM(arr,i,j+1,storage);
		int op2=pathM(arr,i+1,j+1,storage);
		int op3=pathM(arr,i+1,j,storage);
		storage[i][j]=Math.min(op1, Math.min(op2, op3));
		storage[i][j]+=arr[i][j];
		return storage[i][j];
	}
	public static int pathDP(int arr[][]) {
		int n=arr.length;
		int m=arr[0].length;
		int dp[][]=new int[n][m];
		dp[n-1][m-1]=arr[n-1][m-1];
		for(int j=m-2;j>=0;j--) {
			dp[n-1][j]=dp[n-1][j+1]+arr[n-1][j];
		}
		for(int i=n-2;i>=0;i--)
			dp[i][m-1]=dp[i+1][m-1]+arr[i][m-1];
		for(int i=n-2;i>=0;i--) {
			for(int j=m-2;j>=0;j--) {
				dp[i][j]=arr[i][j]+(Math.min(dp[i][j+1],Math.min(dp[i+1][j+1], dp[i+1][j])));
			}
		}
		return dp[0][0];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int array[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				array[i][j]=s.nextInt();
			}
		}
		System.out.println(pathM(array));
		System.out.println(pathDP(array));

	}

}
