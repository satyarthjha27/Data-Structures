	package tree;

import java.util.Scanner;

public class replace_node_with_depth {
	
	public static treenode<Integer> takeInputLevelwise(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the root data ");
		int rootdata =s.nextInt();
		treenode<Integer> root=new treenode<>(rootdata);
		queueLL<treenode<Integer>> queue= new queueLL<>();
		queue.enqueue(root);
		while(!queue.isEmpty()) {
			try {
				treenode<Integer> frontnode= queue.dequeue();
				System.out.println("Enter number of children of "+ frontnode.data);
				int childcount=s.nextInt();
				for(int i=0;i<childcount;i++) {
					System.out.println("Enter "+(i+1)+"th child of "+frontnode.data);
					int child=s.nextInt();
					treenode<Integer> childnode= new treenode<>(child);
					frontnode.children.add(childnode);
					queue.enqueue(childnode);

				}
			} catch (QueueEmptyException e) {
				return null;
			}
		}
		return root;
	}
//	public static int height(treenode<Integer> root) {
//		if(root==null) {
//			return 0;
//		}
//		int arr[]=new int[numNode(root)];
//		for(int i=0;i<root.children.size();i++) {
//			arr[i]=height(root.children.get(i));
//		}
//		int temp=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>temp) {
//				temp=arr[i];
//			}
//		}
//		return 1+temp;
//	}
//	public static int numNode(treenode<Integer> root) {
//		if(root==null) {
//			return 0;
//		}
//		int count=1;
//		for(int i=0;i<root.children.size();i++) {
//			count+=numNode(root.children.get(i));
//		}
//		return count;
//	}
//	public static treenode<Integer> replace(treenode<Integer> root){
//		int n=height(root);
//		root=replace(root,n);
//		return root;
//	}
//	
	public static void replace(treenode<Integer> root, int k){
		if(root==null) {
			return;
		}
		//treenode<Integer> temp;
		root.data=k;
		for(int i=0;i<root.children.size();i++) {
			replace(root.children.get(i),k+1);
		}
		
	}
	public static void print(treenode<Integer> root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s+= root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treenode<Integer> root = takeInputLevelwise();
		replace(root,0);
		print(root);
	}

}
