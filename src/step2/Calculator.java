package step2;

import java.util.Scanner;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */

    public int calculate(int num1, int num2, int result, String str) {
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("%")) {
            if (num2 == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            }
            switch (str) {
                case "+":
                    result = num1 + num2;
                    break;

                case "-":
                    result = num1 - num2;
                    break;

                case "*":
                    result = num1 * num2;
                    break;

                case "%":
                    result = num1 % num2;
                    break;
            }
        } else {
            System.out.println("제어문을 다시 입력하여 주세용.");
            /* 위 요구사항에 맞게 구현 */
            /* return 연산 결과 */
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
