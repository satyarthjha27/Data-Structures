package heap;

public class minHeap_Use {

	public static void main(String[] args) throws EmptyQueue {
		// TODO Auto-generated method stub
		maxHeap pq=new maxHeap();
		int arr[]= {5,2,1,8,0,4};
		for(int i=0;i<arr.length;i++) {
			pq.insert(arr[i]);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}
		System.out.println();
	}

}
