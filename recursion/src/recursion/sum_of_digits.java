package recursion;

import java.util.Scanner;

public class sum_of_digits {
	public static int sum(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+sum(n/10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n= s.nextInt();
		System.out.println(sum(n));
	}

}
