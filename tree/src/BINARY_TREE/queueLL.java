package BINARY_TREE;

public class queueLL<T> {

		private node<T> front;
		private node<T> rear;
		private int size;
		
		public queueLL() {
			front=null;
			rear=null;
			size=0;
		}
		
		public int size() {
			return size;
		}
		public boolean isEmpty() {
			return (size==0);
		}
		public T front() throws QueueEmptyException {
			if(size==0) {
				throw new QueueEmptyException();
			}
			return front.data;
		}
		public void enqueue(T elem) {
			node<T> newNode=new node<T>(elem);
			if(rear==null) {
				front=newNode;
				rear=newNode;
				size++;
				return;
			}
			rear.next=newNode;
			rear=rear.next;
			size++;
		}
		public T dequeue() throws QueueEmptyException {
			if(size==0) {
				throw new QueueEmptyException();
			}
			T temp=front.data;
			front=front.next;
			if(size==1) {
				rear=null;
			}
			size--;
			return temp;
		}
		
}
