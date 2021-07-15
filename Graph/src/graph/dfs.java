package graph;

import java.util.Scanner;

public class dfs {
	public static void print(int[][] edge) {
		boolean visited[]=new boolean[edge.length];
		for(int i=0;i<edge.length;i++) {
			if(!visited[i]) {
				printhelp(edge,i,visited);
			}
		}
	}
	
	private static void printhelp(int[][] edge, int v, boolean[] visited) {
		//System.out.println(v);
		visited[v]=true;
		int n=edge.length;
		for(int i=0;i<n;i++) {
			if(edge[v][i]==1 && !visited[i]) {
				printhelp(edge,i,visited);
			}
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int[][] edge=new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=s.nextInt();
			int sv=s.nextInt();
			edge[fv][sv]=1;
			edge[sv][fv]=1;
		}
		print(edge);
	}

}
