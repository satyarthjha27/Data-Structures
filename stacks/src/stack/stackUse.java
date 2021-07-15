package stack;

public class stackUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackarray stack=new stackarray(3);
		for(int i=1;i<8;i++) {
			stack.push(i);
		}	
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		
	}

}
