package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class levelwise_linkedlist {

	public static void printLevel(binarynode<Integer> root) {
 		if(root==null) {
 			return;
 		}
 		Queue<binarynode<Integer>> queue = new LinkedList<binarynode<Integer>>();
 		queue.add(root);
 		while(!queue.isEmpty()) {
 			binarynode<Integer> first=queue.poll();
 			System.out.print(first.data);
 			if(first.left!=null) {
 				System.out.print(" L:"+ first.left.data+",");
 				queue.add(first.left);
 			}
 			if(first.right!=null) {
 				System.out.print(" R:"+first.right.data);
 				queue.add(first.right);
 			}
 			System.out.println();
 		}
 	}
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

	public static int[] replace(binarynode<Integer> root) {
		if(root==null) {
			return null;
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		int arr[]=replace(root);
		for(int i=0;i<arr.length;i++) {
			System.out.println();
		}
	}

}
