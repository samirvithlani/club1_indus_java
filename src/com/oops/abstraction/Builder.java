package com.oops.abstraction;

interface RERA {

	void complate();
}

interface AUDA extends RERA {

	//complate method's body can not create over here cz of interface...
	void gst();
}

public class Builder implements AUDA {

	public void complate() {

		System.out.println("complate method called..");
		
		
	}

	public void gst() {
		
		System.out.println("gst called..");
		
	}
	
	public static void main(String[] args) {
		
		
		RERA r = new Builder();
		r.complate();
		AUDA a = new Builder();
		a.complate();
		a.gst();
		
	}

}
