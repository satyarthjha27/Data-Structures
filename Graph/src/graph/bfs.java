package graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {
	public static void print(int[][] edge) {
		boolean visited[]=new boolean[edge.length];
		for(int i=0;i<edge.length;i++) {
			if(!visited[i]) {
				printhelp(edge,i,visited);
			}
		}
	}

	private static void printhelp(int[][] edge, int v, boolean[] visited) {
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(v);
		visited[v]=true;
		while(!q.isEmpty()) {
			int front=q.remove();
			System.out.println(front);
			for(int i=0;i<edge.length;i++) {
				if(edge[front][i]==1 && !visited[i]) {
					q.add(i);
					visited[i]=true;
				}
			}
		}
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
		print(edge);
	}
}
