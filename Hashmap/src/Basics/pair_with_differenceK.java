package Basics;

import java.util.HashSet;
import java.util.Scanner;

public class pair_with_differenceK {

	public static void diff(int a[], int k) {
		HashSet<Integer> map=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			map.add(a[i]);
		}
		for(int i=0;i<a.length;i++) {
			int dif=a[i]-k;
			if(map.contains(dif)) {
				if(dif<=a[i]) {
					System.out.println(dif+" "+ a[i]);
				}
				else
					System.out.println(a[i]+" "+dif);
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
		int k=s.nextInt();
		diff(arr,k);
	}

}
