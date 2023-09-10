package homeworkjava;

import java.util.Scanner;

import org.openqa.selenium.By;

public class Homework_JavaBasic {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static void doLoopEx1() {
		int a[] = new int[5];
		a[0] = 1;
		a[1] = 3;
		a[2] = 5;
		a[3] = 8;
		a[4] = 9;
		System.out.println("Mảng a: ");
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			System.out.println("Phần tử " + (i + 1) + " là: " + a[i]);
		}
	}
	
	public static void sumAndAverage() {
		int sum = 0;
		for(int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println("Sum: " + sum);
		float avg = (float) sum/100;
		System.out.println("Average: " + avg);
	}
	
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
	
	public static void sumAndAverageEx5() {
		int sum = 0;
		int count = 0;
		for(int i = 1; i <= 100; i++) {
			if(i %7 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("Sum: " + sum);
		double avg = (double) sum / (double) count;
		System.out.println("Average: " + Math.round(avg));
	}
	
	public static void sumOfTheSquares() {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i * i;
		}
		System.out.println("Sum of the squares: " + sum);
	}
	
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
	
	public static boolean checkNumber(int number) {
		boolean result = true;
		String numberString = String.valueOf(number);
		for(int i = 0; i < numberString.length(); i++) {
			if(numberString.charAt(i) == '8') {
				result = true;
			} else if (numberString.charAt(i) == '-'){
				result = false;
			} else {
				result = false;
			}
		}
		
		return result;
	}
	
	public static void doIf() {
		int n = sc.nextInt();

		if (n == 2) {
			System.out.println("Thứ Hai");
		} else if (n == 3) {
			System.out.println("Thứ Ba");
		} else if (n == 4) {
			System.out.println("Thứ Tw");
		} else if (n == 5) {
			System.out.println("Thứ Năm");
		} else if (n == 6) {
			System.out.println("Thứ Sáu");
		} else if (n == 7) {
			System.out.println("Thứ Bảy");
		} else if (n == 8) {
			System.out.println("Chủ Nhật");
		} else {
			System.out.println("Không tồn tại thứ " + n);
		}
	}
	
	public static void doSwitch() {
		int n = sc.nextInt();
		switch (n) {
		case 2:
			System.out.println("Thứ " + n);
			break;
		case 3:
			System.out.println("Thứ " + n);
			break;
		case 4:
			System.out.println("Thứ " + n);
			break;
		case 5:
			System.out.println("Thứ" + n);
			break;
		case 6:
			System.out.println("Thứ " + n);
			break;
		case 7:
			System.out.println("Thứ " + n);
			break;
		case 8:
			System.out.println("Chủ Nhật");
			break;
		default:
			System.out.println("Nhập lại n: ");
			break;
		}
	}
	
	public static By getLocator(String locatorType, String locatorValue) {
		By result = null;
		switch (locatorType) {
		case "id": {
			result = By.id(locatorValue);
			break;
		}
		case "name":{
			result = By.name(locatorValue);
			break;
		}
		case "linkText":{
			result = By.linkText(locatorValue);
			break;
		}
		case "cssSelector":{
			result = By.cssSelector(locatorValue);
			break;
		}
		case "partialLinkText":{
			result = By.partialLinkText(locatorValue);
			break;
		}
		case "tagName":{
			result = By.tagName(locatorValue);
			break;
		}
		case "xpath":{
			result = By.xpath(locatorValue);
			break;
		}
		default:
			System.out.println("Locator is invalid");
		}

		return result;
	}
	
	public static void printArray(int[] a) {
		if(a.length > 0) {
			System.out.println("{");
			for(int i = 0; i < a.length; i++) {
				System.out.println(a[i] + ", ");
			}
			System.out.println("}");
		}else {
			System.out.println("Khong co phan tu nao");
		}
	}

}
