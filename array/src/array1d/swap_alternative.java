package array1d;

import java.util.Scanner;

public class swap_alternative {

	public static int[] input() {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void print(int input[]) {
		if((input.length)%2==0){
			for(int i=0;i<input.length;i+=2) {
				int temp;
				temp = input[i];
				input[i]=input[i+1];
				input[i+1]=temp;
			}
		}
		else {
			for(int i=0;i<input.length-1;i+=2) {
				int temp;
				temp = input[i];
				input[i]=input[i+1];
				input[i+1]=temp;
			}
		}
		for(int i=0;i<input.length;i++)
			System.out.print(input[i]+" ");
		}
		public static void main(String[] args) {
			Scanner s= new Scanner(System.in);
			int t=s.nextInt();
			while(t>0) {
				int arr[] =input();
				print(arr);
				t--;
			}
		}

	}
