package General;

public class Quiz7 {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		String result = s1.concat(s2).substring(1, 6).toUpperCase();

		System.out.println(result);
	}
}
