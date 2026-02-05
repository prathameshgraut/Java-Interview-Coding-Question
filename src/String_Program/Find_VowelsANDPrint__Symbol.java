package String_Program;

public class Find_VowelsANDPrint__Symbol {
	
	public void Print() {
		String str="Stranger";
		String res="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				res=res+"@";
			}else {
				res=res+ch;
			}
		}
		System.out.println("Using Symbol In Every Vowel's :"+res);
	}
	
public static void main(String[] args) {
	Find_VowelsANDPrint__Symbol fvs= new Find_VowelsANDPrint__Symbol();
	
	fvs.Print();
}
}
