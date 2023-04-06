import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Input.getFirstValue(scanner);
        int result = first;

        while (true) {
            String symbol = Input.getSymbol(scanner);
            if (symbol.equals("quit")) {
                System.out.println(result);
                System.out.println("계산기를 종료합니다");
            }

            int second = Input.getSecondValue(scanner);

            result = Calculator.calculate(result, symbol, second);

            System.out.println(result);
        }
    }
}