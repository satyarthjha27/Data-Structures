package array1d;
import java.util.Scanner;
public class arr {

	public static void main(String[] args) {
		//Your code goes here
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
			int n=s.nextInt();
			int arr[]= new int[n];
			for(int i=0;i<n;i++){
				arr[i]=s.nextInt();
			}
			for(int i=0;i<arr.length-1;i++){
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]==arr[i])
						System.out.println(arr[i]);
				}
			}
			t--;
		}
	}
}
