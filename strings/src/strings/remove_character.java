package strings;

import java.util.Scanner;

public class remove_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String x1=s.next();
		char x=x1.charAt(0);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==x) {
				continue;
			}
			else
				System.out.print(str.charAt(i));
		}
	}

}
