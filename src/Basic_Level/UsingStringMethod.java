package Basic_Level;


/*Using == & .equals() Method*/
public class UsingStringMethod {
	
	/*== Operator Check Same References Of Content.......And Print Output*/
	static void print() {
		System.out.println("Using == Operator...,");
		System.out.println("Check Same References Value,");
		String str="Prathamesh",str2="Prathamesh";
		if(str==str2)
			System.out.println("Same References...✅");
		else
			System.out.println("Not Same References...❎");
		
		
		/*== Operator Check Not Same References Of Content*/
		System.out.println("\nCheck Not Same References Value,");
		String etr="  Prathamesh",etr2="Prathamesh";
		if(etr==etr2)
			System.out.println("Same References...✅");
		else
			System.out.println("Not Same References...❎");
	}
	
	
	/*.equals() Method & Check Same Content Of Value.......And Print Output*/
	static void show() {
		System.out.println("\n\nUsing .equals() Method..,");
		System.out.println("Check Same Content Of Value,");
		String str="Prathamesh",str2="Prathamesh";
		if(str==str2)
			System.out.println("Same Content...✅");
		else
			System.out.println("Not Same Content...❎");
		
		
		/*.equals() Method Check Not Same Content Of Value*/
		System.out.println("\nCheck Not Same Content Of Value,");
		String etr="Prathamesh",etr2="Prathameshh";
		if(etr==etr2)
			System.out.println("Same Content...✅");
		else
			System.out.println("Not Same Content...❎");
	}
	

	
	public static void main(String[] args) {
		print();
		System.out.println("--------------------------------------------------------------------");
		show();
	}

}
