package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class get_pathDFS {

	public static ArrayList<Integer> path(int[][] edge,int v1,int v2,boolean visited[]) {
		ArrayList<Integer> arr=new ArrayList<>();
		//ArrayList<Integer> ans=new ArrayList<>();
		if(v1==v2) {
			arr.add(v2);
			return arr;
		}
//		if(v1>v2) {
//			return null;
//		}
		visited[v1]=true;
		for(int i=0;i<edge.length;i++) {
			if(edge[v1][i]==1 && !visited[i]) {
				visited[i]=true;
				arr=path(edge,i,v2,visited);
				if(arr!=null) {
					arr.add(i);
					return arr;
				}
				else {
					return null;
				}
			}
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
