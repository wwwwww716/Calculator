import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 값 입력");
        int first = scanner.nextInt();
        System.out.println(first);

        int result = 0;

        while(true) {

            System.out.println("사칙연산 기호 입력");
            String str = scanner.next();
            System.out.println(str);

            if (str.equals("quit")) {
                System.out.println("계산기를 종료합니다");
                break;
            }

            System.out.println("두번째 값 입력");
            int second = scanner.nextInt();
            System.out.println(second);

            if (str.equals("+")) {
                first = first + second;
                System.out.println(first);
            } else if (str.equals("-")) {
                first = first - second;
                System.out.println(first);
            } else if (str.equals("*")) {
                first = first * second;
                System.out.println(first);
            } else if (str.equals("/")) {
                first = first / second;
                System.out.println(first);
            } else {
                System.out.println("잘못된 기호를 입력하셨습니다.");
            }

        }


    }
}