package ch04;

public class Arr09 {
	public static void main(String[] args) {
		int[] a = {85, 90, 75, 100, 95};
		int sum = 0;
		for(int i : a) {
			sum += i;
		}
		System.out.println(sum);
		System.out.println(sum / a.length);
	}

}
