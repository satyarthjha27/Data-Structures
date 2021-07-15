package binarySearchTree;

public class bstClass {
	private binarynode<Integer> root;

	public boolean hasData(int data) {
		return hasdataHelper(data,root);
	}
	private boolean hasdataHelper(int data, binarynode<Integer> root) {
		if(root==null) {
			return false;
		}
		if(root.data==data) {
			return true;
		}
		else if(root.data>data) {
			return hasdataHelper(data, root.left);
		}
		else
			return hasdataHelper(data, root.right);
	}
	
	public void insert(int data) {
		root=insert(data,root);
	}
	private binarynode<Integer> insert(int data, binarynode<Integer> root) {
		if(root==null) {
			binarynode<Integer> newNode=new binarynode<>(data);
			return newNode;
		}
		if(data>root.data) {
			root.right=insert(data,root.right);
		}
		else {
			root.left=insert(data,root.left);
		}
		return root;
	}
	
	public void delete(int data) {
		root=delete(data,root);
	}
	private binarynode<Integer> delete(int data, binarynode<Integer> root){
		if(root==null) {
			return null;
		}
		if(data>root.data) {
			root.right=delete(data,root.right);
			return root;
		}
		else if(data<root.data){
			root.left=delete(data,root.left);
			return root;
		}
		else {
			if(root.left==null && root.right==null) {
				return null;
			}
			else if(root.left==null && root.right!=null) {
				return root.right;
			}
			else if(root.left!=null && root.right==null) {
				return root.left;
			}
			else {
				binarynode<Integer> minNode=root.right;
				while(minNode.left!=null) {
					minNode=minNode.left;
				}
				root.data=minNode.data;
				root.right=delete(minNode.data,root.right);
				return root;
			}
		}
		
		
	}
	
	public void print() {
		print(root);
	}
	private void print(binarynode<Integer> root) {
		if(root==null) {
			return;
		}
		String s=root.data+":";
		if(root.left!=null) {
			s+="L:"+root.left.data+",";
		}
		if(root.right!=null) {
			s+="R:"+root.right.data;
		}
		System.out.println(s);
		print(root.left);
		print(root.right);
	}

}
