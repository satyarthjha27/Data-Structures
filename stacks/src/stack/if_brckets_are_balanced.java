package stack;

import java.util.Scanner;

public class if_brckets_are_balanced {

	public static boolean answer(String str) {
		stackarray stack=new stackarray();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c=='('|| c=='['|| c=='{') {
				stack.push(c);
				continue;
			}
//			if(stack.isEmpty()) {
//				return false;
//			}
			char temp;
			switch(c) {
			case ')': 
				temp=stack.pop();
				if(temp=='[' || temp=='{') 
					return false;
				break;
			case '}': temp=stack.pop();
				if(temp=='(' || temp=='[') 
					return false;
				break;
			case ']': temp=stack.pop();
				if(temp=='(' || temp=='{') 
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		boolean ans=answer(str);
		System.out.println(ans);
	}
}
