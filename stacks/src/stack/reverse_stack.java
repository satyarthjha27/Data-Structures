package stack;

import java.util.Scanner;

public class reverse_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackll<Integer> stack=new stackll<>();
		stackll<Integer> stack1=new stackll<>();
		Scanner s=new Scanner(System.in);
		int n,j;
		n=s.nextInt();
		for(int i=0;i<n;i++) {
			j=s.nextInt();
			stack.push(j);
		}
		while(!stack.isEmpty()) {
			int temp = 0;
			try {
				temp = stack.pop();
			} catch (stackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			stack1.push(temp);
		}
		stack=stack1;
		try {
			System.out.println(stack.top());
		} catch (stackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(!stack.isEmpty()) {
			try {
				System.out.print(stack.pop()+" ");
			} catch (stackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
