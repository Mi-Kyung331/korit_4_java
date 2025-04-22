package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
            .next() : String 데이터를 받을 때 띄어쓰기를 인정하지 않음
            .nextLine() : String 데이터를 받을 때 띄어쓰기 인정하고 enter 키 기준으로 데이터가 입력됨

            실행 예
            이름을 입력하세요 >>> 여러분 이름
            나이를 입력하세요 >>> 여러분 나이
            주소를 입력하세요 >> 여러분 주소 (시 / 구 또는 도 / 시까지)

            안녕하세요, 제 이름은 여러분이름입니다. 여러분주소에 살고 있습니다.
            10년 후 나이는 여러분나이+10살입니다.
         */
        // Scanner 클래스 import
        // 변수 선언 및 입력
        // 프롬포트 입력

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 >>> ");
        String name1 = scanner.next();

        System.out.print("나이를 입력하세요 >>> ");
        int age1 = scanner.nextInt();
        int age10 = age1 + 10;

        scanner.nextLine();
        System.out.print("주소를 입력하세요 >>> ");
        String address1 = scanner.nextLine();

        System.out.println("안녕하세요, 제 이름은 " + name1 + "입니다." + address1 + "에 살고 있습니다.");
        System.out.println("10년 후 나이는" + age10 + "살입니다.");


//        String name2;
//        String address2;
//        int age2;
//        int age10;
//
//        System.out.print("이름을 입력하세요 >>> ");
//        name2 = scanner.next();
//        System.out.print("나이를 입력하세요 >>> ");
//        age2 = scanner.nextInt();
//        age10 = age2 + 10;
//        scanner.nextLine();
//        System.out.print("주소를 입력하세요 >>> ");
//        address2 = scanner.nextLine();
//
//        System.out.println("안녕하세요, 제 이름은 " + name2 + "입니다." + address2 + "에 살고 있습니다.");
//        System.out.println("10년 후 나이는" + age10 + "살입니다.");
    }
}
