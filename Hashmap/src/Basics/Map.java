package Basics;

import java.util.ArrayList;

public class Map<K,V> {

	ArrayList<node<K,V>> buckets;
	int size;
	int numBuckets;
	public Map() {
		numBuckets=5;
		buckets=new ArrayList<node<K, V>>();
		for(int i=0;i<buckets.size();i++) {
			buckets.add(null);
		}
	}
	private int getBucketIndex(K key) {
		int hashCode=key.hashCode();
		return hashCode%numBuckets;
	}

	public int size() {
		return size;
	}
	public V search(K key) {
		int bucketIndex=getBucketIndex(key);
		node<K, V> head=buckets.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}

	public V removekey(K key) {
		int bucketIndex=getBucketIndex(key);
		node<K, V> head=buckets.get(bucketIndex);
		node<K,V> prev=null;
		while(head!=null) {
			if(head.key.equals(key)) {
				size--;
				if(prev==null) {
					buckets.set(bucketIndex, head.next);
				}
				else {
					prev.next=head.next;
				}
				return head.value;
			}
			prev=head;
			head=head.next;
		}
		return null;
	}

	private void rehash() {
		System.out.println("Rehashing: buckets "+ numBuckets+" size "+size);
		ArrayList<node<K,V>> temp=buckets;
		buckets=new ArrayList<node<K,V>>();
		for(int i=0;i<2*numBuckets;i++) {
			buckets.add(null);
		}
		size=0;
		numBuckets*=2;
		for(int i=0;i<temp.size();i++) {
			node<K,V> head=temp.get(i);
			while(head!=null) {
				K key=head.key;
				V value=head.value;
				insert(key,value);
				head=head.next;
			}
		}
	}
	public double loadfactor() {
		return (1*size)/numBuckets;
	}
	public void insert(K key, V value) {
		int bucketIndex=getBucketIndex(key);
		node<K, V> head=buckets.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		head=buckets.get(bucketIndex);
		node<K, V> newNode=new node<>(key,value);
		size++;
		newNode.next=head;
		buckets.set(bucketIndex, newNode);
		double loadFactor=(1*size)/numBuckets;
		if(loadFactor>0.7) {
			rehash();
		}
	}
}
