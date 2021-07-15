package array1d;
import java.util.Scanner;
public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int arr[] =new int[n];
			int i;
			int large= Integer.MIN_VALUE;
			int sec= Integer.MIN_VALUE;
			for(i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			for(i=0;i<n;i++) {
				if(large<arr[i]) {
					large=arr[i];
				}
			}
			for(i=0;i<n;i++) {
				if(arr[i]>sec && arr[i]!=large) {
					sec=arr[i];
				}
			}
			if(sec!= Integer.MIN_VALUE)
				System.out.println(sec);
			t--;
		}
	}

}
