package heap;

import java.util.ArrayList;

public class minHeap {

	private ArrayList<Integer> heap;
	public minHeap() {
		heap=new ArrayList<Integer>();
	}
	
	boolean isEmpty() {
		return heap.size()==0;
	}
	int size() {
		return heap.size();
	}
	
	int getMin() throws EmptyQueue {
		if(isEmpty()) {
			throw new EmptyQueue();
		}
		return heap.get(0);
	}
	
	void insert(int elem) {
		heap.add(elem);
		int childindex=heap.size()-1;
		int parentindex=(childindex-1)/2;
		
		while(childindex>0) {
			if(heap.get(childindex)< heap.get(parentindex)) {
				int temp=heap.get(childindex);
				heap.set(childindex, heap.get(parentindex));
				heap.set(parentindex, temp);
				childindex=parentindex;
				parentindex=(childindex-1)/2;
			}
			else
				return;
		}
	}
	
	int remove() throws EmptyQueue {
		if(isEmpty()) {
			throw new EmptyQueue();
		}
		int ans=heap.get(0);
		heap.set(0, heap.get(heap.size()-1));
		heap.remove(heap.size()-1);
		int index=0;
		int minIndex=index;
		int lchild=1;
		int rchild=2;
		while(lchild<heap.size()) {
			if(heap.get(lchild) < heap.get(minIndex)) {
				minIndex=lchild;
			}
			if(rchild<heap.size() && heap.get(rchild)<heap.get(minIndex)) {
				minIndex=rchild;
			}
			if(minIndex==index) {
				break;
			}else {
				int temp=heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp);
				index=minIndex;
				lchild=2*index+1;
				rchild=2*index+2;
			}
			}
		return ans;
	}
}
