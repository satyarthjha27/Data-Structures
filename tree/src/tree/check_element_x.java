package tree;

import java.util.Scanner;

public class check_element_x {

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
	
	public static void print(treenode<Integer> root) {
		if(root==null) {
			return;
		}
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s+=root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static boolean checkx(treenode<Integer> root,int x) {
		if (root==null) {
			return false;
		}
		if(root.data==x) {
			return true;
		}
		boolean check=false;
		for(int i=0;i<root.children.size();i++) {
			check=checkx(root.children.get(i),x);
			if(root.children.get(i).data==x) {
				check=true;
			}
		}
		return check;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treenode<Integer> root=takeInputLevelwise();
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		System.out.println(checkx(root,x));
	}

}
