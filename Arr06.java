package ch04;

public class Arr06 {
	public static void main(String[] args) {
		String[] snake = new String[] { "구렁이", "팔렁이", "칠렁이", "육렁이", "구렁삼", "구렁사"};
		for(String str: snake) {
			System.out.print(str + " ");
		}
		System.out.println("");
		
		for(int i = 0; i < snake.length; i++) {
			System.out.print(snake[i] + " ");
		}
		
	}

}
