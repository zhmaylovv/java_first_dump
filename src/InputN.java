
public class InputN {
    public static void main(String[] args) {

        int num = 25;
        int i;
        boolean isPrime = true;
        for (i = 2; i < num; i++){
            if (num %i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
        System.out.println(i);
    }
}



/*public class InputN {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++){
            System.out.println(i);
            i++;
        }

    }
    }


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
*/