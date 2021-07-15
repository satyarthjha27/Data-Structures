package strings;

import java.util.Scanner;

public class reverse_string_wordwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//int c=1;
		String str=s.nextLine();
		
//		for(int i=0;i<str.length();i++) {
//			if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
//				++c;
//			}
//		}
//		int n=str.length();
//		String str1;
//		for(int i=n;i>=0;i++) {
//			if(str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
//				
//			}
//			else {
//				str1+=str.charAt(i);
//			}
//		}
		String ans="";
		for(int i=str.length()-1;i>=0;i--) {
			ans+=str.charAt(i);
		}
		System.out.println(ans);
	}

}
