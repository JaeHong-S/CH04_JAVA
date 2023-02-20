package ch04;

public class TwoArr03 {
	public static void main(String[] args) {
		int[][] score = {{88, 99, 88, 77}, {56, 88, 76, 92}, {92, 87, 90, 82}};
		int sum = 0;
		System.out.println("국어\t영어\t수학\t과학");
		for(int i  = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.print("합계 : " + sum + "\t");
			System.out.println("평균 : " + sum/score[i].length);
			sum = 0;
		}
	}
}
