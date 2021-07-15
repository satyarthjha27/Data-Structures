package dp;

import java.util.Scanner;

public class knapsack {
	
	public static int knap(int weight[],int val[],int wi) {
		return knap(weight,val,wi,0);
	}

	private static int knap(int[] weight, int[] val, int wi, int i) {
		if(weight.length==i||wi==0) {
			return 0;
		}
		if(weight[i]>wi) {
			return knap(weight,val,wi,i+1);
		}
		else {
			int op1=val[i]+knap(weight,val,wi-weight[i],i+1);//include the item
			int op2=knap(weight,val,wi,i+1);//dont include the item
			int ans=Math.max(op1,op2);
			return ans;
		}
	}
	public static int knapM(int weight[],int val[],int wi) {
		int storage[][]=new int[val.length+1][wi+1];
		for(int i=0;i<=val.length;i++) {
			for(int j=0;j<=wi;j++) {
				storage[i][j]=-1;
			}
		}
		return knapM(weight,val,wi,0,storage);
	}
	private static int knapM(int[] weight, int[] val, int wi, int i, int[][] storage) {
		if(wi==0||weight.length==i) {
			storage[i][wi]=0;
			return 0;
		}
		if(storage[i][wi]!=-1) {
			return storage[i][wi];
		}
		else {
			if(wi>weight[i]) {
				return knapM(weight, val, wi, i+1, storage);
			}else {
				int op1=val[i]+knapM(weight, val, wi-weight[i], i+1, storage);
				int op2=knapM(weight, val, wi, i+1, storage);
				storage[i][wi]=Math.max(op1, op2);
			}
		}
		return storage[i][wi];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int weight[]=new int[n];
		int val[]=new int[n];
		for(int i=0;i<n;i++) {
			weight[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
			val[i]=s.nextInt();
		int wi=s.nextInt();
		System.out.println(knap(weight,val,wi));
		System.out.println(knapM(weight,val,wi));
		//System.out.println(knapDP(weight,val,wi));

	}

}
