package test.org;

public class Sample extends parent {
	
	public Sample() {
		this(10);
		System.out.println("Default Constructor");
		
	}
	
	public Sample(int a) {
		this("");
        System.out.println("int para Constructor");

	}
	
	public Sample(String s) {
		super();
		System.out.println("String para Constructor");

	}
	
	
public static void main(String[] args) {
		
		Sample s = new Sample();
	
		
	}
	

}
