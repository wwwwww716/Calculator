import java.util.Scanner;

public class Input {
    public static int getFirstValue (Scanner scanner) {
        System.out.println("첫번째 숫자를 입력해주세요");
        int first = scanner.nextInt();
        System.out.println("첫번째 숫자 : " + first);
        return first;
    }
    public static int getSecondValue (Scanner scanner) {
        System.out.println("두번째 숫자를 입력해주세요");
        int second = scanner.nextInt();
        System.out.println("두번째 숫자 : " + second);
        return second;
    }
    public static String getSymbol (Scanner scanner) {
        System.out.println("기호를 입력해주세요");
        String symbol = scanner.next();
        System.out.println("기호 : " + symbol);
        return symbol;
    }
}
