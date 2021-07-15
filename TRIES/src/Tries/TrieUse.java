package Tries;

public class TrieUse {

	public static void main(String[] args) {
		trie t=new trie();
		t.add("this");
		t.add("news");
		t.add("you");
		System.out.println(t.search("news"));
		t.remove("news");
		System.out.println(t.countword());
	}

}
