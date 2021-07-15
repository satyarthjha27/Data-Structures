package graph;

import java.util.Scanner;

public class isConnected {

	public static boolean connect(int[][] edge,int v,boolean visited[]) {
		visited[v]=true;
		boolean ans=true;
		for(int i=0;i<edge.length;i++) {
			if(edge[v][i]==1 && !visited[i]) {
				visited[i]=true;
				ans=connect(edge,i,visited);
			}
		}
		for(int i=0;i<visited.length;i++) {
			if(visited[i]==false) {
				ans=false;
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
		boolean visited[]=new boolean[edge.length];
		System.out.println(connect(edge,0,visited));
	}

}
