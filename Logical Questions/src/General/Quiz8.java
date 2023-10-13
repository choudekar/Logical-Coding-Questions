package General;

public class Quiz8 {
	public static void main(String[] args) {
		// row column
		/*
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			sum += matrix[i][i];
			/*
			 * [1][1] = 1 [2][2] = 5 [3][3]=9
			 * 1+5+9=15
			 */
		}
		System.out.println(sum);
	}
}
