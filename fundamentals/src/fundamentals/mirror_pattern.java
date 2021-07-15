package fundamentals;
import java.util.Scanner;
public class mirror_pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		int i;
		//int k=n;
		for(i=1;i<=n;i++) {
			int j=1;
			while(j<((n-i+1)*2)) {
				System.out.print(" ");
				j++;
			}
			j=1;
			int p=1;
			while(j<=i) {
				System.out.print(p);
				p++;
				j++;
			}
			System.out.println();
		}
	}
}
