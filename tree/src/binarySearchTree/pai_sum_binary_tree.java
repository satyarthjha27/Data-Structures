package binarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class pai_sum_binary_tree {
	public static binarynode<Integer> takeInputLevel(){
		Scanner s=new Scanner(System.in);
		int rootdata;
		queueLL<binarynode<Integer>> queue=new queueLL<>();
		System.out.println("Enter root data ");
		rootdata=s.nextInt();
		if(rootdata==-1) {
			return null;
		}
		binarynode<Integer> root=new binarynode<>(rootdata);
		queue.enqueue(root);
		binarynode<Integer> front;
		while(!queue.isEmpty()) {
			try {
				front=queue.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter the Left Child of "+front.data);
			int left=s.nextInt();
			if(left!=-1) {
				binarynode<Integer> child=new binarynode<>(left);
				queue.enqueue(child);
				front.left=child;
			}
			System.out.println("Enter the Right Child of "+front.data);
			int right=s.nextInt();
			if(right!=-1) {
				binarynode<Integer> child=new binarynode<>(right);
				queue.enqueue(child);
				front.right=child;
			}
		}
		return root;
	}
	static ArrayList<Integer> arr=new ArrayList<>();
	public static void sum(binarynode<Integer> root, int s) {
		if(root==null) {
			return;
		}
		arr.add(root.data);
		sum(root.left,s);
		sum(root.right,s);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		sum(root,n);
		for(int i=0;i<arr.size();i++) {
			for(int j=i;j<arr.size();j++) {
				if((arr.get(i)+arr.get(j))==n) {
					System.out.println(arr.get(i)+" "+arr.get(j));
				}
			}
		}
	}

}
