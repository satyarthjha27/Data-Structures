package strings;

import java.util.Scanner;

public class string_palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		boolean ans=true;
		int n= str.length();
		for(int i=0;i<n/2;i++) {
			if(str.charAt(i)==str.charAt(n-i-1)) {

			}
			else {
				ans=false;
			}
		}
		System.out.println(ans);
	}

}
