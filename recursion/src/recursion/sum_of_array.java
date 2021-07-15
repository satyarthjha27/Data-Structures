package recursion;

public class sum_of_array {


	public static int sum(int a[],int start){
		if(start==a.length){
			return 0;
		}
		return a[start] + sum(a,start+1);

	}
	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		return sum(input,0);      
	}
	public static void main(String[] args) {
		
	}
}
