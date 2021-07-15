package Tries;

class Trienode {
	char data;
	boolean terminating;
	Trienode children[];
	int childcount;
	public Trienode(char data) {
		this.data=data;
		terminating=false;
		children=new Trienode[26];
		childcount=0;
	}
}

public class trie {

	Trienode root;
	
	public trie() {
		root=new Trienode('\0');
	}
	
	public void add(String word) {
		add(root,word);
	}
	public void remove(String word) {
		remove(root,word);
	}
	private void remove(Trienode root, String word) {
		if(word.length()==0) {
			root.terminating=false;
			return;
		}
		int childindex=word.charAt(0)-'a';
		Trienode child=root.children[childindex];
		if(child==null) {
			return;
		}
		remove(child,word.substring(1));
		
		if(!child.terminating && child.childcount==0) {
			root.children[childindex]=null;
			child=null;
			root.childcount--;
		}
	}
	public int countword() {
		//return count(root,word);
		return root.childcount;
	}
	public String complete(String word) {
		return complete(root,word.charAt(0));
	}
	
	private String complete(Trienode root) {
		if(root.children==null ) {
			return null;
		}
		System.out.println(root.data);
		int childindex=word.charAt(0)-'a';
		Trienode child=root.children[childindex];
		if(child==null) {
			
		}
		return complete(child,word.substring(1));
	}

	private void add(Trienode root, String word) {
		if(word.length()==0) {
			root.terminating=true;
			return;
		}
		int childindex=word.charAt(0)-'a';
		Trienode child=root.children[childindex];
		if(child==null) {
			child=new Trienode(word.charAt(0));
			root.children[childindex]=child;
			root.childcount++;
		}
		add(child,word.substring(1));
	}
	
	public boolean search(String word) {
		return search(root,word);
	}

	private boolean search(Trienode root, String word) {
		if(word.length()==0 ) {
			return root.terminating;
			//return true;
		}
		int childindex=word.charAt(0)-'a';
		Trienode child=root.children[childindex];
		if(child!=null) {
			return search(child, word.substring(1));
		}
		return false;
	}
}
