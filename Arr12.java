package ch04;

public class Arr12 {
	public static void main(String[] args) {
		int[] score =  {76,45,34,89,100,50,90,92};
		int tmp = 0;
//		 버블정렬
		for(int i = 0; i < score.length - 1; i++) {
			for(int j = 0; j < score.length - 1; j ++) {
				if(score[j] > score[j+1])
				{
					tmp = score[j];
					score[j] = score[j+1];
					score[j+1] = tmp;
				}
			}
		}
		for(int k : score) {
			System.out.print(k + " ");
		}

		
	}
	

}
