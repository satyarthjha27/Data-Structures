package recursion;

import java.util.Scanner;

public class check_AB {
	public static boolean check(String str) {
		if(str.length()==0) {
			return true;
		}
		if(str.charAt(0)=='a') {
			if(str.substring(1).length()>1&& str.substring(1, 3).equals("bb")) {
				return check(str.substring(3));
			}
			else {
				return check(str.substring(1));
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str= s.next();
		System.out.println(check(str));
	}

}
