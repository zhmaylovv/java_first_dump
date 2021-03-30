public class Queue{
	private int count;
	private Object[] queue;
	private int first;
	private int last;

	public Queue(int size){
	    queue = new Object[size];
	    first = -1;
	    last = -1;
	    count = 0;
	}

	public boolean isEmpty(){
	    return (count == 0);
	}

	public void enqueue(Object element){
	    if (count == 0){
	        first++;
	    }
	    else{
	        queue[++last] = element;
	        count++;
	    }

	}

	public void dequeue(){
	    if (queue.isEmpty){
	        System.out.println("Queue is empty");
	    }
	    else{
          queue[first] = null;
	        first++;
	        count--;
	    }

	}

	public Object top(){
	    if (queue.isEmpty){
	        return null;
	    }
	    else{
	        return queue[first];
	    }
	}



}
