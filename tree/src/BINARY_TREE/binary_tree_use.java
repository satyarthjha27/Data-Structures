package BINARY_TREE;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class binary_tree_use {

	public static binarynode<Integer> takeInput(Scanner s){
		System.out.println("Enter the root data ");
		int n=s.nextInt();
		if(n==-1) {
			return null;
		}
		binarynode<Integer> root=new binarynode<>(n);
		root.left=takeInput(s);
		root.right=takeInput(s);
		return root;
	}
	public static binarynode<Integer> takeInputLevel(){
		Scanner s=new Scanner(System.in);
		int rootdata;
		queueLL<binarynode<Integer>> queue=new queueLL<>();
		System.out.println("Enter root data ");
		rootdata=s.nextInt();
		if(rootdata==-1) {
			return null;
		}
		binarynode<Integer> root=new binarynode<>(rootdata);
		queue.enqueue(root);
		binarynode<Integer> front;
		while(!queue.isEmpty()) {
			try {
				front=queue.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter the Left Child of "+front.data);
			int left=s.nextInt();
			if(left!=-1) {
				binarynode<Integer> child=new binarynode<>(left);
				queue.enqueue(child);
				front.left=child;
			}
			System.out.println("Enter the Right Child of "+front.data);
			int right=s.nextInt();
			if(right!=-1) {
				binarynode<Integer> child=new binarynode<>(right);
				queue.enqueue(child);
				front.right=child;
			}
		}
		return root;
	}
 	public static void print(binarynode<Integer> root) {
		if(root==null) {
			return;
		}
		String str=root.data+": ";
		if(root.left!=null) {
			str+= "L:"+root.left.data+",";
		}
		if(root.right!=null) {
			str+="R:"+root.right.data;
		}
		System.out.println(str);
		print(root.left);
		print(root.right);
	}
 	public static void printLevel(binarynode<Integer> root) {
 		if(root==null) {
 			return;
 		}
 		Queue<binarynode<Integer>> queue = new LinkedList<binarynode<Integer>>();
 		queue.add(root);
 		while(!queue.isEmpty()) {
 			binarynode<Integer> first=queue.poll();
 			System.out.print(first.data);
 			if(first.left!=null) {
 				System.out.print(" L:"+ first.left.data+",");
 				queue.add(first.left);
 			}
 			if(first.right!=null) {
 				System.out.print(" R:"+first.right.data);
 				queue.add(first.right);
 			}
 			System.out.println();
 		}
 	}
 	public static int countnode(binarynode<Integer> root) {
 		if(root==null) {
 			return 0;
 		}
 		int ans=1;
 		ans+=countnode(root.left);
 		ans+=countnode(root.right);
 		return ans;
 	}
 	public static int height(binarynode<Integer> root) {
 		if(root==null) {
 			return 0;
 		}
// 		int arr[]=new int[2];
// 		arr[0]=height(root.left);
// 		arr[1]=height(root.right);
// 		int temp;
// 		if(arr[0]>arr[1]) {
// 			temp=arr[0];
// 		}
// 		else
// 			temp=arr[1];
// 	return 1+temp;
 		
 		int lh=height(root.left);
 		int rh=height(root.right);
 		return 1+Math.max(lh, rh);
    }	
 	public static boolean nodePresent(int x, binarynode<Integer> root) {
 		if(root==null) {
 			return false;
 		}
 		if(root.data==x) {
 			return true;
 		}
 		boolean ans=false;
 		boolean ans1=false;
 		if(root.left!=null)
 			ans=nodePresent(x, root.left);
 		if(root.right!=null)
 			ans1=nodePresent(x, root.right);
 		boolean ans2=(ans||ans1);
 		return ans2;
 	}
 	public static int diameter(binarynode<Integer> root) {
 		if(root==null) {
 			return 0;
 		}
 		int op1=height(root.left)+height(root.right);
 		int op2=diameter(root.left);
 		int op3=diameter(root.right);
 		return Math.max(op1, Math.max(op2, op3));
 	}
 	public static pair<Integer, Integer> diameterbetter(binarynode<Integer> root) {
 		if(root==null) {
 			pair<Integer, Integer> output=new pair<>();
 			output.first=0;
 			output.second=0;
 			return output;
 		}
 		pair<Integer, Integer> lo=diameterbetter(root.left);
 		pair<Integer, Integer> ro=diameterbetter(root.right);
 		pair<Integer, Integer> output=new pair<>();
 		int height=1+Math.max(lo.first, ro.first);
 		int op1=lo.first+ro.first;
 		int op2=lo.second;
 		int op3=ro.second;
 		int diameter=Math.max(op1, Math.max(op2, op3));
 		output.first=height;
 		output.second=diameter;
 		return output;
 	}
	public static void inorder(binarynode<Integer> root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void preorder(binarynode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void postorder(binarynode<Integer> root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
 	
	public static binarynode<Integer> make(int[] pre,int[] in){
		binarynode<Integer> root=make(pre,in,0,pre.length-1,0,in.length-1);
		return root;		
	}
	public static binarynode<Integer> make(int[] pre, int[] in, int sipre, int eipre, int siIn, int eiIn){
		 if(sipre>eipre){
	            return null;
	       }
		int rootdata=pre[sipre];
		binarynode<Integer> root=new binarynode<Integer>(rootdata);
		
		int rootIndex=-1;
		for(int i=siIn;i<=eiIn;i++) {
			if(in[i]==rootdata) {
				rootIndex=i;
				break;
			}
		}
		int siPreLeft=sipre+1;
		int siInLeft=siIn;
		int eiInLeft=rootIndex-1;
		int siInRight=rootIndex+1;
		int eiInRight= eiIn;
		int eiPreRight=eipre;
		int leftArrayLength=eiInLeft-siInLeft+1;
		int eiPreLeft=siPreLeft+leftArrayLength-1;
		int siPreRight=eiPreLeft+1;
		
		binarynode<Integer> left=make(pre,in,siPreLeft,eiPreLeft,siInLeft,eiInLeft);
		binarynode<Integer> right=make(pre,in,siPreRight,eiPreRight,siInRight,eiInRight);
		root.left=left;
		root.right=right;
		return root;
	}
	
	public static binarynode<Integer> makePost(int [] post, int[] in){
		return help(post,in,0,post.length-1,0,in.length-1);
	}
	public static binarynode<Integer> help(int[] post, int[] in,int sipost,int eipost,int siIn,int eiIn){
		if(siIn>eiIn) {
			return null;
		}
		int rootdata=post[eipost];
		binarynode<Integer> root=new binarynode<>(rootdata);
		int rootindex=-1;
		for(int i=siIn;i<=eiIn;i++) {
			if(rootdata==in[i]) {
				rootindex=i;
				break;
			}
		}
	
		int eiPostRight=eipost-1;
		int siInRight=rootindex+1;
		int eiInRight=eiIn;
		int siPostLeft=sipost;
		int siInLeft=siIn;
		int eiInLeft=rootindex-1;
		int eiPostLeft=eiInLeft-siInLeft+siPostLeft;
		int siPostRight=eiPostLeft+1;
		
		binarynode<Integer> left=help(post,in,siPostLeft,eiPostLeft,siInLeft,eiInLeft);
		binarynode<Integer> right=help(post,in,siPostRight,eiPostRight,siInRight,eiInRight);
		root.left=left;
		root.right=right;
		return root;
		
	}
	public static binarynode<Integer> mirror(binarynode<Integer> root){
		if(root==null) {
			return null;
		}
		mirror(root.left);
		mirror(root.right);
		binarynode<Integer> temp=root.left;
		root.left=root.right;
		root.right=temp;
		return root;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		binarynode<Integer> root=new binarynode<>(1);
//		binarynode<Integer> node1=new binarynode<>(1);
//		binarynode<Integer> node2=new binarynode<>(1);
//		root.left=node1;
//		root.right=node2;
		Scanner s= new Scanner(System.in);
		//binarynode<Integer> root=takeInputLevel();
		//print(root);
		//System.out.println(countnode(root));
		//System.out.println(height(root));
		//System.out.println(nodePresent(79,root));
		//System.out.println("Diameter: "+diameterbetter(root).second);
		//System.out.println("Height: "+ diameterbetter(root).first);
//		System.out.println("Preorder: ");
//		preorder(root);
//		System.out.println("Inorder: ");
//		inorder(root);
//		System.out.println("PostOrder: ");
//		postorder(root);
		//root=mirror(root);
		//printLevel(root);
		
//		int n=s.nextInt();
//		int pre[]=new int[n];
//		int in[] = new int [n];
//		for(int i=0;i<n;i++) {
//			pre[i]=s.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			in[i]=s.nextInt();
//		}
//		binarynode<Integer> root;
//		root=make(pre,in);
//		print(root);
		
		int j=s.nextInt();
		int post[]=new int[j];
		int in[] = new int [j];
		for(int i=0;i<j;i++) {
			post[i]=s.nextInt();
		}
		for(int i=0;i<j;i++) {
			in[i]=s.nextInt();
		}
		binarynode<Integer> root;
		root=makePost(post,in);
		print(root);
	}

}
