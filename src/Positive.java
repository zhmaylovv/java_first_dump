/*
Sum of positive
https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java

*/
import java.util.Arrays;
public class Positive{

  public static int sum(int[] arr){
    int sum = 0;
    for (int i = 0; i < arr.length; i++)
      if (arr[i] > 0){
        sum += arr[i];
      }
    return sum;
  }


  //public class Positivev2{
  //    public static int sum(int[] arr){
     //     return Arrays.stream(arr).filter(v -> v > 0).sum();
      //}
}
