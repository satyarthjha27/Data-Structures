package Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDuplicates {

	public static ArrayList<Integer> remove(int a[]){
		ArrayList<Integer> ans=new ArrayList<>();
		HashMap<Integer, Boolean> seen=new HashMap<>();
		for(int i=0;i<a.length;i++) {
			if(seen.containsKey(a[i])) {
				continue;
			}
			ans.add(a[i]);
			seen.put(a[i], true);
		}
		return ans;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		ArrayList<Integer> ans=remove(arr);
		for(int i=0;i<ans.size();i++) {
			System.out.println(ans.get(i));
		}
				
	}

}
