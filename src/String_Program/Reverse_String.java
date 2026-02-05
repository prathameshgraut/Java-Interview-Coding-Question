package String_Program;

public class Reverse_String {
	static void Print() {
		String str = "Hello_Java_Developer";
		System.out.print("This is Original String Print :" + str + "\n\nThis is Reverse String :");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		Print();
	}
}
