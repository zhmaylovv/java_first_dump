package zhmaylo;

/**
 * Класс Queue, реализующий структуру данных "очередь".
 *
 * @version 1.0
 * @autor Жмайло Василий
 */

public class Queue {
    /**
     * Переменная size: размер очереди
     */
    private int size = 5;
    /**
     * Переменная count: счетчик количества элементов в очереди
     */
    private int count;
    /**
     * Переменная items: обьект- массив элементов очереди
     */
    private Object[] items;
    /**
     * Переменная first: номер первого элемента очереди
     */
    private int first;
    /**
     * Переменная last: номер последнего элемента очереди
     */
    private int last;

    /**
     * Конструктор новой очереди
     *
     * @param size - размер очереди
     */
    public Queue(int size) {
        this.items = new Object[size];
        this.size = size;
        this.first = -1;
        this.last = -1;
        this.count = 0;
    }

    /**
     * Функция проверки пустоты очереди
     *
     * @return возвращет true если очередт пуст, false если есть элементы
     */
    public boolean isEmpty() {

        return (count == 0);
    }

    /**
     * Процедура добавления элемента в очередь на позицию
     * c индексом равным переменной last.
     * Если размер очереди == size - 1 расширяется методом {@link Queue#extend}
     *
     * @param element - добавляемый элемент.
     */
    public void enqueue(Object element) {
        if (count + 1 == size) this.extend();
        if (count == 0) {
            items[++last] = element;
            first++;
            count++;
        } else {
            items[++last] = element;
            count++;
        }
    }

    /**
     * Процедура удаления элемента из очереди.
     * удаляется элемент с индексом равным переменной first
     */
    public void dequeue() {
        if (this.isEmpty()) {
            this.first = -1;
            this.last = -1;
        } else {
            items[first] = null;
            first++;
            count--;
        }
    }

    /**
     * Функция получения первого элемента очереди.
     *
     * @return возвращает первый элемент очереди, не удаляя его, если очередь пуста возвращает null
     */
    public Object top() {
        if (this.isEmpty()) {
            return null;
        } else {
            return items[first];
        }
    }

    /**
     * Процедура расширения границ очереди.
     * Создает новый обьект очереди с удвоенной текущей длинной,
     * затем копирует в него старую очередь.
     */
    private void extend() {
        Object[] temp = items.clone();
        this.size *= 2;
        this.items = new Object[size];
        System.arraycopy(temp, 0, items, 0, count);
    }

    /**
     * Переопределение функции toString. Отображение элементов очереди скрыто,
     * для информативного прохождения тестов
     */
    @Override
    public String toString() {
        return "Queue{" +
                "count=" + count +
                ", items= " + "Content is hidden" + // for un hide: Arrays.toString(items)
                ", first=" + first +
                ", last=" + last +
                '}';
    }


}
