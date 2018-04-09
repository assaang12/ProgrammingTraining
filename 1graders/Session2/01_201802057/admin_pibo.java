package admin;

public class admin_pibo {

	public static void main(String[] args) {
		int a0,a1,a2;
		a0=1;
		a1=1;
		System.out.println(a0);
		System.out.println(a1);
		
		for(int i = 0; i <= 10; i +=1 ) {
			a2=a0+a1;
			
			a0=a1;
			a1=a2;
			
			System.out.println(a2);
		}
		
	}

}
