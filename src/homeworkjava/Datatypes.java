package homeworkjava;

import java.util.Scanner;

public class Datatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  // Tạo biến sc để nhập dữ liệu từ bàn phím
        int s = sc.nextInt(); // Nhập dữ liệu từ bàn phím kiểu int và gán vào biến s
        // String t = sc.nextLine(); // Nhập dữ liệu từ bàn phím kiểu string và gán vào biến t

        for(int i=0;i<s;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                //if(x>=-9223372036854775808 && x<=9223372036854775807)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
	}

}
