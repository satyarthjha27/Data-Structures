package tree;

import java.util.Scanner;

public class structurally_identical {

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
		
	public static boolean structure(treenode<Integer> root1, treenode<Integer> root2) {
		if(root1==null|| root2==null) {
			return false;
		}
		if(root1.children.size()!=root2.children.size()) {
			return false;
		}
		boolean ans=false;
		if(root1.data==root2.data) {
			ans=true;
		}
		for(int i=0;i<root1.children.size();i++) {
			if(root1.children.get(i).data == root2.children.get(i).data) {
				ans=true;
				structure(root1.children.get(i), root2.children.get(i));
			}
			else {
				ans=false;
				break;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		treenode<Integer> root1=takeInputLevelwise();
		treenode<Integer> root2=takeInputLevelwise();
		System.out.println(structure(root1,root2));
	}

}
