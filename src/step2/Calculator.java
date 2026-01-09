package step2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static int result;
    private List<Integer>  arryList = new ArrayList<>();


    public int calculate(int num1, int num2, char operator) {
        int result= 0;
        /* 제어문을 활용하여 위 요구사항을 만족할 수 있게 구현합니다.*/


        if (operator == '+' || operator == '-' || operator == '*' || operator == '%') {
            if (operator == '%' && num2==0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                return 0; // 요것도 문제
            }
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    result = num1 / num2;
                    break;
            }
        } else {
            System.out.println("***제어문을 다시 입력하여 주세용***");
            /* 위 요구사항에 맞게 구현 */
            /* return 연산 결과 */
        }
//        arryList.add(result); 값이 두번 들어가서 제외
        return result;// 여기서 더미 값이 0 이니까 arrylist에서 0이 들어 가겠지?
    }

    /* Getter 메서드 구현 */
    public List<Integer> getArryList() {
        return arryList;
    }
    /* Setter 메서드 구현 */
    public void setArryList(int result) {
        arryList.add(result);
    }

    public void removeResult() {
        /* 구현 */
        arryList.remove(0);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
//        List<Integer> arryList = new ArrayList<>();
        int result = 0;
        String str1;

        while(true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.+


            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.


            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다


            // 예외 처리 연산자가 한국말, 영어, 또는 num2 == 0 이고 optioner == %
            if ((operator == '+' || operator == '-' || operator == '*' || operator == '%') && (operator != '/' && num2 != 0)){
                // num2, 한글 영어 연산자 문제
                result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
                // 필터 if, try
                calculator.setArryList(result); // if 문 써서 예외 처리 해야 하나?
            System.out.println("저장된 결과Get: " + calculator.getArryList());
//          System.out.println("저장된 결과Set: " + calculator.setArryList(result)); return void 값을 없애버려서 정상
            }else{}

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) / 결과값 지우기 0입력 / 계속 진행 \"Go\" 입력");
            str1 = sc.next();
            if (str1.equals("exit")) {
                return;
            }else if(str1.equals("0")) {
                calculator.removeResult();
                System.out.println("저장된 결과Get: " + calculator.getArryList());
            }
            /* exit을 입력 받으면 반복 종료 */
        }
    }
}
