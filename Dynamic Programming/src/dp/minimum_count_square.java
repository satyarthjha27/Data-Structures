package dp;

import java.util.Scanner;

public class minimum_count_square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(minsqM(n));
		System.out.println(minsqDP(n));
		//System.out.println(minsq(n));

	}

	public static int minsq(int n) {
		if(n<=3) {
			return n;
		}
		int ans=n;
		for(int i=1;i<=n;i++) {
			int temp=i*i;
			if(temp>n){
				break;
			}
			else
				ans=Math.min(ans, 1+minsq(n-temp));
		}
		return ans;
	}
	public static int minsqM(int n) {
		int storage[]=new int[n+1];
		return minsqM(n,storage);
	}
	public static int minsqDP(int n) {
		int storage[]=new int[n+1];
		storage[0]=0;
		storage[1]=1;
		storage[2]=2;
		storage[3]=3;
		for(int j=4;j<=n;j++) {
			storage[j]=j;
			for(int i=1;i<=Math.sqrt(j);i++) {
				int temp=i*i;
				if(temp>j){
					break;
				}
				else
					storage[j]=Math.min(storage[j], 1+storage[j-temp]);
			}
		}
		return storage[n];
	}
	private static int minsqM(int n, int[] storage) {
		if(n<=3) {
			storage[n]=n;
			return n;
		}
		if(storage[n]!=0) {
			return storage[n];
		}
		int ans=n;
		for(int i=1;i<=n;i++) {
			int temp=i*i;
			if(temp>n){
				break;
			}
			else
				ans=Math.min(ans, 1+minsqM(n-temp,storage));
		}
		storage[n]=ans;
		return ans;
	}
}
