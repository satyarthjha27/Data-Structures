package strings;

import java.util.Scanner;

public class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int c=0;
		String str=s.nextLine();
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
				++c;
			}
		}
		System.out.println(c+1);
	}

}
