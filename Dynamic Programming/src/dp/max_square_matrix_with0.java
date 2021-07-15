package dp;

import java.util.Scanner;

public class max_square_matrix_with0 {

	public static int max0(int[][] arr) {
		int m=arr.length;
		int n=arr[0].length;
		int dp[][]=new int[n][m];
		int max=0;
		for(int i=m-1;i>=0;i--) {
			dp[i][n-1]=arr[i][n-1];
			if(arr[i][n-1]==0) {
				max=1;
			}
		}
		for(int j=n-1;j>=0;j--) {
			dp[m-1][j]=arr[m-1][j];
			if(arr[n-1][j]==0) {
				max=1;
			}
		}
		for(int i=m-2;i>=0;i--) {
			for(int j=m-2;j>=0;j--) {
//				if(i==m-1) {
//					dp[i][j]=arr[i][j];
//				}
//				else if(j==m-1) {
//					dp[i][j]=arr[i][j];
//				}
				if(arr[i][j]==1) {
					dp[i][j]=1;
				}
				else {
					dp[i][j]=1+Math.min(dp[i][j+1],Math.min(dp[i+1][j+1],dp[i+1][j]));
					if(dp[i][j]>max) {
						max=dp[i][j];
					}
				}
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println(max0(arr));
	}

}
