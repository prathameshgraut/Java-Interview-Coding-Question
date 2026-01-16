package Basic_Level;

public class AnonymousClass {

	public void anonymous() {
		System.out.println("Hello");
	}
}

class Demo {
	public static void main(String[] args) {
		AnonymousClass an = new AnonymousClass() {
			public void anonymous() {
				System.out.println("This Is Anonymous Class Method....");
			}
		};
		an.anonymous();
	}
}
