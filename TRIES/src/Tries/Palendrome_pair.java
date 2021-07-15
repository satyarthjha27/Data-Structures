package Tries;

import java.util.ArrayList;
import java.util.Scanner;

public class Palendrome_pair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		trie t=new trie();
		ArrayList<String> input=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			String temp=s.next();
			input.add(temp);
		}
		//System.out.println(input);
		for(int i=0;i<input.size();i++) {
			t.add(input.get(i));
		}
		boolean ans=false;
		for(int i=0;i<input.size();i++) {
			String temp=input.get(i);
			//System.out.println(temp);
			char[] te=temp.toCharArray();
			for(int j=0;j<(te.length)/2;j++) {
				char c=te[j];
				te[j]=te[te.length-j-1];
				te[te.length-j-1]=c;
			}
			String temp1="";
	        for(int j=0;j<te.length;j++) {
	        	temp1+=te[j];
	        }
			ans=t.search(temp1);			
		}
		System.out.println(ans);

	}

}
