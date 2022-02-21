package com.org.gen.mypractice;

public class CopyConstr {
	
	
	
	int re,im,op;

	

	public CopyConstr(int re, int im, int op) {
		super();
		this.re = re;
		this.im = im;
		this.op = op;
	}

	public CopyConstr(int re, int im) {
		super();
		this.re = re;
		this.im = im;
	}
	
	
	CopyConstr(CopyConstr c){
		re=c.re;
		im=c.im;
	}

    void display() {
    	System.out.println("real is "+re+" and imag is "+im);
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyConstr c1 = new CopyConstr(12,21);
		c1.display();
		CopyConstr c2 = new CopyConstr(c1);
		c2.display();

	}

}
