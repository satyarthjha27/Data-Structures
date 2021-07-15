package tree;

import java.util.Scanner;

public class node_having_max_sum {

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

	static treenode<Integer> resnode;
	static int maxsum;
	public static int max(treenode<Integer> root){
		if(root==null) {
			return 0;
		}
		int currsum=root.data;
		for(int i=0;i<root.children.size();i++) {
			currsum+=root.children.get(i).data;
			max(root.children.get(i));
		}
		if(currsum>maxsum) {
			resnode=root;
			maxsum=currsum;
		}
		return resnode.data;
	}
	
//	public static int maxnode(treenode<Integer> root) {
//		int maxsum=0;
//		max(root);
//		return root.data;
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treenode<Integer> root=takeInputLevelwise();
		System.out.println(max(root));
		
	}

}
