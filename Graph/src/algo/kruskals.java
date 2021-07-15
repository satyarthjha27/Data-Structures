package algo;

import java.util.Arrays;
import java.util.Scanner;

class edge implements Comparable<edge>{
	int source;
	int dest;
	int weight;
	@Override
	public int compareTo(edge o) {
		return this.weight-o.weight;
	}
	
}
public class kruskals {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		edge input[]=new edge[e];
		for(int i=0;i<e;i++) {
			input[i]=new edge();
			input[i].source=s.nextInt();
			input[i].dest=s.nextInt();
			input[i].weight=s.nextInt();
		}
		kruskal(input,v);
		
	}

	private static void kruskal(edge[] input, int v) {
		edge output[]=new edge[v-1];
		int count=0;
		Arrays.sort(input);
		int[] parent=new int[v];
		int i=0;
		for(int j=0;j<v;j++) {
			parent[j]=j;
		}
		while(count!=v-1) {
			edge currentedge=input[i];
			int sourceparent=findParent(currentedge.source,parent);
			int desparent=findParent(currentedge.dest,parent);
			
			if(sourceparent!=desparent) {
				output[count]=currentedge;
				parent[sourceparent]=desparent;
				count++;
			}
			i++;
		}
		for(int j=0;j<v-1;j++) {
			if(output[j].source < output[j].dest)
				System.out.println(output[j].source+" "+output[j].dest+" "+output[j].weight);
			else
				System.out.println(output[j].dest+" "+output[j].source+" "+output[j].weight);
		}
	}

	private static int findParent(int v, int[] parent) {
		if(v==parent[v]) {
			return v;
		}
		return findParent(parent[v], parent);
		
	}
}
