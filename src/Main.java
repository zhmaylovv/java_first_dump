

public class Main {


    public static void main(String[] args) {

        Dancer discoman = new Dancer("Vasya", 35);

        jumper gipnodancer = new jumper("Egor", 38);

        discoman.dance();
        gipnodancer.dance();
    }

    public static class jumper extends Dancer{


        public jumper(String name, int age) {
            super(name, age);
        }
    }

}


//
 //   public class  Jumper extends Dancer{
 //       String name;
  //      int age;
  //  }


//}

/*public class Main {

    public static void main(String[] args){
        System.out.println("Hello world");
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            System.out.print( x );
            System.out.print(", ");
        }
        String st = "0100010011";
        for (String i : st.split("")) {
            if (i.equals("1"))
                System.out.println(i);
        }

        int a =1, b = 2 , c =3;
        System.out.print( a > b ? "True" : a + b + c );

        String st1 = "Привет!";
        String st2 = "Привет1";

        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());



    }
    */

/*
    public static try_while(){
      int[] nums = {1, 2, 3, 4, 5, 6, 7, 8}
      while (nums.indexOf(i) != -1){
        Sustem.out.println(nums[i])
      }*/
