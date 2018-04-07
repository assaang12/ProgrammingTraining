package Practice02;

import java.util.Scanner;

public class Practice02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원의 반지름을 입력하시오: ");
		double r=sc.nextDouble();
		//pi*r*r
		System.out.println(r*r*Math.PI);
	}

}
