package basics_of_ll;

import java.util.Scanner;

public class eliminate_duplicates {

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

	public static int length(node<Integer> head) {
		int ans=0;
		while(head.next!=null) {
			ans++;
			head=head.next;
		}
		return ans;
	}
	public static void delete(node<Integer> head) {
		node<Integer> curr=head.next;
		node<Integer> prev=head;
		int n=length(head);
		int i=1;
		while(i<n && curr.next!=null) {
			if(prev.data==curr.data && curr.next.next!=null) {
				prev=curr.next;
				curr=curr.next.next;
			}
			else if(curr.next.next==null) {
				curr=null;
				prev.next=null;
			}
			else {
				prev=curr;
				curr=curr.next;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		node<Integer> head= takeInput();
		delete(head);
		print(head);
	}

}
