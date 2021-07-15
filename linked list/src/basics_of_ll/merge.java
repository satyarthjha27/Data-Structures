package basics_of_ll;

import java.util.Scanner;

public class merge {

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

	public static node<Integer> merge(node<Integer> t1, node<Integer> t2) {
		node<Integer> head=null;
		node<Integer> tail=null;
		if(t1==null) 
			return t2;
		if(t2==null)
			return t1;

		if((int) t1.data<=(int) t2.data) {
			head=t1;
			tail=t1;
			t1=t1.next;
		}
		else {
			head=t2;
			tail=t2;
			t2=t2.next;			
		}
		while(t1!=null && t2!=null) {
			if((int) t1.data<=(int) t2.data) {
				tail.next=t1;
				tail=t1;
				t1=t1.next;
			}
			else {
				tail.next=t2;
				tail=t2;
				t2=t2.next;
			}
		}
		if (t1 != null) {
			tail.next = t1;
		} else
			tail.next = t2;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> t1=takeInput();
		node<Integer> t2=takeInput();
		print(merge(t1,t2));
	}

}
