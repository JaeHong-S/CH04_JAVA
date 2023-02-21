package ch04;

public class Ex05 {
	public static void main(String[] args) {
//		행별로 최대, 최소, 합계 출력하고 마지막 전체 합계, 최대, 최소
		int[][] score = {{67, 78, 98}, {78, 98, 65}, {78, 56, 90}};
		int sum = 0, tot = 0, max = 0, min = 100, tmax = 0, tmin = 100;
		
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				if(max < score[i][j]) max = score[i][j];
				if(min > score[i][j]) min = score[i][j];
				sum += score[i][j];
				
			}
			System.out.print(i + "행 합계 : " + sum + " 최대값 : " + max + "  최소값 : " + min );
			System.out.println();
			if(tmax < max ) tmax = max;
			if(tmin > min) tmin = min;
			tot += sum;
			max = 0;
			sum = 0;
			min = 100;
			
			
			
		}
		System.out.print( "전체 행 합계 : " + tot + " 최대값 : " + tmax + "  최소값 : " +tmin );
	}

}
