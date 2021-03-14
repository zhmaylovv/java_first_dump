import java.util.*;

class Spotlist extends ArrayList<Integer>
    {

        public int sum ()
        {
            int s = 0;
            for (int i : this)
            {
            s += i;
            }
        return s;
        }
    public static void main (String[] args){

}
    }


public class SpotList
{

	public static void main(String[] args)
	{
	  Spotlist heroes = new Spotlist();
      heroes.add(6);
      heroes.add(2);
      heroes.add(9);
		System.out.println(heroes.sum());
	}



}
