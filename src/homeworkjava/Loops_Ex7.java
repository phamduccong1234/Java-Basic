package homeworkjava;

public class Loops_Ex7 {
	
	public static void harmonicSum() {
		double sumLeftToRight = 0;
		double sumRightToLeft = 0;
		for(int i = 1; i <= 50000; i++) {
			sumLeftToRight += 1 / i;
		}
		System.out.println("Sum left to right: " + Math.round(sumLeftToRight));
		
		for(int i = 50000; i > 0; i--) {
			sumRightToLeft += 1 / i;
		}
		System.out.println("Sum right to left: " + Math.round(sumRightToLeft));
	}
}
