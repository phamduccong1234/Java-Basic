package homeworkjava;

import java.util.Scanner;

public class Switch_Ex1 {
	private static final Scanner sc = new Scanner(System.in);

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

}
