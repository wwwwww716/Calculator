import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = getFirstValue(scanner);
        int result = first;

        while(true) {
            String symbol = getSymbol(scanner);

            if (symbol.equals("quit")) {
                System.out.println(result);
                System.out.println("계산기를 종료합니다");
                break;
            }

            int second = getSecondValue(scanner);

            result = calculate(result, symbol, second);

            print(result);
        }
     }
     public static int getFirstValue(Scanner scanner) {
         System.out.println("숫자를 입력해주세요");
         int first = scanner.nextInt();
         System.out.println("첫번째 숫자는 : " + first);
         return first;
     }
     public static int getSecondValue(Scanner scanner) {
        System.out.println("숫자를 입력해주세요");
        int second = scanner.nextInt();
        System.out.println("두번째 숫자는 : " + second);
        return second;
    }
    public static String getSymbol(Scanner scanner) {
        System.out.println("기호를 입력해주세요");
        String symbol = scanner.next();
        System.out.println("기호 : " + symbol);
        return symbol;
    }

    public static int calculate (int first, String symbol, int second) {
        int result = 0;
        if (symbol.equals("+")) {
            result = first + second;
        } else if (symbol.equals("-")) {
            result = first - second;
        } else if (symbol.equals("*")) {
            result = first * second;
        } else if (symbol.equals("/")) {
            result = first / second;
        } else {
            System.out.println("잘못된 기호를 입력했습니다");
        }
        return result;
    }

    public static void print(int result) {
        System.out.println("결과는 : " + result);
    }
}