package Basics;

import java.util.HashMap;
import java.util.Scanner;

public class longest_subset_0_sum {

	public static int sub(int a[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(sub(arr));
	}

}
