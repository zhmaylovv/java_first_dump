import java.util.*;

class SpotList extends ArrayList<Integer>
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
    public static void main (String args []){

}
    }


public class Main
{

	public static void main(String[] args)
	{
	  SpotList heroes = new SpotList();
      heroes.add(6);
      heroes.add(2);
      heroes.add(9);
		System.out.println(heroes.sum());
	}



}
