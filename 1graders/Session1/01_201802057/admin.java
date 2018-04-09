package admin;
import java.util.Scanner;

public class admin {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int second,Ahour,Amin,Asec;
		
		System.out.println("초를 입력하시오.");
		second= input.nextInt();
		
		Ahour=second/3600;
		Amin=second/60;
		Asec=second/1;
		
		System.out.println(Ahour);
		System.out.println(Amin);
		System.out.println(Asec);

	}

}