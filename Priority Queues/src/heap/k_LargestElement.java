package heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class k_LargestElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		ksort(arr,k);

	}

	private static void ksort(int[] arr, int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		int i=0;
		for(;i<k;i++) {
			pq.add(arr[i]);
		}
		for(;i<arr.length;i++) {
			int min=pq.element();
			if(min<arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}
}
