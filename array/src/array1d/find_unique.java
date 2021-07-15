package array1d;
import java.util.Scanner;
public class find_unique {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			int flag=0;
			for(int i=0;i<n;i++) {	
				flag=0;
				for(int j=i+1;j<n;j++) {
					if(arr[j]==arr[i]) {
						flag=1;
						break;
					}
				}
				if(flag==0) {
					System.out.println(arr[i]);
					break;
				}
			}
			t--;
		}
		

	}

}
