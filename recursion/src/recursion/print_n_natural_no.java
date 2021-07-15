package recursion;

public class print_n_natural_no {
	public static void print(int n) {
		if(n==0) {
			return;
		}
		print(n-1);
		System.out.print(n+" ");
	}
	public static int fib(int n) {
		if(n==1||n==2) {
			return 1;
		}
		int output=fib(n-1)+fib(n-2);
		return output;
	}
	public static boolean isSorted(int a[]) {
		if(a.length==1) {
			return true;
		}
		if(a[0]>a[1]) {
			return false;
		}
		int small[]=new int[a.length-1];
		for(int i=1;i<a.length;i++) {
			small[i-1]=a[i];
		}
		boolean output=isSorted(small);
		return output;
	}
	public static void main(String[] args) {
		//print(5);
		System.out.println(fib(5));
		//int arr[]=new int[5];
	//	arr= {1,3,4,6,8};
	//	System.out.println(isSorted(arr));
	}

}
