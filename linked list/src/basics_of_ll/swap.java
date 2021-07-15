package basics_of_ll;

import java.util.Scanner;

public class swap {
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

	public static node<Integer> swap(node<Integer> head,int i,int j){
		node<Integer> previ=null;
		node<Integer> curri=head;
		node<Integer> prevj=null;
		node<Integer> currj=head;
		if(i==j) {
			return head;
		}
		while(curri!=null && i>0) {
			previ=curri;
			curri=curri.next;
			i--;
		}

		while(currj!=null && j>0) {
			if(currj.next!=null) {
				prevj=currj;
				currj=currj.next;
			}
			j--;
		}
		if(previ!=null) {
			previ.next=currj;
		}
		else {
			head=currj;
		}
		if(prevj!=null) {
			prevj.next=curri;
		}
		else {
			head=curri;
		}
		node<Integer> temp=curri.next;
		curri.next=currj.next;
		currj.next=temp;
		return head; 


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		head=swap(head,1,4);
		print(head);
	}

}
