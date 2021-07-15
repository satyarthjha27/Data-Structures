package binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class bst_use {

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

	public static binarynode<Integer> search(binarynode<Integer> root, int x){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			return root;
		}
		binarynode<Integer> temp;
		if(x>root.data) {
			temp=search(root.right,x);
		}
		else {
			temp=search(root.left,x);
		}
		return temp;
		
	}
	public static void print(binarynode<Integer> root, int k1, int k2) {
		if(root==null) {
			return;
		}
		if(root.data<k1) {
			print(root.right,k1,k2);
		}
		else if(root.data>k2) {
			print(root.left,k1,k2);
		}
		else {
			print(root.left,k1,k2);
			print(root.right,k1,k2);
		}
		if(root.data>=k1 && root.data<=k2) {
			System.out.print(root.data+" ");
		}
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
	public static pair<Boolean, pair<Integer, Integer>> isBST2(binarynode<Integer> root) {
		if(root==null) {
			pair<Boolean, pair<Integer, Integer>> output=new pair<Boolean, pair<Integer, Integer>>();
 			output.first=true;
 			output.second=new pair<>();
 			output.second.first=Integer.MAX_VALUE;
 			output.second.second=Integer.MIN_VALUE;
 			return output;
		}
		pair<Boolean, pair<Integer, Integer>> left=isBST2(root.left);
		pair<Boolean, pair<Integer, Integer>> right=isBST2(root.right);
		int min=Math.min(root.data,Math.min(left.second.first, right.second.first));
		int max=Math.max(root.data,Math.max(left.second.second, right.second.second));
		boolean isBST= (root.data> left.second.second) && (root.data<= right.second.first) && left.first && right .first;
		pair<Boolean, pair<Integer, Integer>> output=new pair<Boolean, pair<Integer, Integer>>();
		output.first=isBST;
		output.second=new pair<>();
		output.second.first=min;
		output.second.second=max;
		return output;
		
	}
	
	public static boolean isBST3(binarynode<Integer> root, int min, int max) {
		if(root==null) {
			return true;
		}
		if(root.data> max || root.data<min) {
			return false;
		}
		boolean isleft=isBST3(root.left,min,root.data-1);
		boolean isright=isBST3(root.right,root.data,max);
		return isleft && isright;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//binarynode<Integer> root=takeInputLevel();
		//Scanner s=new Scanner(System.in);
		//int x=s.nextInt();
//		binarynode<Integer> ans=search(root,x);
//		if(ans!=null)
//		System.out.println(ans.data);
//		else
//			System.out.println(ans);
//		
//		int k1=s.nextInt();
//		int k2=s.nextInt();
//		print(root,k1,k2);
		
		//System.out.println(isBST3(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
		bstClass bst=new bstClass();
		bst.insert(10);
		bst.insert(20);
		bst.insert(5);
		bst.insert(15);
		bst.insert(3);
		bst.insert(7);
		bst.print();
		System.out.println(bst.hasData(20));
		System.out.println(bst.hasData(8));
		bst.delete(7);
		System.out.println();
		bst.print();
		bst.delete(10);
		System.out.println();
		bst.print();
	}

}
