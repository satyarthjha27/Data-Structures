package binarySearchTree;

import java.util.Scanner;
import java.util.ArrayList;
import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class find_path {
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

	public static ArrayList<Integer> find(binarynode<Integer> root, int k) {
		if(root==null) {
			return null;
		}
		if(root.data==k) {
			ArrayList<Integer> ans=new ArrayList<>();
			ans.add(root.data);
			return ans;
		}
		ArrayList<Integer> left =find(root.left, k);
		if(left!=null) {
			left.add(root.data);
			return left;
		}
		ArrayList<Integer> right=find(root.right,k);
		if(right!=null) {
			right.add(root.data);
			return right;
		}
		else
			return null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		Scanner s =new Scanner(System.in);
		int k=s.nextInt();
		System.out.println(find(root,k));
	}

}
