package homeworkjava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		doEx3();
	}

	public static void doEx3() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while (num != -1) {
			System.out.print("Enter a positive integer or -1 to exit: ");
			num = sc.nextInt();

			if (Homework_JavaBasic.checkNumber(num) == true) {
				sum += num;
			} 
			
			if (num == -1) {
				break;
			}
		}
		System.out.println("The magic sum is: " + sum);
	}
	
	

}
