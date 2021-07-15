package Tries;

import java.util.ArrayList;
import java.util.Scanner;

public class autoCorrct {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		trie t=new trie();
		int n=s.nextInt();
		ArrayList<String> input=new ArrayList<>();
		for(int i=0;i<n;i++) {
			String temp=s.next();
			input.add(temp);
		}
		for(int i=0;i<n;i++) {
			t.add(input.get(i));
		}
		String com=s.next();
		t.complete(com);
	}

}
