package Basics;

import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
public class Maximum_Frequency {

	public static int max(int a[]) {
		HashMap<Integer, Integer> hash=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(hash.containsKey(a[i])) {
				int freq = hash.get(a[i]);
				freq++;
				hash.put(a[i], freq);
			}
			else
				hash.put(a[i], 1);
		}
		int max=0;
		int res=-1;
		for(Entry<Integer,Integer> value : hash.entrySet()) {
			if(max<value.getValue()) {
				res=value.getKey();
				max=value.getValue();
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(max(arr));
	}

}
