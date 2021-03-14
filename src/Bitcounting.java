/*
Bit Counting
https://www.codewars.com/kata/526571aae218b8ee490006f4/

*/

public class Bitcounting {

	public static int countBits(int n){
    int c = 0;
		String str = Integer.toBinaryString(n);
    for (String s : str.split("")){
      int f=Integer.parseInt(s);
      if (f == 1)
        c++;
      }
    return c;

	}



}

