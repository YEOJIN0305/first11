package poly.util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Date3_18_1 {
    //워크스페이스 => 작업공간
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // 스캐너 객체 사용을 위한 선언 초기화
        String name = "최여진";
        System.out.print("이름 입력 : ");
        String inputName = in.nextLine();
        if(name.equals(inputName)) {
            System.out.print("몇단 : ");
            int num = in.nextInt();
            int num2 = 0;
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
            System.out.printf("%d X %d = %d\n", num, ++num2, num * num2 );
        } else {
            System.out.println("로그인실패");
        }

    }
}
