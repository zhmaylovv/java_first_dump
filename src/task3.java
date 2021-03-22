package zhmaylo;
import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        double result = 0.0;
        String[] exp_list;
        String rawString = "";
        Scanner input = new Scanner(System.in);

         while (!rawString.equalsIgnoreCase("q")){
             System.out.println("Вычисление простых выражений. (\"q\" для выхода)");
             System.out.println("Введите выражение для вычисления:");
             rawString = input.nextLine();
             if (rawString.contains(" ")){
                 exp_list =  rawString.split(" ");
                 switch (exp_list[1]){
                     case "+": result = Double.parseDouble(exp_list[0]) + Double.parseDouble(exp_list[2]);
                         break;
                     case "-": result = Double.parseDouble(exp_list[0]) - Double.parseDouble(exp_list[2]);
                         break;
                     case "*": result = Double.parseDouble(exp_list[0]) * Double.parseDouble(exp_list[2]);
                         break;
                     case "/": result = Double.parseDouble(exp_list[0]) / Double.parseDouble(exp_list[2]);
                         break;
                     case "%": result = Double.parseDouble(exp_list[0]) % Double.parseDouble(exp_list[2]);
                         break;
                     default: result = 0.0;
                 }
             }else {
                 exp_list =  rawString.split("[*/%+-]");
                 if (rawString.contains("*")){
                     result = Double.parseDouble(exp_list[0]) * Double.parseDouble(exp_list[1]);
                 }else if (rawString.contains("/")){
                     result = Double.parseDouble(exp_list[0]) / Double.parseDouble(exp_list[1]);
                 }else if (rawString.contains("%")){
                     result = Double.parseDouble(exp_list[0]) % Double.parseDouble(exp_list[1]);
                 }else if (rawString.contains("+")){
                     result = Double.parseDouble(exp_list[0]) + Double.parseDouble(exp_list[1]);
                 }else if (rawString.contains("-")){
                     result = Double.parseDouble(exp_list[0]) - Double.parseDouble(exp_list[1]);
                 }


             }


            System.out.println("Результат: " + result + '\n');
        }
    }
}
