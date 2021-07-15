package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class construct_BST {
	public static void pre(binarynode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		pre(root.left);
		pre(root.right);
	}
	public static binarynode<Integer> construct(int arr[], int si,int ei){
		if(si>ei) {
			return null;
		}
		int mid=(si+ei)/2;
		binarynode<Integer> root=new binarynode<Integer>(arr[mid]);
		root.left=construct(arr,si,mid-1);
		root.right=construct(arr,mid+1,ei);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		binarynode<Integer> root=construct(arr,0,arr.length-1);
		pre(root);
	}

}
