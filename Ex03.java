package ch04;

public class Ex03 {
	public static void main(String[] args) {
		//거스흠돈 372000을 50000, 10000, 5000, 1000 지폐로 줄때 몇 장 씩 줘야하나
		
		int Money = 372000;
		
		int[] Change = {50000, 10000, 5000, 1000};
		int[] ChangeZang = new int[Change.length];
		
		for(int i = 0; i < Change.length  ; i++) {
			ChangeZang[i] = Money / Change[i];
			Money = Money - (ChangeZang[i]*Change[i]);
			
		}
		for(int k : ChangeZang) {
			System.out.print(k + "\t");
		}
	}

}
