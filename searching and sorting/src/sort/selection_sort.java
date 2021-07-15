package sort;

import java.util.Scanner;

public class selection_sort {
	public static void sort(int arr[]) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int min=arr[i];
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}
			arr[minIndex]=arr[i];
			arr[i]=min;
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
