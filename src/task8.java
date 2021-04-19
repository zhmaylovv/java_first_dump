public class ArrayIterator<T> implements Iterable<T>{
    private T[][] matrix;
    private int lvl1;
    private int lvl2;

    public ArrayIterator(T[][] matrix){
        this.matrix = matrix;
    }

    @Override
    public T next(){
        if (!hasNext()){
            return new NoSuchFieldException();
        }
        if (lvl2 >= lvl2.length){
            lvl1++;
            lvl2 = 0;
        }
        return matrix[lvl1][lvl2++]
    }

    @Override
    public boolean hasNext(){
        if (lvl1 >= matrix.length || lvl1 == matrix.length && lvl2 >= matrix[lvl2].length){
            return false
        }
        return true
    }
    


}
	public static void main(String[] args) {
		System.out.println("Hello World");
	}


}
