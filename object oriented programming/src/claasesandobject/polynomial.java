package claasesandobject;

public class polynomial {
	private int coeff[];
	private int degree;
	public polynomial() {
		coeff=new int[5];
		degree=0;
	}
	public void setcoefficients(int degree, int coeffecient) {
		if(degree>=coeff.length) {
			restructure();
		}
		coeff[degree]=coeffecient;
		if(degree>=this.degree) {
			this.degree=degree;
		}
	}
	public static polynomial add(polynomial p1,polynomial p2) {
		for(int i=0;i<coeff.length;i++) {
			
		}
		
	}
}
