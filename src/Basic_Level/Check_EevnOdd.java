package Basic_Level;

public class Check_EevnOdd {
	public void print() {
		System.out.println("Using Hard Coded Data....");
		int num=10;
		if(num%2==0)
			System.out.println("This Is Even Number :"+num);
		else
			System.out.println("This is Odd Number  :"+num);
	}

	public static void main(String[] args) {
		Check_EevnOdd ceo = new Check_EevnOdd();
		ceo.print();
	}
}
