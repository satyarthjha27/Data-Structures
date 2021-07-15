package search;

import java.util.Scanner;

public class binary_search {
	public static int search(int arr[],int x) {
		int start=0;
		int end= arr.length - 1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(x==arr[mid]	) {
				return mid+1;

			}
			else if(x>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return -1;

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int x=s.nextInt();
		int y=search(arr,x);
		System.out.println(y);
	}

}
