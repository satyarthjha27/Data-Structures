package fundamentals;
import java.util.Scanner;
public class inverted_no_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int p=n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(p);
			}
			System.out.println();
			p--;
		}
	}

}
