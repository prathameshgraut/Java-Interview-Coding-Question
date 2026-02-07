package String_Program;

public class Number_ConvertInto_Word {

	static void print() {
		int num = 712;
		
		String word[]= {
			"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","nine"	
		};
		
		String str =String.valueOf(num);
		for(int i=0;i<str.length();i++) {
			int Digit=str.charAt(i)-'0';
			System.out.print(word[Digit]+" ");
		}
	}
	
	public static void main(String[] args) {
		print();
	}

}
