package algo;

import java.util.Scanner;

public class prism {

	public static int minweight(int weight[],boolean visited[]) {
		int v=weight.length;
		int min=-1;
		for(int i=0;i<v;i++) {
			if((min==-1 || weight[i]<weight[min]) && !visited[i]) {
				min=i;
			}
		}
		return min;
	}
	public static void pris(int[][] edge) {
		int v=edge.length;
		int weight[]=new int[v];
		boolean visited[]=new boolean[v];
		int parent[]=new int[v];
		weight[0]=0;
		parent[0]=-1;
		for(int i=1;i<v;i++) {
			weight[i]=Integer.MAX_VALUE;
		}
		for(int i=0;i<v;i++) {
			int vertex=minweight(weight,visited);
			visited[vertex]=true;
			for(int j=0;j<v;j++) {
				if(edge[vertex][j]!=0 && !visited[j]) {
					if(edge[vertex][j]<weight[j]) {
						weight[j]=edge[vertex][j];
						parent[j]=vertex;
					}
				}
			}
		}
		for(int i=1;i<v;i++) {
			if(parent[i]<i) {
				System.out.println(parent[i]+" "+i+" "+weight[i]);
			}else {
				System.out.println(i+" "+parent[i]+" "+weight[i]);
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
			int weight=s.nextInt();
			edge[fv][sv]=weight;
			edge[sv][fv]=weight;


		}
		pris(edge);
	}

}
