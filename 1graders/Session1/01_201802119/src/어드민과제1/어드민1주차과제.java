package 어드민과제1;

import java.util.Scanner;

public class 어드민1주차과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("변환할 초 입력 : ");
		int tag;
		int min;
		int hour;
		int sec;
		
		tag = input.nextInt();
		hour = tag/3600;
		min = (tag%3600)/60;
		sec = tag - (hour*3600 + min*60);
		System.out.print(tag+"초는"+hour+"시간"+min+"분"+sec+"초입니다.");
		
		

	}

}
