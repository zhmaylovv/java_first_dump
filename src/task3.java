package zhmaylo;
import java.util.*;

public class Task3 {

    public static void main(String[] args) {
        double result;
        String[] exp_list;
        String rawString;
        Scanner input = new Scanner(System.in);

        System.out.println("Calculate simple expressions \"a + b\" format (\"q\" for quit)");
        System.out.println("Enter an expression to calculate:");

        while (true){
            rawString = input.nextLine();
            if (rawString.equalsIgnoreCase("q")){
                break;
            }
            try {
                exp_list =  rawString.split(" ");
                if (exp_list[1].equals("*")){
                    result = Double.parseDouble(exp_list[0]) * Double.parseDouble(exp_list[2]);
                }else if (exp_list[1].equals("/")){
                    result = Double.parseDouble(exp_list[0]) / Double.parseDouble(exp_list[2]);
                }else if (exp_list[1].equals("%")){
                    result = Double.parseDouble(exp_list[0]) % Double.parseDouble(exp_list[2]);
                }else if (exp_list[1].equals("+")){
                    result = Double.parseDouble(exp_list[0]) + Double.parseDouble(exp_list[2]);
                }else if (exp_list[1].equals("-")){
                    result = Double.parseDouble(exp_list[0]) - Double.parseDouble(exp_list[2]);
                }else {
                    throw new IllegalArgumentException();
                }

            } catch(Exception e) {
                System.out.println("Something went wrong, check the correctness" +
                        " of the input: a + b separated by a spaces");
                result = 0.0;
            }
            System.out.println("Result: " + result + "\n");
            System.out.println("Enter next expression to calculate:");
        }
    }
}
