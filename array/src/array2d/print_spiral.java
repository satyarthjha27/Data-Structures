package array2d;

import java.util.Scanner;

public class print_spiral {
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
			int i,j;
			for(i=0;i<n;i++) {
				for(j=0;j<m;j++) {
					
				}
			}
			t--;
		}

	}

}
