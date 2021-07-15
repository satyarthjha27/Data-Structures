package heap;

import java.util.Scanner;

public class heap_sort {
	private static void insert(int[] arr, int i) {
		int childindex=i;
		int parentindex=(childindex-1)/2;
		while(childindex>0) {
			if(arr[childindex]<arr[parentindex]) {
				int temp=arr[childindex];
				arr[childindex]=arr[parentindex];
				arr[parentindex]=temp;
				childindex=parentindex;
				parentindex=(childindex-1)/2;
			}
			else
				return;
		}
		
	}
	private static int remove(int[] arr, int i) {
		int ans=arr[0];
		arr[0]=arr[i-1];
		int index=0;
		int lchild=1;
		int rchild=2;
		while(lchild<i) {
			int minindex=index;
			if(arr[minindex]>arr[lchild]) {
				minindex=lchild;
			}
			if(rchild<i && arr[minindex]>arr[rchild]) {
				minindex=rchild;
			}
			if(minindex==index) {
				break;
			}
			else {
				int temp=arr[index];
				arr[index]=arr[minindex];
				arr[minindex]=temp;
				index=minindex;
				lchild=2*index+1;
				rchild=2*index+2;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int arr[]= {5,1,9,2,0,6};
		for(int i=0;i<arr.length;i++) {
			insert(arr,i);
		}
		for(int i=0;i<arr.length;i++) {
			arr[arr.length-1-i]=remove(arr,arr.length-i);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}



}
