package Basics;

public class node<K, V> {
K key;
V value;
node<K,V> next;
public node(K key, V value) {
	this.key=key;
	this.value=value;
	next=null;
}
}
