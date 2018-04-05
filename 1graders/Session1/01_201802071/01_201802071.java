import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int hour;
		int min;
		int sec;
		System.out.print("초를 입력하시오: ");
		sec = sc.nextInt();
			
		hour = (int) sec/3600;
		min = (int) (sec-3600*hour)/60;
			
		System.out.println(sec+"초는 "+ hour+"시간 "+min+"분 "+(sec-3600*hour-60*min)+"초입니다.");
					

	}

}
