package recursion;

import java.util.Scanner;

public class pair_star {
	public static String pair(String str) {
		if(str.length()==1) {
			return str;
		}
		String ans=pair(str.substring(1));
		if(str.charAt(0)==str.charAt(1)){
			return str.charAt(0)+"*"+ans;
		}
		else
			return str.charAt(0)+ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(pair(str));
	}

}
