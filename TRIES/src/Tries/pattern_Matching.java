package Tries;

import java.util.ArrayList;
import java.util.Scanner;

public class pattern_Matching {

	public static void main(String[] args) {
		trie t=new trie();
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		ArrayList<String> input=new ArrayList<String>();
		for(int i=0;i<n;i++) {
			String temp=s.next();
			input.add(temp);
		}
		String sea=s.next();
		//System.out.println(input);
        for (int i = 0; i <input.size(); i++) {
            String temp = input.get(i);
            for (int j = 0; j < temp.length(); j++) {
                t.add(temp.substring(j));
            }
        }
        
		System.out.println(t.search(sea));
		//System.out.println(t.countword());
	}

}
