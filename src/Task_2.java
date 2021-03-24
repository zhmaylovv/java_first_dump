import java.util.*;
public class Main
{
	public static void main(String[] args) {
			
	    Double max = 0.0;
	    Double min = 1.0;
	    List<Double> arr = new ArrayList<Double>();
	    int arrLength = 10;


	    for (int i = 0; i < arrLength; i++){
	        Double number = Math.random();
	        arr.add(number);
	        if (number < min){
	            min = number;
	        }
	        if (number > max){
	            max = number;
	        }
	    }
	    Double mid = midl(arr);

		System.out.println("Массив: " + arr);
		System.out.println("Среднее значение: " + mid);
		System.out.println("Максимальное значение: " + max);
		System.out.println("Минимальное значение: " + min);
	}

	public static Double midl(List arr){
	    Double summ = 0.0;
	    for (int i = 0; i < arr.size(); i++){
	        summ  += (Double) arr.get(i);
	    }
	    return summ / arr.size();
	}
}
