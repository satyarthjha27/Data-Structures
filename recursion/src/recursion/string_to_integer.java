package recursion;

import java.util.Scanner;

public class string_to_integer {
	public static int convert(String str) {
		if(str.length()==1) {
			return str.charAt(0)-'0';
		}
		int ans=convert(str.substring(0,str.length()-1));
		int last=str.charAt(str.length()-1)-'0';
		return ans*10+last;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.next();
		System.out.println(convert(str));
	}

}
