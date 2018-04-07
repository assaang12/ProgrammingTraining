import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하시오:");
		int sec = sc.nextInt();
		int result1 = sec/3600; 
		int result2 = (sec%3600)/60;
		int result3 = (sec%3600)%60;
		System.out.println(result1+"시간"+result2+"분"+result3+"초");
	
	}

}
