package Basic_Level;

public class MultipleInheritance3 implements MultipleInheritance, MultipleInheritance2 {

	@Override
	public void Dog() {
		System.out.println("\nThis Is MultipleInheritance2 Method");
        System.out.println("I'm Animanl.......");
	}

	@Override
	public void car() {
		System.out.println("\nThis is MultipleInheritance Method");
        System.out.println("I'm Vehical To Use Of Tarvelling......");
	}
	
	public static void main(String[] args) {
		System.out.println("Handle Multiple Inheritance Using Interface");
		
		MultipleInheritance3 m3 = new MultipleInheritance3();
		m3.car();
		m3.Dog();
		
	}
}
