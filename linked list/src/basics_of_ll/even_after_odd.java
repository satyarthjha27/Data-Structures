package basics_of_ll;

import java.util.Scanner;
import java.util.LinkedList;
public class even_after_odd {
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

	public static LinkedList oddeven(node<Integer> head){
		node<Integer> temp=head;
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list= new LinkedList<>();
		while(temp!=null) {
			if((temp.data)%2!=0) {
				list.add(temp.data);
			}
			else {
				list1.add(temp.data);
			}
			temp=temp.next;
		}
		for(int i=0;i<list1.size();i++) {
			list.add(list1.get(i));
		}
		return list;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		LinkedList<Integer> ans=oddeven(head);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}

}
