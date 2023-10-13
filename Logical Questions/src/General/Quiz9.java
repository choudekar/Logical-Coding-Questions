package General;

public class Quiz9 {

	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 5; i++) {
			num += i;
			if (num > 5)
				break;
		}
		System.out.println(num);
	}
}
