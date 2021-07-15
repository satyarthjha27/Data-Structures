package dp;

import java.util.Scanner;

public class staircase {

	public static int stair(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else
			return stair(n-3)+stair(n-2)+stair(n-1);
	}
	public static int stairM(int n) {
		int storage[]=new int[n+1];
		return stairM(n,storage);
	}
	private static int stairM(int n, int[] storage) {
		if(storage[n]!=0) {
			return storage[n];
		}
		if(n==1||n==0) {
			storage[n]=1;
			return storage[n];
		}
		if(n==2) {
			storage[n]=2;
			return storage[n];
		}
		storage[n]=stairM(n-3,storage)+stairM(n-2,storage)+stairM(n-1,storage);
		return storage[n];
	}
	public static int stairDP(int n) {
		int storage[]=new int[n+1];
		storage[0]=storage[1]=1;
		storage[2]=2;
		for(int i=3;i<=n;i++) {
			storage[i]=storage[i-3]+storage[i-2]+storage[i-1];
		}
		return storage[n];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(stairDP(n));
		System.out.println(stairM(n));
		System.out.println(stair(n));
	}

}
