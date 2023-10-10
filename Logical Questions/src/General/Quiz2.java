package General;

public class Quiz2 {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		//calling the method
		printValues(x++, --y); // x=5,y=9
	}

	
	public static void printValues(int x, int y) {

		System.out.println("x = " + x++);
		System.out.println("y = " + y--);

	}
}
