package zhmaylo;
/**
 * Класс stack, реализующий структуру данных "стек".
 *
 * @version 1.0
 * @autor Жмайло Василий
 */

public class Stack{
	/**
     * Переменная size: размер стека
     */
	private int size ;
	/**
     * Переменная Stack: список элементов стека
     */
	private Object[] stack;
	/**
     * Переменная top: индекс верхнего элемента
     */
	private int top;
	/**
	     * Конструктор нового стека
			 * @param size - размер стека
	     */
	public Stack(int size){
	    this.stack = new Object[size];
	    this.top = -1;

	}

	/**
     * Функция проверки пустоты стека
     *
     * @return возвращет true если стек пуст, false если есть элементы
     */
	public boolean isEmpty(){
	    return (this.top == -1);
	}
	/**
      * Процедура добавления элемента в стек
      *
      * @param element - добавляемый элемент.
      */
	public void push(Object element){
	    stack[++this.top] = element;
	}
	/**
      * Функция получения крайнего элемента стека с его удалением.
      *
      * @return возвращает крайний элемент стека, удаляя его, если стек пуст
			* возвращает null
      */
	public Object pop(){
        if (this.isEmpty()) {
	      	return null;
        }
        else {
					//добавть обнуление
          Object tempObj = stack[top--];
          return tempObj;
	    }
	}
	/**
      * Функция получения крайнего элемента стека.
      *
      * @return возвращает крайний элемент стека, не удаляя его, если стек пуст
			* возвращает null
      */
	public Object top(){
	    if (this.isEmpty()) {
        	return null;
	    }
	    else {
	        return this.stack[this.top];
	    }
	}
	//добавть расширение стека
	//добавить toString
}
