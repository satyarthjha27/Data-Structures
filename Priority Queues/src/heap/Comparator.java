package heap;

import java.util.Collections;
import java.util.PriorityQueue;
class maxComparator implements java.util.Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if(o1<o2) {
			return 1;
		}
		else if(o1>o2)
			return -1;
		return 0;
	}
	
}
 class stringLengthComparator implements java.util.Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		if(o1.length()>o2.length()){
			return 1;
		}else if(o1.length()<o2.length()) {
			return -1;
		}
		return 0;
	}
	 
 }

public class Comparator {

	public static void main(String[] args) {
		maxComparator maxPQComparator=new maxComparator(); 
		//PriorityQueue<Integer> pq=new PriorityQueue<>(maxPQComparator);
		//PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		String arr[]= {"a","an","the","their","queues"};
		stringLengthComparator stringcom=new stringLengthComparator();
		PriorityQueue<String> pq=new PriorityQueue<>(stringcom);
		//int arr[]= {5,2,1,8,0,4};
		for(int i=0;i<arr.length;i++) {
			pq.add(arr[i]);
		}
		while(!pq.isEmpty()) {
			System.out.print(pq.remove()+" ");
		}
		System.out.println();

	}

}
