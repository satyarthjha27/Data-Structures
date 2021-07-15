package basics_of_ll;

import java.util.Scanner;

public class find_a_node_recurssively {
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
	static int c=0;
	public static int findRecurssive(node<Integer> head,int elem) {
		
		if(head==null) {
			return -1;
		}
		if(head.data==elem) {
			return c;
		}
		c++;
		return findRecurssive(head.next,elem);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		Scanner S= new Scanner(System.in);
		int n=S.nextInt();
		System.out.println(findRecurssive(head,n));
	}

}
