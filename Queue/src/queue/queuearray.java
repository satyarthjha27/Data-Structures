package queue;

public class queuearray {

	private int data[];
	private int front,rear,size;
	
	public queuearray() {
		data=new int[10];
		front=-1;
		rear=-1;
		size=0;
	}
	public queuearray(int capacity) {
		data=new int[capacity];
		front=-1;
		rear=-1;
		size=0;
	}
	
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return (size==0);
	}
	
	public  int front() throws QueueFullException {
		if(size==0) {
			throw new QueueFullException();
		}
		return data[front];
	}
	
	public void enqueue(int elem) throws QueueFullException {
		if(size==data.length) {
			restructure();
		}
		if(size==0) {
			front=0;
		}
		rear++;
		size++;
		if(size==data.length) {
			rear=0;
		}
		data[rear]=elem;
	}
	
	private void restructure() {
		int temp[]=data;
		data=new int[2*temp.length];
		int index=0;
		for(int i=front;i<temp.length;i++) {
			data[index]=temp[i];
			index++;
		}
		for(int i=0;i<=front-1;i++) {
			data[index]=temp[i];
			index++;
		}
		front=0;
		rear=temp.length-1;
	}
	
	public int dequeue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp=data[front];
		front=(front +1) % data.length;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
	}
	
}
