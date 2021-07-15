package array1d;

import java.util.Scanner;

public class sum_of_2_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n= s.nextInt();
			int arr[]=new int [n];
			int i,j,k;
			for(i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			int m=s.nextInt();
			int arr1[]=new int[m];
			for(j=0;j<m;j++) {
				arr1[j]=s.nextInt();
			}
			if(n>=m) {
				k=n;
			}
			else {
				k=m;
			}
			int c=0;
			int arr2 []= new int[k+1];
			for(i=arr.length-1,j=arr1.length-1,k=arr2.length-1;i>=0||j>=0;i--,j--,k--) {
				arr2[k]=c;
				if(i>=0) {
					arr2[k]+=arr[i];
				}
				if(j>=0) {
					arr2[k]+=arr1[j];
				}
				c=0;
				int temp=arr2[k];
				if(temp/10!=0) {
					arr2[k]=temp%10;
					c=temp/10;					
				}								
			}		
			arr2[0]+=c;
			for(k=0;k<arr2.length;k++) {
				System.out.print(arr2[k]+" ");
			}
			System.out.println();
			t--;
		}
	}

}
