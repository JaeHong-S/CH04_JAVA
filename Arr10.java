package ch04;

public class Arr10 {
	public static void main(String[] args) {
//		76,45,34,89,100,50,90,92 합계와 평균
		int[] a = { 76,45,34,89,100,50,90,92};
		int sum = 0, max = a[0], min =a[0];
		
		for(int i = 0;i < a.length; i++) {
			sum += a[i];
			if(max < a[i]) max = a[i];
			if(min > a[i]) min = a[i];
		}
		System.out.println(sum);
		System.out.println(sum/a.length);
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		
		System.out.println("==================");
		int[] score =  {76,45,34,89,100,50,90,92};
		
		int sum2 = 0, max2 = score[0], min2 = score[0];
		
		for(int i : score) {
			sum2 += i;
			if(max2 < i)max2 = i;
			if(min2 > i)min2 = i;
		}
		System.out.println(sum2);
		System.out.println(sum2/score.length);
		System.out.println("최댓값 : " + max2);
		System.out.println("최솟값 : " + min2);
		
	}

}
