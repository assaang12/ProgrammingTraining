import java.util.Scanner;

public class change_time {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("초를 입력하세요 : ");
			int sec = sc.nextInt();
			
		    int hour = sec/3600;
			int min = sec%3600/60;
			int seconds = sec%3600%60;
			System.out.println(hour+"시간 "+ min+"분 " +seconds+"초"+ "와 동일합니다.");
		
	}
	
}
