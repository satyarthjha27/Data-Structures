package tree;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class treeUse {

	public static treenode<Integer> takeInput(Scanner s){
		int n;
		System.out.println("Enter Next Node Data ");
		n=s.nextInt();
		treenode<Integer> root=new treenode<>(n);
		System.out.println("Enter number of Children for "+n);
		int childcount=s.nextInt();
		for(int i=0;i<childcount;i++) {
			treenode<Integer> child= takeInput(s);
			root.children.add(child);
		}
		return root;
	}

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


	public static int numNode(treenode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			count+=numNode(root.children.get(i));
		}
		return count;
	}

	public static int largest(treenode<Integer> root) {
		if(root==null) {
			return Integer.MIN_VALUE;
		}
		int ans=root.data;
		for(int i=0;i<root.children.size();i++) {
			int child=largest(root.children.get(i));
			if(child>ans) {
				ans=child;
			}
		}
		return ans;
	}
	public static int height(treenode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int arr[]=new int[numNode(root)];
		for(int i=0;i<root.children.size();i++) {
			arr[i]=height(root.children.get(i));
		}
		int temp=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp) {
				temp=arr[i];
			}
		}
		return 1+temp;
	}
	public static void printAtDepth(treenode<Integer> root, int k) {
		if(k<=-1) {
			return;
		}
		if(k==0) {
			System.out.println(root.data);
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			printAtDepth(root.children.get(i), k-1);
		}
	}
	public static int leafnode(treenode<Integer> root) {
		if(root==null) {
			return 0;
		}
		if(root.children.size()==0){
			return 1;
		}
		int count=0;
		for(int i=0;i<root.children.size();i++) {
			count+=leafnode(root.children.get(i));
		}
		return count;
	}
	public static void postorder(treenode<Integer> root) {
		if(root==null) {
			return;
		}
		for(int i=0;i<root.children.size();i++) {
			postorder(root.children.get(i));
		}
		System.out.print(root.data+" ");
	}
	public static int sumofall(treenode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int ans=0;
		for(int i=0;i<root.children.size();i++) {
			ans+=sumofall(root.children.get(i));
			ans+=root.children.get(i).data;
		}
		return ans;
	}
	public static int greaterThanx(treenode<Integer> root, int x) {
		int count=0;
		if(root==null) {
			return 0;
		}
		for(int i=0;i<root.children.size();i++) {
			count+=greaterThanx(root.children.get(i),x);
			if(x<root.children.get(i).data) {
				count++;
			}
		}
		return count;
	}
	public static void printLevelwise(treenode<Integer> root) {
		Queue<treenode<Integer>> queue=new LinkedList<treenode<Integer>>();
		queue.add(root);
		System.out.println(root.data);
		while(!queue.isEmpty()) {
			treenode<Integer> frontnode;
			frontnode = queue.poll();
			for(int i=0;i<frontnode.children.size();i++) {
				System.out.print(frontnode.children.get(i).data+" ");
				queue.add(frontnode.children.get(i));
			}		
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		Scanner s= new Scanner(System.in);
		//		treenode<Integer> root= takeInput(s);
		treenode<Integer> root=takeInputLevelwise();
		//System.out.println(numNode(root));
		//System.out.println(largest(root));
		//System.out.println(height(root));
		//printAtDepth(root,2);
		//System.out.println(leafnode(root));
		//postorder(root);
		//System.out.println(sumofall(root));
		//System.out.println(greaterThanx(root ,10));
		printLevelwise(root);
		//print(root);


		//		treenode<Integer> root =new treenode<>(4);
		//		treenode<Integer> node1=new treenode<>(2);
		//		treenode<Integer> node2=new treenode<>(3);
		//		treenode<Integer> node3=new treenode<>(5);
		//		treenode<Integer> node4=new treenode<>(6);
		//		root.children.add(node1);
		//		root.children.add(node2);
		//		root.children.add(node3);
		//		node2.children.add(node4);
		//		System.out.println();
	}

}
