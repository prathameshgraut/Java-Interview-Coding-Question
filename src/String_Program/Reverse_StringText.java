package String_Program;

public class Reverse_StringText {
	
	static void Print() {
		System.out.println("This is Way-1 To Write Reverse Text Format....!");
		
		String str="I Love Java Developing...";
		System.out.println("Show Actual String      :"+str);
		String stored[]=str.split(" ");
		
		System.out.print("Show Using Reverse Text :");
		for(int i=stored.length-1;i>=0;i--) {
			System.out.print(stored[i]+" ");
		}
	}
	
	static void print() {
		
		System.out.println("\n\nThis is Way-2 Write Code And Print Reverse Text Format....!");
		
		String str="Hello Java Developer";
		System.out.println("Show Actual String      :"+str);
		String stored[]=str.split(" ");
		
		StringBuffer sb = new StringBuffer();
		for(int i=stored.length-1;i>=0;i--) {
			sb=sb.append(stored[i]);
			sb.append(" ");
		}
		System.out.println("Show Using Reverse Text :"+sb);
	}
	
public static void main(String[] args) {
	Print();
	print();
}
}
