package Basics;

import java.util.HashMap;
import java.util.Scanner;

public class PairSumTo0 {

	public static void pair(int a[]) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			int temp=-a[i];
			if(map.containsKey(temp)) {
				if(temp<a[i])
				System.out.println(temp +" "+ a[i]);
				else
					System.out.println(a[i]+" "+temp);
			}
			map.put(a[i],1);
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
		pair(arr);
	}

}
