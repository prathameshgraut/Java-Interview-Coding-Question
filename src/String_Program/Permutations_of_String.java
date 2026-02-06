package String_Program;

public class Permutations_of_String {
	
	static void print() {
		String str="abc";
		
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				for(int k=0;k<str.length();k++) {
					if(str.charAt(i)!=str.charAt(j) && str.charAt(j)!=str.charAt(k) && str.charAt(k)!=str.charAt(i)) {
						System.out.println(""+str.charAt(i)+str.charAt(j)+str.charAt(k));
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		print();
	}
}
