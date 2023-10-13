package General;

public class Quiz6 {
	public static void main(String[] args) {
		String str = "JavaQuiz";
		int length = str.length();

		int result = length > 5 ? length - 5 : length + 5;

		System.out.println(result);
		
		//ans=3 because length of string is > 5 thats why 1st condition will be evaluatd(length - 5)
	}
}
