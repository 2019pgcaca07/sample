package com.org.gen.day4;

interface OnResult{
	void onSuccess(double a);
	void onError(Exception e);
}
class Divide implements OnResult{
	OnResult onResult;
	double a,b;
	public Divide(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	void doDiv() {
		if(b==0) {
			onResult.onError(new Exception("Divide by zero"));
			return;
		}
		onResult.onSuccess(a/b);
	}
	void setOnResult(OnResult onResult) {
		this.onResult=onResult;
	}
}

public class Myclas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Divide d = new Divide(3,6) ;
		d.setOnResult(new OnResult() {

			@Override
			public void onSuccess(double a) {
				// TODO Auto-generated method stub
				System.out.println(a);
				
			}

			@Override
			public void onError(Exception e) {
				// TODO Auto-generated method stub
				System.out.println(e);
			}
			
		});
		d.doDiv();
		
	}

}
