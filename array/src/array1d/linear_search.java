package array1d;

import java.util.Scanner;

public class linear_search {

	public static int[] input() {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void search(int input[] , int x) {
		for(int i=0;i<input.length;i++) {
			if(input[i]==x) {
				System.out.println(i);
				return;
			}
		}
		System.out.print("-1");
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int arr[] =input();
			int x=s.nextInt();
			search(arr,x);
			//System.out.println();
			t--;
		}
	}

}
