package binarySearchTree;

import java.util.Scanner;

import BINARY_TREE.QueueEmptyException;
import BINARY_TREE.queueLL;

public class binaryToLL {
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
	public static node<Integer> convert(binarynode<Integer> root){
		if(root==null) {
			return null;
		}
		node<Integer> newnode=new node<>(root.data);
		node<Integer> lhead=convert(root.left);
		node<Integer> rhead=convert(root.right);
		node<Integer> temp=lhead;
		newnode.next=rhead;
		if(lhead==null) {
			return newnode;
		}
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		return lhead;	
	}
//	public static trip<node<Integer>, node<Integer>, node<Integer>> convert1(binarynode<Integer> root){
//		if(root==null) {
//			trip<node<Integer>, node<Integer>, node<Integer>> output=new trip<node<Integer>, node<Integer>, node<Integer>>();
//			output.first=null;
//			output.second=null;
//			output.third=null;
//			return output;
//		}
//		node<Integer> newnode=new node<>(root.data);
//		trip<node<Integer>, node<Integer>, node<Integer>> left=convert1(root.left);
//		trip<node<Integer>, node<Integer>, node<Integer>> right=convert1(root.right);
//		trip<node<Integer>, node<Integer>, node<Integer>> output=new trip<>();
//		left.second.next=newnode;
//		newnode.next=right.third;
//		output.first=left.first;
//		output.second=left.second;
//		output.third=right.third;
//		return output;
//		
//	}
	public static void print(node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binarynode<Integer> root=takeInputLevel();
		//node<Integer> head=convert(root);
		node<Integer> head=convert(root);
		print(head);
	}

}
