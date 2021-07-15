package basics_of_ll;

import java.util.Scanner;

public class print_reverse {

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
		if(head==null) {
			return;
		}
		print(head.next);
		System.out.print(head.data+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		print(head);
	}

}
