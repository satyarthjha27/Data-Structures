package recursion;

import java.util.Scanner;

public class count_zeros {
	public static int count(int n) {
		if(n==0) {
			return 0;
		}
		if((n%10)==0) {
			 return 1+count(n/10);
		}
		else {
			return count(n/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(count(n));
	}

}
