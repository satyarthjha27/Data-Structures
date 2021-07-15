package graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;


public class get_pathBFS {

	public static ArrayList<Integer> path(int[][] edge,int v1,int v2,boolean visited[]){
		ArrayList<Integer> arr=new ArrayList<>();
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v1);
		int gotIt=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		while(!q.isEmpty()) {
			int remove=q.remove();
			visited[remove]=true;
			if(remove==v2) {
				//arr.add(v2);
				gotIt=1;
				break;
			}
			for(int i=0;i<edge.length;i++) {
				if(edge[remove][i]==1 && !visited[i]) {
					q.add(i);
					visited[i]=true;
					map.put(i, remove);

				}
			}
		}
		//		System.out.println(map);
		//		Set<Integer> keys=map.keySet();
		//		for(Integer str: keys) {
		//			int key=(Integer)str.get
		//			if(str.==v1) {
		//				arr.add(str);
		//				return arr;
		//			}
		//			arr.add(str);
		//			//map.remove(str);
		//		}
		//		for (Entry<Integer, Integer> mapElement : map.entrySet()) {
		//            int key=(int)mapElement.getKey();
		//            int value=(int)mapElement.getValue();
		//            if(value==v1) {
		//            	arr.add(key);
		//            	return arr;
		//            }
		//            arr.add(key);
		//		}
		if(gotIt==1) {
			int last=map.get(v2);
			arr.add(v2);
			while(last!=v2)
			{
				arr.add(last);
				if(map.get(last)!=null)
					last=map.get(last);
				else {
					break;
				}
			}
			return arr;
		}
		return null;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int edge[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=s.nextInt();
			int sv=s.nextInt();
			edge[fv][sv]=1;
			edge[sv][fv]=1;
		}
		int st=s.nextInt();
		int end=s.nextInt();
		ArrayList<Integer> arr=new ArrayList<>();
		boolean visited[]=new boolean[edge.length];
		arr=path(edge,st,end,visited);
		System.out.println(arr);

	}

}
