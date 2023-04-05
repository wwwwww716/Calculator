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

        System.out.println(first + second);
        System.out.println(first - second);
        System.out.println(first * second);
        System.out.println(first / second);

    }
}