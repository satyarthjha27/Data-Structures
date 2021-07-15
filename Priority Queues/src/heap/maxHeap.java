package heap;

import java.util.ArrayList;

public class maxHeap {
	ArrayList<Integer> heap;
	public maxHeap() {
		heap=new ArrayList<>();
	}
	boolean isEmpty() {
		return heap.size()==0;
	}
	int size() {
		return heap.size();
	}
	void insert(int elem) {
		heap.add(elem);
		int childindex=heap.size()-1;
		int parentindex=(childindex-1)/2;
		while(childindex>0) {
			if(heap.get(childindex)>heap.get(parentindex)) {
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
		int maxIndex=index;
		int lchild=1;
		int rchild=2;
		while(lchild<heap.size()) {
			if(heap.get(maxIndex)<heap.get(lchild)) {
				maxIndex=lchild;
			}
			if(rchild<heap.size() && heap.get(maxIndex)<heap.get(rchild)) {
				maxIndex=rchild;
			}
			if(maxIndex==index) {
				break;
			}
			else {
				int temp=heap.get(maxIndex);
				heap.set(maxIndex, heap.get(index));
				heap.set(index, temp);
				index=maxIndex;
				lchild=2*index+1;
				rchild=2*index+2;
			}
		}
		return ans;
	}
}
