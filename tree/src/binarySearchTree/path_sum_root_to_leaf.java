package binarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class path_sum_root_to_leaf {
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

	public static void sum(binarynode<Integer> root, int k) {
		if(root==null) {
			return;
		}
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(root.data);
		sum(root.left,k);
		sum(root.right,k);
		
		int f=0;
		for(int j=arr.size()-1;j>0;j--) {
			f+=arr.get(j);
			if(f==k) {
				System.out.println(arr.get(j));
			}
		}
		arr.remove(arr.size()-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		Scanner s= new Scanner(System.in);
		int k=s.nextInt();
		sum(root,k);
	}

}
