package Day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		inSinhVienKhoaNgoaiNgu();
	}
	
	public static void inSinhVienKhoaToan() {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVienKhoaToan> sinhVienKhoaToans = new ArrayList<SinhVienKhoaToan>();
		SinhVienKhoaToan svkt = new SinhVienKhoaToan();

		System.out.println("Input number of student: ");
		int num = sc.nextInt();
		int i = 0;

		while (i < num) {
			System.out.println("Input ID: ");
			svkt.id = sc.nextInt();
			System.out.println("Input name: ");
			sc.nextLine();
			svkt.name = sc.nextLine();
			System.out.println("Input DOB: ");
			svkt.DOB = sc.nextLine();
			System.out.println("Input Gender: ");
			svkt.gender = sc.nextLine();
			i++;
			sinhVienKhoaToans.add(svkt);
		}
		for (SinhVienKhoaToan sv : sinhVienKhoaToans) {
			sv.inThongTin();
		}
	}
	
	public static void inSinhVienKhoaNgoaiNgu() {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVienKhoaNgoaiNgu> sinhVienKhoaNgoaiNgus = new ArrayList<SinhVienKhoaNgoaiNgu>();
		SinhVienKhoaNgoaiNgu svknn = new SinhVienKhoaNgoaiNgu();

		System.out.println("Input number of student: ");
		int num = sc.nextInt();
		int i = 0;

		while (i < num) {
			System.out.println("Input ID: ");
			svknn.id = sc.nextInt();
			System.out.println("Input name: ");
			sc.nextLine();
			svknn.name = sc.nextLine();
			System.out.println("Input DOB: ");
			svknn.DOB = sc.nextLine();
			System.out.println("Input Gender: ");
			svknn.gender = sc.nextLine();
			System.out.println("Input Course: ");
			svknn.course = sc.nextLine();
			i++;
			sinhVienKhoaNgoaiNgus.add(svknn);
		}
		for (SinhVienKhoaNgoaiNgu sv : sinhVienKhoaNgoaiNgus) {
			sv.inThongTin();
		}
	}
}
