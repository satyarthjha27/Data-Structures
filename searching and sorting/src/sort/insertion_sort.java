package sort;

import java.util.Scanner;

public class insertion_sort {

	public static void sort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n-1;i++) {
			int temp = arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
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
