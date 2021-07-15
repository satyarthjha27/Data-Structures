package claasesandobject;

public class complex_number {
	private int real;
	private int imag;
	public complex_number(int real,int imag) {
		this.real=real;
		this.imag=imag;
	}
	public int getImag() {
		return imag;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int r) {
		real=r;
	}
	public void setImag(int i) {
		imag=i;
	}
	public void print() {
		System.out.println(real+" "+imag+"i");
	}
	public void add(complex_number c2) {
		this.real=this.real+c2.real;
		this.imag=this.imag+c2.imag;
	}
	public void multiply(complex_number c2) {
		this.real=(real*c2.real)-(imag*c2.imag);
		this.imag=(real*c2.imag)+(c2.real*imag);
	}

}
