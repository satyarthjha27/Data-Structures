package queue;

public class queueUseLL {

	public static void main(String[] args) {
		queueLL<Integer> queue=new queueLL<Integer>();
		for (int i=1;i<6;i++) {
			queue.enqueue(i);
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
