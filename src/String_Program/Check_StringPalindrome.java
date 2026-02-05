package String_Program;

public class Check_StringPalindrome {

	private void Show() {
		String str="madam";
		String Stored=str;
		String res="";
		for(int i=str.length()-1;i>=0;i--) {
			res=res+str.charAt(i);
		}
		if(Stored.equals(res)) {
			System.out.println("String Palindrome");
		}else {
			System.out.println("String Not Palindrome");
		}
	}
	
	public static void main(String[] args) {
		Check_StringPalindrome CSP = new Check_StringPalindrome();
		
		CSP.Show();
	}

}
