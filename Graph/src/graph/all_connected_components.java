package graph;

import java.util.ArrayList;
import java.util.Scanner;

public class all_connected_components {

	public static ArrayList<Integer> help(int[][] edge, int v,boolean visited[]){
		visited[v]=true;
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(v);
		for(int i=0;i<edge.length;i++) {
			if(edge[v][i]==1 && !visited[i]) {
				visited[i]=true;
				arr.add(i);
			}
		}
		return arr;
	}
	public static ArrayList<ArrayList<Integer>> con(int[][] edge){
		ArrayList<Integer> arr=new ArrayList<>();
		ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
		
		boolean visited[]=new boolean[edge.length];
		for(int i=0;i<edge.length;i++) {
			if(!visited[i]) {
				arr=help(edge,i,visited);
				ans.add(arr);
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
		System.out.println(con(edge));

	}

}
