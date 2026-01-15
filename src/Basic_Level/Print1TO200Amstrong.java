package Basic_Level;

public class Print1TO200Amstrong {
	static void show() {
		
		for(int i=0;i<200;i++) {
			int num=i;
			int sum=num;
			int res=0,add;
			while(num>0) {
				add=num%10;
				res=res+add*add*add;
				num=num/10;
			}
			if(sum==res) {
				System.out.println(res);
			}
		}
	}
	
	public static void main(String[] args) {
		show();
	}

}
