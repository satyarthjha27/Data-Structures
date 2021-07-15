package stack;

public class stackarray {

	private int data[];
	private int top;
	
	public stackarray() {
		data=new int[10];
		top=-1;
	}
	public stackarray(int capacity) {
		data=new int[capacity];
		top=-1;
	}
	public boolean isEmpty() {
		return (top==-1);
	}
	public int size() {
		return top+1;
	}
	public void push(int elem){
		if(size()==data.length) {
			restructure();			
		}
		top++;
		data[top]=elem;
	}
	public int top() throws stackEmptyException{
		if(size()==0) {
			stackEmptyException e =new stackEmptyException();
			throw e;
		}
		return data[top];
	}
	public int pop() {
		if(size()==0) {
//			stackEmptyException e =new stackEmptyException();
//			throw e;
			return 0;
		}
		int temp=data[top];
		top--;
		return temp;
	}
	private void restructure() {
		int temp[]=data;
		data=new int[temp.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
	}

}
