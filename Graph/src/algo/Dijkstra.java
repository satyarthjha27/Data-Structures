package algo;

import java.util.Scanner;

public class Dijkstra {
	public static void dij(int[][] edge) {
		int v=edge.length;
		boolean visited[]=new boolean[v];
		int dist[]=new int[v];
		dist[0]=0;
		for(int i=1;i<v;i++) {
			dist[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<v;i++) {
			int vertex=minvertex(dist,visited);
			visited[vertex]=true;
			for(int j=0;j<v;j++) {
				if(edge[vertex][j]!=0 && !visited[j] && dist[vertex]!=Integer.MAX_VALUE) {
					int newDist=edge[vertex][j]+dist[vertex];
					if(dist[j]>newDist) {
						dist[j]=newDist;
					}
				}
			}
		}
		for(int i=0;i<v;i++) {
			System.out.println(i+" "+dist[i]);
		}
	}

	public static int minvertex(int dst[],boolean visited[]) {
		int min=-1;
		for(int i=0;i<dst.length;i++) {
			if(!visited[i] && (min==-1 || dst[i]<dst[min]))
				min=i;
		}
		return min;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int e=s.nextInt();
		int edge[][]=new int[n][n];
		for(int i=0;i<e;i++) {
			int fv=s.nextInt();
			int sv=s.nextInt();
			int w=s.nextInt();
			edge[fv][sv]=w;
			edge[sv][fv]=w;
		}
		dij(edge);
	}

}
