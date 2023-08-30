package homeworkjava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//doEx3();
//		Switch_Ex1.doSwitch();
//		System.out.println(Switch_Ex2.getLocator("id", "password"));
//		Loops_Ex2.sumAndAverage();
//		Loops_Ex3.sumAndAverageEx3(); 
//		Loops_Ex4.sumAndAverageEx4();
//		Loops_Ex5.sumAndAverageEx5();
//		Loops_Ex6.sumOfTheSquares();
		Loops_Ex7.harmonicSum();
	}

	public static void doEx3() {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		while (num != -1) {
			System.out.print("Enter a positive integer or -1 to exit: ");
			num = sc.nextInt();

			if (MagicSum_Method_Ex3.checkNumber(num) == true) {
				sum += num;
			} 
			
			if (num == -1) {
				break;
			}
		}
		System.out.println("The magic sum is: " + sum);
	}
	
	

}
