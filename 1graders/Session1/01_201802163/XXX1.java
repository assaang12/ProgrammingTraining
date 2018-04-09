import java.util.Scanner;

public class XXX1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 초 입력 :");
		int sec = sc.nextInt();
		
		int hour = (int)sec/3600;
		int min = (int)(sec-3600*hour)/60;
		int rsec = sec-(hour*3600+min*60);
		
		System.out.println((int)sec/3600 + "시간" + (int)(sec-3600*hour)/60 + "분" + rsec + "초");
		
		
	}

}
