package ch04;

public class Arr08 {
	public static void main(String[] args) {
		String[] fruits = {"산딸기", "판딸기", "집딸기", "죽은딸기", "알카리딸기", "뱀딸기"};
		
			for(String fruit : fruits) {
				System.out.print(fruit + " ");
			}
			System.out.println("");
			
			for(int i = fruits.length - 1; i >= 0; i--) {
				System.out.print(fruits[i] + " ");
			}
	}

}
