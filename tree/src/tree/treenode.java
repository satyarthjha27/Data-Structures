package tree;
import java.util.ArrayList;
public class treenode<T> {

	public T data;
	public ArrayList<treenode<T>> children;
	public treenode(T data) {
		this.data=data;
		children=new ArrayList<>();
	}
}
