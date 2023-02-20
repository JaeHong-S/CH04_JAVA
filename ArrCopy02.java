package ch04;

public class ArrCopy02 {
	public static void main(String[] args) {
		int[] arr1 = {34, 56, 67, 88, 92};
		int[] arr2 = new int[10];
		
//		                 원본  시작  목적  시작  갯수         시작--> 인덱스 넘버
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); //주소 복사 x, 값을 복사
		
		for(int i : arr1) {
			System.out.print(i + "\t");
			
		}
		System.out.println();
		
		for(int i : arr2) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		int[] arr3 = new int[10];
		System.arraycopy(arr1, 0, arr3, 3, arr1.length);

		for(int i : arr3) {
			System.out.print(i + "\t");
		}
		
System.out.println();
		
		int[] arr4 = new int[10];
		System.arraycopy(arr1, 1, arr4, 3, arr1.length - 1 ); // 갯수 -1 안해주면 오류남

		for(int i : arr4) {
			System.out.print(i + "\t");
		}
	}
}
