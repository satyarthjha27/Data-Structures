package heap;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class mergeKsortedArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		int n;
		int r=0;
		int arr[][]=new int[k][];
		for(int i=0;i<k;i++) {
			n=s.nextInt();
			r+=n;
			arr[i]=new int[n];
			for(int j=0;j<n;j++) {
				arr[i][j]=s.nextInt();
			}
		}
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			for(int j=0;j<arr[i].length;j++) {
				pq.add(arr[i][j]);
			}
		}
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<k;i++) {
			for(int j=0;j<arr[i].length;j++) {
				ans.add(pq.remove());
			}
		}
		System.out.println(ans);
	}

}
