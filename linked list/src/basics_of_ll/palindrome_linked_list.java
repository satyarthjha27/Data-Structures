package basics_of_ll;
import java.util.ArrayList;
import java.util.Scanner;

public class palindrome_linked_list {

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
	
	public static boolean palin(node<Integer> head) {
		int n=length(head);
		if(n==0) {
			return true;
		}
		if(n==1) {
			return false;
		}
		ArrayList<Integer> copy=new ArrayList<Integer>(n);
		node<Integer> temp=head;
		while(temp!=null) {
			copy.add((int) temp.data);
			temp=temp.next;
		}
		int i=0,j=n-1;
		while(i<j) {
			if(copy.get(i)!=copy.get(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static int length(node<Integer> head) {
		int ans=0;
		while(head!=null) {
			ans++;
			head=head.next;
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node<Integer> head=takeInput();
		System.out.println(palin(head));
	}

}
