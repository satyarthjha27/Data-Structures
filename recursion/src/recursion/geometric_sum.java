package recursion;

import java.util.Scanner;

public class geometric_sum {

	public static double sum(int k) {
		if(k==0) {
			return 1;
		}
		double ans=1/(Math.pow(2, k)) + sum(k-1);
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int k=s.nextInt();
		System.out.println(sum(k));

	}

}
