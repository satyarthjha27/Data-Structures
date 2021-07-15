package Basics;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Print_array_intersection {

	public static void print(int a1[], int a2[]) {
		HashMap<Integer, Integer> map1=new HashMap<>();
		HashMap<Integer, Integer> map2=new HashMap<>();
		for(int i=0;i<a1.length;i++) {
			map1.put(a1[i], null);
		}
		for(int i=0;i<a2.length;i++) {
			map2.put(a2[i], null);
		}
		for(int i=0;i<a1.length;i++) {
			int temp=a1[i];
			if(map2.containsKey(temp)) {
				System.out.println(temp);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int m=s.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++) {
			arr1[i]=s.nextInt();
		}
		print(arr,arr1);
	}

}
