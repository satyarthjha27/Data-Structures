package array1d;

import java.util.Scanner;

public class sort_0_1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int i;
			int arr[]=new int [n];
			for(i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			for(i=0;i<n-1;i++) {

				for(int j=i+1;j<n;j++) {
					if(arr[j]<arr[i]) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						//break;
					}
				}
			}

			for(i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			t--;
		}
	}

}
