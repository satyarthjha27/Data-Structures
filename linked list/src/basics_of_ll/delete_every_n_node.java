package basics_of_ll;

import java.util.Scanner;

public class delete_every_n_node {

	public static node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		node<Integer> head=null;
		node<Integer> tail=null;
		while(data!=-1) {
			node<Integer> newNode= new node<Integer>(data);
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

	public static node<Integer> deleteevery(node<Integer> head,int m,int n){
		node<Integer> temp;
		node<Integer> curr=head;
		if(m==0) {
			return head;
		}
		while(curr!=null) {
			for(int i=1;i<m && curr!=null;i++) {
					curr=curr.next;
				}	
			if(curr==null) {
				return head; 
			}
			temp=curr.next;
			for(int i=1;i<=n && temp!=null;i++) {
					temp=temp.next;
			}
			curr.next=temp;
			curr=temp;
		}
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		Scanner s= new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		head=deleteevery(head,m,n);
		print(head);
	}

}
