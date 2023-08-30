package homeworkjava;

public class Loops_Ex3 {
	
	public static void sumAndAverageEx3() {
		int sum = 0;
		int count = 0;
		for(int i = 111; i <= 8899; i++) {
			sum += i;
			count++;
		}
		System.out.println("Sum: " + sum);
		double avg = (double) sum / (double) count;
		System.out.println("Average: " + Math.round(avg));
	}

}
