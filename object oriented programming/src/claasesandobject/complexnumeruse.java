package claasesandobject;

import java.util.Scanner;

public class complexnumeruse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int r1=s.nextInt();
		int i1=s.nextInt();
		int r2=s.nextInt();
		int i2=s.nextInt();
		complex_number c1=new complex_number(r1,i1);
		complex_number c2=new complex_number(r2,i2);
		int t=s.nextInt();
		if(t==1) {
			c1.add(c2);
			c1.print();
		}
		else if(t==2) {
			c1.multiply(c2);
			c1.print();
		}
		else
			System.out.println("Wrong input");
	}

}
