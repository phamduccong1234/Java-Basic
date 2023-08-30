package homeworkjava;

import java.util.Arrays;

public class Loops_Ex1 {

	public static void main(String[] args) {
		// 1. Cho mảng a lưu giá trị dãy số a = {1,3,5,8,9}. Viết hàm in ra giá trị của
		// mảng.
		doLoopEx1();
	}

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

	public static void doLoop() {
		int[] a = { 1, 3, 5, 8, 9 };

		System.out.println("Mảng a: ");
		for (int num : a) {
			System.out.println(num + " ");
		}
	}

}
