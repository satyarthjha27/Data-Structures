package basics_of_ll;

import java.util.Scanner;

public class reversetraversal {
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
		node<Integer> finalhead=reverse(head.next);
		node<Integer> temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return finalhead;
	}
	public static node<Integer> reverseLLBetter(node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		node<Integer> tail=head.next;
		node<Integer> finalHead= reverseLLBetter(head.next);
		tail.next=head;
		head.next=null;
		return finalHead;
	}
	public static doublenode reverseBetter(node<Integer> head) {
		if(head==null|| head.next==null) {
			doublenode ans= new doublenode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		doublenode smallans= reverseBetter(head.next);
		smallans.tail.next=head;
		head.next=null;
		
		doublenode ans=new doublenode();
		ans.head=smallans.head;
		ans.tail=head;
		return ans;
	}
	
	
	
	public static node<Integer> reverseLoops(node<Integer> head){
		node<Integer> curr=head;
		node<Integer> prev=null;
		node<Integer> temp;
		while(curr!=null) {
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		head=reverseLoops(head);
		print(head);
	}

}
