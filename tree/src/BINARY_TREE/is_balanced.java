package BINARY_TREE;

import java.util.Scanner;

public class is_balanced {

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

	public static boolean balance(binarynode<Integer> root) {
		if(root==null) {
			return false;
		}
		int lh=height(root.left);
		int rh=height(root.right);
		if((lh-rh)<=1) {
			return true;
		}
		else
			return false;
	}
	public static int height(binarynode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int ans;
		int lr =height(root.left);
		ans =height(root.right);
		return 1+Math.max(ans, lr);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		System.out.println(balance(root));
	}

}
