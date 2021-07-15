package strings;
import java.util.Scanner;
public class all_substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner(System.in);
		String str=s.next();
		int n=str.length();
		for(int i =0;i<n;i++) {
			for(int j=i;j<n;j++){
				System.out.println(str.substring(i, j+1));
			}
		}
	}

}
