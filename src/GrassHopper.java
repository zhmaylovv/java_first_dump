/*
Grasshopper - Summation
https://www.codewars.com/kata/55d24f55d7dd296eb9000030/solutions/java
Write a program that finds the summation of every number from 1 to num.
The number will always be a positive integer greater than 0.
*/
public class GrassHopper {

    public static int summation(int n) {
      int sum = 0;
      for (int i = 0; i <= n; i++ )
          sum += i;
        return sum;
    }

    public static int summationv2(int n) {
      return  n*(n+1)/2;
    }

}
