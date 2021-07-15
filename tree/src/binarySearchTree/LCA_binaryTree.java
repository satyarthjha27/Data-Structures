package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;
import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class LCA_binaryTree {
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


	public static int lca(binarynode<Integer> root, int n1, int n2) {
		if(root==null) {
			return 0;
		}
		ArrayList<Integer> a1=new ArrayList<>();
		ArrayList<Integer> a2=new ArrayList<>();
		if(!path(root,a1,n1) || !path(root,a2,n2)) {
			return -1;
		}
		int i;
		for(i=0;i<a1.size() && i<a2.size();i++) {
			if(!a1.get(i).equals(a2.get(i))) {
				break;
			}
		}
			return a1.get(i-1);
		
	}
	private static boolean path(binarynode<Integer> root, ArrayList<Integer> arr, int n) {
		if(root==null) {
			return false;
		}
		arr.add(root.data);
		if(root.data==n) {
			return true;
		}
		if(path(root.left, arr,n) || path(root.right,arr,n)) {
			return true;
		}
		arr.remove(arr.size()-1);
		return false;
	}
	public static void main(String[] args) {
		binarynode<Integer> root=takeInputLevel();
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println(lca(root,n1,n2));
	}

}
