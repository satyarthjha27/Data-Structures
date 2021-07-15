package recursion;

import java.util.Scanner;
	
public class multiplication_recursion {
	public static int multiply(int m,int n) {
		if(n==0) {
			return 0;
		}
		int s=multiply(m,n-1);
		int ans=m+s;
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.println(multiply(m,n));
	}

}
