package homeworkjava;

public class Loops_Ex6 {
	
	public static void sumOfTheSquares() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("Sum of the squares: " + sum);
	}

}
