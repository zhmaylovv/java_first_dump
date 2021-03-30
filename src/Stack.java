package zhmaylo;

public class Stack{
	private int size
	private Object[] stack;
	private int top;

	public Stack(int size){
	    stack = new Object[size];
	    top = -1;

	}
	public boolean isEmpty(){
	    return (top == -1);
	}

	public void push(Object element){
	    top++;
	    stack[top] = element;
	}

	public Object pop(){
	    if (isEmpty()) {
	        System.out.println('Error: stack is empty!');
	            return null;
        }
        else {
	        return stack[top--];
	    }
	}

	public Object top(){
	    if (isEmpty()) {
	        System.out.println('Error: stack is empty!');
	            return null;
	    }
	    else {
	        return stack[top];
	    }

	}
}
