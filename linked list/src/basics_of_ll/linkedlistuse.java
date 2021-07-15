package basics_of_ll;

import java.util.Scanner;

public class linkedlistuse {
	
	public static node<Integer> takeInput(){
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		node<Integer> head = null;
		node<Integer> tail = null;
		while(data!=-1) {
			node<Integer> newNode = new node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
				tail.next=newNode;
				tail=tail.next;
			}
			data=s.nextInt();
		}
		return head;
	}
	
	public static void print(node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	public static node<Integer> insert(node<Integer> head,int data,int pos) {
		node<Integer> newNode = new node<Integer>(data);
		if(pos==0) {
			newNode.next=head.next;
			return newNode;
		}
		node<Integer> temp=head;
		int i=0;
		while(i<pos-1) {
			temp=temp.next;
			i++;
		}
		newNode.next=temp.next;
		temp.next=newNode;
		return head;
	}
	
	public static node<Integer> delete(node<Integer> head, int del) {
		if(del==0) {
			head=head.next;
			return head;
		}
		node<Integer> temp=head;
		int i=0;
		while(temp.next!= null && i<del-1) {
			temp=temp.next;
			i++;
		}
		if(temp==null || temp.next==null) {
			return head;
		}
		temp.next=temp.next.next;
		return head;
	}
	
	public static void printone(node<Integer> head,int pos) {
		int i=0;
		while(head!=null && i<pos) {
			head=head.next;
			i++;
		}
		System.out.println(head.data);
		System.out.println();
	}
	
	public static int length(node<Integer> head) {
		int ans=0;
		while(head!=null) {
			ans++;
			head=head.next;
		}
		return ans;
	}
	
	public static int find(node<Integer> head,int data) {
		int i=0;
		while(head!=null) {
			if(head.data==data) {
				return i;
			}
			head=head.next;
			i++;
		}
		return -1;
	}
	
	public static int middle(node<Integer> head) {
		node<Integer> slow=head;
		node<Integer> fast=head;
		if(length(head)%2==0) {
			while(fast.next.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			return slow.data;
		}
		else {
			while(fast.next!=null) {
				slow=slow.next;
				fast=fast.next.next;
			}
			return slow.data;
		}
	}
	
	public static node<Integer> insertRecurssive(node<Integer> head, int pos,int elem){
		if(pos==0) {
			node<Integer> newNode= new node<>(elem);
			newNode.next=head;
			return newNode;
		}
		
		if(head==null) {
			return head;
		}
		head.next=insertRecurssive(head.next,pos-1,elem);
		return head;
	}
	
	public static node<Integer> deleteRecursive(node<Integer> head,int pos){
		if(pos<0) {
			return head;
		}
		if(head == null) {
			return head;
		}
		
		if(pos==0) {
			return head.next;
		}
		head.next=deleteRecursive(head.next,pos-1);
		return head;
	}
	
	public static void main(String[] args) {
		node<Integer> head= takeInput();
		//print(head);
		Scanner s = new Scanner(System.in);
//		int data=s.nextInt();
//		int pos=s.nextInt();
//		insert(head,data,pos);
//		print(head);
//		int del=s.nextInt();
//		delete(head,del);
//		print(head);
//		printone(head,2);
//		System.out.println(length(head));
//		int findData=s.nextInt();
//		System.out.println(find(head,findData));
//		System.out.println(middle(head));
//		head=insertRecurssive(head,2,20);
		head=deleteRecursive(head,0);
		print(head);
		
	}

}
