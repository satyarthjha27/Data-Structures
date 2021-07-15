package binarySearchTree;

import java.util.Scanner;

import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class largest_BST {
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

	public static int large(binarynode<Integer> root) {
		if(root==null) {
			return 0;
		}
		boolean ans=isBST(root);
		if(ans)
			return height(root);
		int ans1=large(root.left);
		int ans2=large(root.right);
		return Math.max(ans1, ans2);
	}
	public static int height(binarynode<Integer> root) {
		if(root==null) {
			return 0;
		}
		return 1+Math.max(height(root.left), height(root.right));
	}
	public static boolean isBST(binarynode<Integer> root) {
		if(root==null) {
			return true;
		}
		int max=max(root.left);
		int min=min(root.right);
		if(root.data<=max) {
			return false;
		}
		if(root.data>=min){
			return false;
		}
		boolean left=isBST(root.left);
		boolean right=isBST(root.right);
		if(left && right) {
			return true;
		}
		else
			return false;
		
	}
	public static int min(binarynode<Integer> root) {
		if(root==null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data,Math.min(min(root.left), min(root.right)));
	}
	public static int max(binarynode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data,Math.max(max(root.left), max(root.right)));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		System.out.println(large(root));
	}

}
