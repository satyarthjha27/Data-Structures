package graph;

import java.util.Scanner;

public class island {
	
	
	
                                                        //PROBLEM WITH QUESTION


	public static int islands(int[][] edge,int j) {
		int count=0;
		int v=edge.length;
		int ans=v-1;
		for(int i=0;i<v;i++) {
			count=0;
			if(i==j) {
				continue;
			}
			if(edge[j][i]==1) {
				count++;
				islands(edge,j+1);
			}
			if(count<ans)
				ans=count;
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
		System.out.println(islands(edge,0));
	}
}
