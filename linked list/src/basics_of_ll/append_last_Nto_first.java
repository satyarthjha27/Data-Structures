package basics_of_ll;

import java.util.Scanner;

public class append_last_Nto_first {

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

	public static node<Integer> append(node<Integer> head, int n){
		//int i=0;
		int len=length(head);
		if(len ==0) {
			//print(head);
			return head;
		}
		if (len != n && n <len) {
			int skip=len-n;
			node<Integer> temp=head;
			node<Integer> current=head;
			node<Integer> prev=null;
			while(skip>0) {
				prev=current;
				current=current.next;
				skip--;
			}
			prev.next=null;
			head=current;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=temp;
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

	public static void main(String[] args) {
		node<Integer> head= takeInput();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		head=append(head,n);
		print(head);
	}

}
