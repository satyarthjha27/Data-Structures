package stack;

public class stackuseLL {

	public static void main(String[] args) throws stackEmptyException {
		stackll<Integer> stack=new stackll<Integer>();
		for(int i=0;i<5;i++) {
			stack.push(i);
		}
		while(!stack.isEmpty()) {
				System.out.println(stack.pop());
		}

	}

}
