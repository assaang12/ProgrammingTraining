package adminn;

import java.util.Scanner;

public class adming {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int second;
	int minute;
	int hour;
	int cho;
	
	System.out.print("초는?: ");
	cho =sc.nextInt();
	
	hour = cho/3600;
	minute = cho/60;
	second = cho%60;
	
	System.out.print(cho+"초는 "+hour+"시간 "+minute+"분 "+second+"초 입니다.");
	
	}

}
