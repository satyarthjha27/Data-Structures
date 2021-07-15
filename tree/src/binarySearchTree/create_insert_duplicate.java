package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class create_insert_duplicate {
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
	public static void printLevel(binarynode<Integer> root) {
		if(root==null) {
			return;
		}
		Queue<binarynode<Integer>> queue = new LinkedList<binarynode<Integer>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			binarynode<Integer> first=queue.poll();
			System.out.print(first.data+" ");
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

	public static binarynode<Integer> create(binarynode<Integer> root){
		if(root==null) {
			return null;
		}
		binarynode<Integer> newNode=new binarynode<>(root.data);
		binarynode<Integer> temp=root.left;
		root.left=newNode;
		newNode.left=temp;
		create(root.left.left);
		create(root.right);
		return root;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		root=create(root);
		printLevel(root);
	}

}
