package heap;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class buyTickets {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		int dig=arr[k];
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		Queue<Integer> q=new LinkedList<Integer>();

		for(int i=0;i<n;i++) {
			pq.add(arr[i]);
			q.add(arr[i]);
		}
		int ans=0;
//		for(int i=0;i<n;i++) {
//			if(pq.peek()>dig) {
//				pq.remove();
//				ans++;
//			}
//			if(pq.peek()<dig) {
//				continue;
//			}
//					
//		}
		
		for(int i=0;i<n;i++) {
			int x=q.poll();
			if(x!=arr[k] && x<pq.peek()) {
				q.add(x);
				ans++;
			}
			if(x!=arr[k] && x==pq.peek()) {
				pq.remove();
				//q.poll();

			}
			if(x==arr[k]) {
				ans++;
				break;
			}
		}
		System.out.println(ans);
	}

}
