package array1d;

import java.util.Scanner;

public class return_array_sum {

	public static int[] input() {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void sum(int input[]) {
		int sum =0;
		for(int i=0;i<input.length;i++) {
			sum+=input[i];
		}
		System.out.print(sum);
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int arr[] =input();
			sum(arr);
			//System.out.println();
			t--;
		}
	}

}
