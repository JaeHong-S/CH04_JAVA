package ch04;

public class Arr11 {
	public static void main(String[] args) {
		int[] a = {76,45,34,89,100,50,90,92};
		int tmp = 0;
//		선택정렬
		for(int i = 0; i <a.length; i++) {
			for(int j = i+1; j < a.length ; j++) {
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		for(int k : a) {
			System.out.print(k +" ");
		}
	}
	
}
