package ch04;

public class Arr01 {
	public static void main(String[] args) {
//		같은 데이터형의 여러건을 저장할 때
//		int kim = 70, park = 80, choi - 90;
//		int[] score = {70, 80, 90}
		int k1 = 7; //기본형 변순은 초기화를 하지 않으면 사용할 수 없다.
//		but, 참조형은 생성하면 자동 초기화가 일어난다. 
//		정수형은 '0', 실수형은 '0.0', 문자형은 'null'로 생성과 동시에 초기화 자동 초기화 됨
		int[] i1; //선언
		i1 = new int[5]; //생성
		int[] i2 = new int[5]; //선언과 생성
		System.out.println(k1);
		System.out.println(i1[1]);// 자동초기화 값
		System.out.println(i2[0]);// 자동초기화 값
		float[] f1 = new float[6];
		System.out.println(f1[4]);// 자동초기화 값
	}

}
