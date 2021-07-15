package array1d;
import java.util.Scanner;
public class push_0_to_end {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t =s.nextInt();
		while(t>0) {
			int n= s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int c=0;
			for(int i=0;i<n;i++) {
				if(arr[i]!=0) {
					System.out.print(arr[i]+" ");
					c++;
				}			
			}
			for(int i=0;i<n-c;i++) {
				System.out.print("0 ");
			}
			System.out.println();
			t--;
		}
	}

}
