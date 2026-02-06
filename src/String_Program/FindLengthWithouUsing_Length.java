package String_Program;

public class FindLengthWithouUsing_Length {
	public static void main(String[] args) {
		String str = "Prathamesh";
		
		int count = 0;

		try {
			while(true) {
				str.charAt(count);
				count++;
			}
		}catch(Exception e) {
			System.out.println("Length Of String :"+count);
		}
	}
}
