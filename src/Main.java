import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫번째 값 입력");
        int first = scanner.nextInt();
        System.out.println(first);

        System.out.println("두번째 값 입력");
        int second = scanner.nextInt();
        System.out.println(second);
        System.out.println();

        System.out.println("사칙연산 기호 입력");
        String str = scanner.next();
        System.out.println(str);
        // next 대신 nextLine 사용 시 자동으로 값이 입력됨

        if (str.equals("+")) {
            System.out.println(first + second);
        } else if (str.equals("-")) {
            System.out.println(first - second);
        } else if (str.equals("*")) {
            System.out.println(first * second);
        } else if (str.equals("/")) {
            System.out.println(first / second);
        } else {
            System.out.println("잘못된 기호를 입력하셨습니다.");
        }

    }
}