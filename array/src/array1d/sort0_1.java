package array1d;
import java.util.Scanner;
public class sort0_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int c=0;
			for(int i=0;i<n;i++) {
				if(arr[i]==0) {
					c++;
				}
			}
			for(int i=0;i<c;i++) {
				System.out.print("0 ");
			}
			for(int i=0;i<n-c;i++) {
				System.out.print("1 ");
			}
			System.out.println();
			t--;
		}
	}

}
