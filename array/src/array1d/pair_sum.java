package array1d;
import java.util.Scanner;
public class pair_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int x=s.nextInt();
			int c=0;
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					if((arr[i]+arr[j])==x) {
						c++;
					}
				}
			}
			System.out.println(c);
			t--;
		}
	}

}
