package Pattern_Program;

public class Number_Pyramid {

	public static void main(String[] args) {
		/*Print Star Pyramid*/
		for(int i=1;i<=5;i++) {
			int num=1;
			for(int j=1;j<=i;j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}

}
