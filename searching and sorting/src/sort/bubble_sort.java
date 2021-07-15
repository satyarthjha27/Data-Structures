package sort;

import java.util.Scanner;

public class bubble_sort {
	
	public static void sort(int arr[]) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp =arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i;
		int arr[]=new int[n];
		for(i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		sort(arr);
		for(i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
