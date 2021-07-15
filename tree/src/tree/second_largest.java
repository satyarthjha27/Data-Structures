package tree;

import java.util.Scanner;

public class second_largest {

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
//	static int max1=Integer.MIN_VALUE;
//	static int max2;
//	static treenode<Integer> resnode;
	public static treenode<Integer> second(treenode<Integer> root){
//		if(root==null) {
//			return null;
//		}
//		if(max1==Integer.MIN_VALUE) {
//			max1=root.data;
//			max2=root.data;
//		}
//		for(int i=0;i<root.children.size();i++) {
//			second(root.children.get(i));
//			if(root.children.get(i).data > max1 ) {
//				max1=root.children.get(i).data;
//			}
//			if(root.children.get(i).data<max1 && root.children.get(i).data>max2) {
//				max2=root.children.get(i).data;
//				resnode=root.children.get(i);
//			}
//		}
//		return resnode;
		
		treenode<Integer> first=null;
		treenode<Integer> second=null;
		secondlarge(root,first,second);
		return second;
	}
	public static void secondlarge(treenode<Integer> root, treenode<Integer> first, treenode<Integer> second){
		if(root==null) {
			return;
		}
		if(first==null) {
			first=root;
		}
		else if(first.data<root.data) {
			second=first;
			first=root;
		}
		else if(second==null) {
			if(root.data<first.data) {
				second=root;
			}
		}
		else if(root.data<first.data && root.data>second.data) {
			second=root;
			for(int i=0;i<root.children.size();i++) {
				secondlarge(root.children.get(i),first,second);
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treenode<Integer> root=takeInputLevelwise();
		System.out.println(second(root));
	}

}
