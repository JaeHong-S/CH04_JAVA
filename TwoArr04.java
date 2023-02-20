package ch04;

public class TwoArr04 {
	public static void main(String[] args) {
		int[][] k11 = {{23, 56}, {34, 78, 45}, {23, 99, 67, 34}, {27, 66}}; //행별로 갯수가 다른다 --> 가변배열
		for(int[] k1 : k11) {
			for(int k : k1) {
				System.out.print(k + "\t");
			}
			System.out.println();
		}
	}
}
