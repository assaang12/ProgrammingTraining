package admin;

public class admin1 {
/* 앞의 두 수의 합이 바로 뒤의 수가 되는 수열 */
	
	 public static void main(String args[]) {
	   int a = 0, b = 1, c = 0;
	  for (int i = 0; i < 10; i++) { // 10번 반복
	     a = b;
	     b = c;
      c = a + b;
	      System.out.print(" " + c);
	    }
    }
}