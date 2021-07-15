package array1d;
import java.util.Scanner;
public class rotate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t= s.nextInt();
		int i;
		while(t>0) {
			int n= s.nextInt();
			int arr[]= new int[n];
			for(i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int d=s.nextInt();
			for(i=0;i<d;i++) {
					int temp=arr[0];
					for(int j=0;j<n-1;j++) {
						arr[j]=arr[j+1];
					}
					arr[n-1]=temp;				
				}
			for(i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			t--;
		}
	}

}
