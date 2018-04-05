package cp_hw01;

import java.util.Scanner;


public class cp_hw01 {
	public static void main(String args[]) {
		
		int seconds; //초
		int minutes; //분
		int hours; //시간
		int time; //처음 입력 받은 초

		Scanner sc = new Scanner(System.in);
	
		System.out.print("변환할 초 입력 : ");
		time = sc.nextInt();
		
		hours = time/3600; //1시간은 3600초
		minutes = (time - 3600*hours)/60; //1분은 60초
//		seconds = time - 3600*hours - 60*minutes;
		seconds = time%60; //60으로 나눴을 때 나머지

		
		System.out.print(time+"초는 "+hours+"시간 "+minutes+"분 "+seconds+"초 입니다.");
	}
}

