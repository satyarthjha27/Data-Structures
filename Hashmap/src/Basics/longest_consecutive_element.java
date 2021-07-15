package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class longest_consecutive_element {

	public static int[] cons(int arr[]) {
		HashSet<Integer> map=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			map.add(arr[i]);
		}
		ArrayList<Integer> ans1=new ArrayList<>();
		ArrayList<Integer> ans=new ArrayList<>();
		int ans5[]=null;
		for(int i=0;i<arr.length;i++) {
			if(!map.contains(arr[i]-1)) {
				int j=arr[i];
				while(map.contains(j)) {
					//ans1.add(arr[j]);
					j++;
				}
				int ans3[]=new int[j];
				j=arr[i];
				while(map.contains(j)) {
					ans3[j]=arr[j];
				}
				int max=ans3.length;
				if(max< j-arr[i]) {
					ans5=ans3;
					ans3=null;
				}
			}
		}
		return ans5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int  ans[]=cons(arr);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

}
