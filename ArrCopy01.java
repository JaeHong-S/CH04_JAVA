package ch04;

public class ArrCopy01 {
	public static void main(String[] args) {
		int[] arr1 = {34, 77, 55};
		int[] arr2 = arr1; // 주소 복사
//		arr1[1] = 150; 주소를 복사하였기 때문에, 후에 값을 변경하더라도 적용이 된다.
		
		int[] arr3 = new int[arr1.length];
		
		for(int i = 0; i < arr1.length; i++) {//데이터를 하나씩 복사혀 전달
			arr3[i] = arr1[i];
		}
		arr1[1] = 150;
		for(int a1 : arr1) {
			System.out.print(a1 + "\t");
		}
		System.out.println();
		System.out.println();
		for(int a2 : arr2) {
			System.out.print(a2 + "\t");
		}
		System.out.println();
		System.out.println();
		for(int a3 : arr3) {
			System.out.print(a3 + "\t");
		}
	}

}
