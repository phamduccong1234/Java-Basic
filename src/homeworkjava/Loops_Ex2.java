package homeworkjava;

public class Loops_Ex2 {
	
	public static void sumAndAverage() {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
		float avg = (float) sum/100;
		System.out.println("Average: " + avg);
	}
}
