package stack;

import java.util.Scanner;

public class minimum_bracket_reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackll<Character> stack=new stackll<>();
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		if(str.length()%2!=0) {
			System.out.println("-1");
		}
		else {
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(c=='{') {
					stack.push(c);
				}
				else if(c=='}') {
					try {
						stack.pop();
					} catch (stackEmptyException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			System.out.println((stack.size())/2);
		}
		
	}

}
