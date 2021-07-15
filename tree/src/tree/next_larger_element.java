package tree;

import java.util.Scanner;

public class next_larger_element {

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
	static int num=Integer.MAX_VALUE;
	static treenode<Integer> resnode;
	public static int larger(int n, treenode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.data>n && num==Integer.MAX_VALUE) {
			num=root.data;
			//resnode=root;
		}
		for(int i=0;i<root.children.size();i++) {
			int prev=larger(n,root.children.get(i));
			if(root.children.get(i).data>n && root.children.get(i).data<num && root.children.get(i).data<prev) {
				num=root.children.get(i).data;
				//resnode=root;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treenode<Integer> root=takeInputLevelwise();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(larger(n,root));
	}

}
