package fundamentals;
import java.util.Scanner;
public class test {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=(n/2)+1;
        for(int i=1;i<=k;i++){
            for(int j=1;j<=k-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
        	System.out.println();
        }
        k--;
        for(int i=n/2;i>=1;i--){
            for(int j=1;j<=(k-i)+1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
