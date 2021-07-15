package recursion;

import java.util.Scanner;

public class staircase {
	public static int stair(int n) {
		if(n==0||n==1) {
			return 1;
		}
		if(n==2) {
			return 2;
		}
		return stair(n-1)+stair(n-2)+stair(n-3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(stair(n));
	}

}
