package ch04;

import java.util.Scanner;

public class Ex04 {
//	Scanner를 이용하여 4자리 정수를 받고 year
//	윤년(400으로 나눠서 딱 떨어지면, 4로 나누어서 떨어지고, 100으로 나누어서 안 떨어지면) 또는 평년 출력 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = 0;
		System.out.println("몇 년");
		year = sc.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("윤년");
		}
		else System.out.println("평년");
		
		sc.close();
		
	}
}
