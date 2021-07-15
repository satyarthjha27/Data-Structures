package basics_of_ll;

import java.util.Scanner;

public class kreverse {

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

	public static node<Integer> reverse(node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		node<Integer> tail=head.next;
		node<Integer> finalHead= reverse(head.next);
		tail.next=head;
		head=null;
		return finalHead;
	}
	
	public static node<Integer> kreverse(node<Integer> head,int k){
		node<Integer> temp=head;
		for(int i=0;i<k && temp.next!=null;i++) {
			temp=temp.next;
		}
		temp.next=null;
		node<Integer> finalhead=reverse(temp);
		
		
		return finalhead;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		
	}

}
