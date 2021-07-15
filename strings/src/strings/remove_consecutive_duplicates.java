package strings;

import java.util.Scanner;

public class remove_consecutive_duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i)==str.charAt(i+1))
				continue;
			System.out.print(str.charAt(i));
		}
		int n=str.length();
		System.out.println(str.charAt(n-1));
	}

}
