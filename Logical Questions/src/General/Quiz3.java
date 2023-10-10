package General;

public class Quiz3 {
	public static void main(String[] args) {
		int x = 5;
		int result = 0;
		try {
			result = x / 0;

		} catch (ArithmeticException e) {
			result = 1;
		} finally {
			result += 2;
		}
		System.out.println(result);
	}
}
