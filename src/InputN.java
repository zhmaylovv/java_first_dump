import java.util.Scanner;

public class InputN {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int counter = 0;
    int result = 0;
    while (counter <= n) {
        result += counter++;
    }
    int calculatedResult = (n * (n + 1)) / 2;
    System.out.println(result == calculatedResult);

    }
}
