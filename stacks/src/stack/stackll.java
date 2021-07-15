package stack;

public class stackll<T> {
	
	private node<T> head;
	private int size;
	
	public stackll() {
		this.head=null;
		size=0;
	}
	
	public int size() {
		return size;
	}
	public T top() throws stackEmptyException {
		if(size()==0) {
			throw new stackEmptyException();
		}
		return head.data;
	}
	public boolean isEmpty() {
		return (size()==0);
	}
	public void push(T elem) {
		node<T> newNode=new node<T>(elem);
		if(head==null) {
			head=newNode;
			head.next=null;
			size++;
		}
		else {
			newNode.next=head;
			head=newNode;
			size++;
		}
	}
	public T pop() throws stackEmptyException {
		if(size()==0) {
			throw new stackEmptyException();
		}
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	}

}
