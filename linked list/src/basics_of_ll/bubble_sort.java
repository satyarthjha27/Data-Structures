package basics_of_ll;

import java.util.Scanner;

public class bubble_sort {
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

	public static void swap(node<Integer> head,int i){
		node<Integer> previ=null;
		node<Integer> curri=head;
		node<Integer> currj=head.next;
		while(curri!=null && i>0) {
			previ=curri;
			curri=curri.next;
			currj=currj.next;
			i--;
		}
		if(previ!=null) {
			previ.next=currj;
		}
		else {
			head=currj;
		}
		//		node<Integer> temp=curri.next;
		curri.next=currj.next;
		currj.next=curri;		 
	}
	public static int len(node<Integer> head) {
		int ans=0;
		while(head!=null) {
			ans++;
			head=head.next;
		}
		return ans;
	}

	public static void sort(node<Integer> head){
		int i;
		int n=len(head);
		//		for(i=0;i<n;i++) {
		//			node<Integer> temp=head;
		//			for(int j=0;j<n-1 && temp.next!=null;j++) {
		//				if(temp.data>temp.next.data) {
		//					swap(head,j);
		//				}
		//				temp=temp.next;
		//			}
		//		}
		for (i = 0; i < n; i++ ) {
			node<Integer> currentNode = head;
			node<Integer> nextn = head.next;
			for (int j = 0; j < n - 1; j++) {
				if (currentNode.data > nextn.data) {
					node<Integer> temp = currentNode;
					currentNode = nextn;
					nextn = temp;
				} 
				currentNode = nextn;
				nextn = nextn.next;                   
			} 

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		sort(head);
		print(head);
	}

}
