package claasesandobject;

public class dynamicarray {
	private int data[];
	private int nextindex;
	public dynamicarray() {
		data=new int[5];
		nextindex=0;
	}
	public int size() {
		return nextindex;
	}
	public void add(int element) {
		if(nextindex==data.length) {
			restructure();
		}
		data[nextindex]=element;
		nextindex++;
	}
	public void set(int index, int element) {
		if(index>nextindex)
			return;
		if(index<nextindex) {
			data[index]=element;
		} else {
			add(element);
		}
	}
	public int get(int index) {
		if(index>=nextindex) {
			return -1;
		}
    	return data[index];
	}
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}
		else
			return false;
	}
	private void restructure() {
		int temp[]=data;
		data=new int[data.length*2];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}			
	}
	public int removelast() {
		if(size()==0)
			return -1;
		int value=data[nextindex-1];
		data[nextindex-1]=0;
		nextindex--;
		return value;
	}
}
