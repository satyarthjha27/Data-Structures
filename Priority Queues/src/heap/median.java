package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class median {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int [n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		PriorityQueue<Integer> small=new PriorityQueue<>();
		PriorityQueue<Integer> greater=new PriorityQueue<>(Collections.reverseOrder());
		small.add(arr[0]);
		int med=arr[0];
		System.out.println(med);
		for(int i=1;i<n;i++) {
			int x=arr[i];
			if(small.size()>greater.size()) {
				if(x<med) {
					greater.add(small.remove());
					small.add(x);
				}
				else {
					greater.add(x);
				}
				med=(small.peek()+greater.peek())/2;
			}
			else if(small.size()==greater.size()) {
				if(x>med) {
					small.add(x);
					med=greater.peek();
				}
				else {
					greater.add(x);
					med=small.peek();
				}
			}
			else {
				if(x>med) {
					small.add(greater.remove());
					greater.add(x);
				}
				else {
					small.add(x);
				}
				med=(small.peek()+greater.peek())/2;
			}
			System.out.println(med);
			
		}
	}

}
