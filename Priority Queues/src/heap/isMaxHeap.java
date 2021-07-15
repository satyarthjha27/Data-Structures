package heap;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class isMaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(check(arr));
	}

	private static boolean check(int[] arr) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		int n=arr.length;
		for(int i=0;i<n;i++) {
			pq.add(arr[i]);
		}
		boolean ans=true;
		for(int i=0;i<n;i++) {
			int p=pq.remove();
			if(p==arr[i])
				ans=true;
			else
				return false;
		}
		return ans;
	}

}
