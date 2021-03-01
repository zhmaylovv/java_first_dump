public class Main {

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
    }
}
