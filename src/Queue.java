package zhmaylo;

import java.util.Arrays;

public class Queue{
	private int size;
	private int count;
	private Object[] valuese;
	private int first;
	private int last;

	public Queue(int size){
		this.valuese = new Object[size];
	    this.size = size;
		this.first = -1;
		this.last = -1;
		this.count = 0;
	}

	public boolean isEmpty(){
		return (count == 0);
	}

	public void enqueue(Object element){
		if (count + 1 == size) this.extend();
	    if (count == 0){
			valuese[++last] = element;
			first++;
	        count++;
	    }
	    else{
	        valuese[++last] = element;
	        count++;
	    }

	}

	public void dequeue(){
	    if (this.isEmpty()){
			this.first = -1;
			this.last = -1;
	        throw new IndexOutOfBoundsException("Queue is empty!");
	    }
	    else{
          valuese[first] = null;
	        first++;
	        count--;
	    }

	}

	public Object top(){
	    if (this.isEmpty()){
			throw new IndexOutOfBoundsException("Queue is empty!");
	    }
	    else{
	        return valuese[first];
	    }
	}
	private void extend(){
		Object[] temp = valuese.clone();
		this.size *= 2;
		this.valuese = new Object[size];
		System.arraycopy(temp,0, valuese,0, count);
	}

	@Override
	public String toString() {
		return "Queue{" +
				"count=" + count +
				", queue=" + Arrays.toString(valuese) +
				", first=" + first +
				", last=" + last +
				'}';
	}


}
