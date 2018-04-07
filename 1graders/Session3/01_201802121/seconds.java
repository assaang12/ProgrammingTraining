package admin;

import java.util.Scanner;

public class seconds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int osec;
		int sec;
		int min;
		int hour;
		
		System.out.print("초를 입력하시오 : ");
		osec = sc.nextInt();
		
		hour = osec/3600;
		min = (osec%3600)/60;
		sec = osec - (hour * 3600) - (min * 60);
		
		System.out.print(hour + "시간 " + min + "분 " + sec + "초 ");
		
		
		
		
		

	}

}
