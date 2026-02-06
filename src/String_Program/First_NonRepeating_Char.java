package String_Program;

public class First_NonRepeating_Char {
	
	static void print(){
		String str="Maharashtra Maza";
		char res=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			int count=0;
			for(int j=0;j<str.length();j++) {
				if(ch==str.charAt(j)) {
					count++;
				}
			}if(count==1) {
				res=ch;
				break;
			}
		}if(res!=0) {
			System.out.println("Show First Non-Repeated Character :"+res);
		}
	}
	
	public static void main(String[] args) {
		print();
	}
}
