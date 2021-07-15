package recursion;

import java.util.Scanner;

public class string_palendrome {
	public static boolean palen(String str) {
		if(str.length()/2==0) {
			return true;
		}
		palen(str.substring(1));
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return true;
		}
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		String str=s.next();
		System.out.println(palen(str));
	}

}
