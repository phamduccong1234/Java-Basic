package homeworkjava;

public class Loops_Ex4 {
	
	public static void sumAndAverageEx4() {
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i %2 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("Sum: " + sum);
		double avg = (double) sum / (double) count;
		System.out.println("Average: " + Math.round(avg));
	}

}
