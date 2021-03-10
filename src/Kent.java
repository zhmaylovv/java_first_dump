/*
sber craft sbercraft
С целью выведения самой жизнеспособной расы ученые умы решили провести селекцию
на основе проверенного временем древнего теста ДНК (Драки с Непобедимыми Кентаврами).
Для этого сильнейшие представители каждой расы heroes в порядке очереди вступают
в бой с одним из n древних Кентавров. Каждый герой может продержаться в бою heroes[i] минут.
 Количество кентавров не уменьшается (не зря их прозвали Непобедимыми). Определите время, за которое все бои будут завершены.

На входе:

heroes - массив целых неотрицательных чисел. Каждое число обозначает время поединка героя в очереди  (всегда больше 0)
n - количество Кентавров (всегда больше 0)
На выходе: число (int) - время, за которое завершатся все поединки

Пример:
1. если кентавр один, то общее время равно сумме времени каждого участника

total_time([6, 2, 9], 1) --> 17
2.  кентавров два, поэтому первый и второй герои вступают в бой одновременно, затем, после второго, третий и четвертый сражаются по очереди со вторым кентавром

 total_time([11, 2, 3, 4], 2) --> 11
3. кентавров два, первый и второй герои одновременно вступают в бой, после первого героя третий будет биться с тем же кентавром

total_time([3, 5, 10], 2) --> 13
*/


import java.util.*;
public class Main {

    public static void main(String[] args){
      List<Integer> heroes = new ArrayList<Integer>();
      heroes.add(6);
      heroes.add(2);
      heroes.add(9);
      int n = 1;
      System.out.println(getTotalTime(heroes, n));
      }
/* Проверка времени
long start = System.currentTimeMillis();
      
      for (int i = 0; i<=1000000; i++){
      
      getTotalTime(heroes, n);
      }
      
      long timeWorkCode = System.currentTimeMillis() - start;
      System.out.println("Время выполнения миллиона операций: " + timeWorkCode + " миллисекунд");
      
      }
*/
    public static int sum (List<Integer> l){
        int s = 0;
        for (int i : l){
            s += i;
        }
        return s;
      }

    public static int getTotalTime(List<Integer> heroes, int n) {
        int timer = 0; // Add comment
        int c;
        while(sum(heroes) > 0){
            timer += 1;
            c = 0;
            for (int i = 0; i <= heroes.size()-1; i++){
              if (c + 1 > n)
                break;
              if (heroes.get(i) > 0){
                heroes.set(i, heroes.get(i)-1);
                c += 1;
              }
            }
        }
        return timer;
    }
}
