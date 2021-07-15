package strings;

import java.util.Scanner;

public class highest_occuring_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int i,large=0;
		char ch=str.charAt(0);
		for(i=0;i<str.length();i++) {
			int c=0;
			for(int j=i;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
			}
			if(c>large) {
				large=c;
				ch=str.charAt(i);
			}
		}
		System.out.println(ch);
	}

}
