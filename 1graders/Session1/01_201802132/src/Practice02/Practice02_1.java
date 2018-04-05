package Practice02;

import java.util.Scanner;

public class Practice02_1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double a;
	double b;
	double c;
	
	System.out.print("첫번쨰 수 입력: ");
	a=sc.nextDouble();
	System.out.print("두번쨰 수 입력: ");
	b=sc.nextDouble();
	System.out.print("세번째 수 입력: ");
	c=sc.nextDouble();
	
	double sum;
	sum=(a+b+c)/3;
	System.out.print("세 수의 평균값: "+sum);
	}
}
