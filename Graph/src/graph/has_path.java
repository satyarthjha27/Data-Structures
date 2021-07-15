package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class has_path {

	public static boolean path(int[][] edge,int v1,int v2,boolean[] visited) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v1);
		visited[v1]=true;
		boolean ans=false;
		while(!q.isEmpty()) {
			int remove=q.remove();
			if(v2==remove) {
				ans=true;
				break;
			}
			for(int i=0;i<edge.length;i++) {
				if(edge[remove][i]==1 && !visited[i]) {
					q.add(i);
					visited[i]=true;
				}
			}
		}
		return ans;
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
		boolean visited[]=new boolean[edge.length];
		System.out.println(path(edge,st,end,visited));
	}
}
