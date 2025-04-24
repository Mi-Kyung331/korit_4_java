package ch08_methods;

import java.util.Scanner;

/*
    bmi 계산기 method를 정의하고 실행시킬겁니다.
    메서드명 calculateBmi()
    return type : void
    매개변수 유무 : 없음
 */
public class Method04 {
    public static void calculateBmi() {
        Scanner scanner = new Scanner(System.in);

        double height = 0;
        double weight = 0;
        double bmi;
        String result = "";

        System.out.print("키(cm)를 입력하세요 >>> ");
        height = scanner.nextDouble()/100;

        System.out.print("몸무게(kg)를 입력하세요 >>> ");
        weight = scanner.nextDouble();

        bmi = weight / (height * height);


        if (bmi < 18.5) {
            result = "저체중";
        } else if (bmi < 23) {
            result = "정상";
        } else if (bmi < 25) {
            result = "과체중";
        } else {
            result = "비만";
        }

        System.out.println("당신의 BMI 지수는 " + bmi + "고, " + result + "입니다." );


    }

    public static void main(String[] args) {

        calculateBmi();

        /*
            실행예
            키(cm)를 입력하세요 >>> 172.5
            몸무게(kg)를 입력하세요 >>> 68.7
            당신의 BMI 지수는 23.08고, 과체중입니다.
         */
    }
}
