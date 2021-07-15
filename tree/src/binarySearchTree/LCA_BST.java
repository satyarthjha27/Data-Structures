package binarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class LCA_BST {
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

	public static int lca(binarynode<Integer> root, int n1,int n2) {
		if(root==null) {
			return -1;
		}
		if (root.data > n1 && root.data > n2)
            return lca(root.left, n1, n2);
        if (root.data < n1 && root.data < n2) 
            return lca(root.right, n1, n2);
   
        return root.data;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println(lca(root,n1,n2));
	}

}
