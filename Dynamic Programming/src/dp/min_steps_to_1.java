package dp;

import java.util.Scanner;

public class min_steps_to_1 {
	public static int min(int n) {
		if(n==1) {
			return 0;
		}
		int op1;
		op1=min(n-1);
		int ans=op1;
		if(n%3==0) {
			int op2=min(n/3);
			if(op2<ans) {
				ans=op2;
			}
		}
		if(n%2==0) {
			int op3=min(n/2);
			if(op3<ans) {
				ans=op3;
			}
		}
		//int ans=Math.min(op1, Math.min(op2, op3));
		return 1+ans;
	}

	public static int minM(int n) {
		int storage[]=new int[n+1];
		for(int i=1;i<=n;i++) {
			storage[i]=-1;
		}
		return minM(n,storage);
	}
	private static int minM(int n, int[] storage) {
		if(n==1) {
			storage[n]=0;
			return 0;
		}
		if(storage[n]!=-1) {
			return storage[n];
		}
		int op1;
		op1=minM(n-1,storage);
		int ans=op1;
		if(n%3==0) {
			int op2=minM(n/3,storage);
			if(op2<ans) {
				ans=op2;
			}
		}
		if(n%2==0) {
			int op3=minM(n/2,storage);
			if(op3<ans) {
				ans=op3;
			}
		}
		storage[n]=1+ans;
		return ans+1;
	}
	public static int minDP(int n) {
		int storage[]=new int[n+1];
		storage[1]=0;
		for(int i=2;i<=n;i++) {
			int min=storage[i-1];
			if(i%3==0) {
				if(storage[i/3]<min) {
					min=storage[i/3];
				}
			}
			if(i%2==0) {
				if(storage[i/2]<min) {
					min=storage[i/2];
				}
			}
			storage[i]=1+min;
		}
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(minDP(n));
	}

}
