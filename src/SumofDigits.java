/*
Sum of Digits / Digital Root
https://www.codewars.com/kata/541c8630095125aba6000c00/
Given n, take the sum of the digits of n. If that value has more than one digit,
 continue reducing in this way until a single-digit number is produced.
  The input will be a non-negative integer.
Examples
    16  -->  1 + 6 = 7
   942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6

*/


public class SumofDigits{

    public static void main (String[] args) {

        System.out.println(digital_root(888));

    }
    public static int digital_root(int n) {
        int res = 0;
        String str = Integer.toString(n);
        do {
            res = 0;
            for (String s : str.split("")){
                res += Integer.parseInt(s);
            }
            str = Integer.toString(res);

            }
            while (str.length() > 1);


        return res;
    }

    public static int digital_rootWTF(int n) {
   return (n != 0 && n%9 == 0) ? 9 : n % 9;
 }

 public static int digital_rootNICE(int n) {
    while(n > 9){
      n = n/10 + n % 10;
      }
    return(n);
  }
}


