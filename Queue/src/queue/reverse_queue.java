package queue;

import java.util.Scanner;

public class reverse_queue {
	public static queueLL<Integer> reverse(queueLL<Integer> q){
		if(q.isEmpty()) {
			return q;
		}
		int data = 0;
		try {
			data = q.front();
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			q.dequeue();
		} catch (QueueEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		q=reverse(q);
		q.enqueue(data);
		return q;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		queueLL<Integer> queue=new queueLL<>();
		for(int i=0;i<n;i++) {
			int j=s.nextInt();
			queue.enqueue(j);
		}
		queue=reverse(queue);
		try {
			System.out.println(queue.front());
		} catch (QueueEmptyException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
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
