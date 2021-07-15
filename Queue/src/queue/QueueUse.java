package queue;

public class QueueUse {

	public static void main(String[] args){
		queuearray queue=new queuearray(2);
		for(int i=1;i<6;i++) {
			try {
				queue.enqueue(i);
			} catch (QueueFullException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
