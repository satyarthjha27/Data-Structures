package array2d;

import java.util.Scanner;

public class largest_row_coloum_sum {
	public static int[][] input(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int arr[][]=input();
			int n=arr.length;
			int m=arr[0].length;
			int i,j,index=0;
			int index1=0;
			int large=Integer.MIN_VALUE;
			int large1=Integer.MIN_VALUE;
			for(i=0;i<n;i++) {
				int sum=0;
				//int sum1=0;
				for(j=0;j<m;j++) {
					sum+=arr[i][j];
					if(sum>large) {
						large=sum;
						index=i;
					}
				}
			}
			for(j=0;j<m;j++) {
				int sum1=0;
				for(i=0;i<n;i++) {
					sum1+=arr[i][j];
					if(sum1>large1) {
						large1=sum1;
						index1=j;
					}
				}
			}
			if(large>=large1) {
				System.out.println("row "+index+" "+large);
			}
			else {
				System.out.println("column "+index1+" "+large1);
			}
			t--;
		}
	}
}

