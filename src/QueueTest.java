package zhmaylo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueTest {
    /**
     * Создаем тестовый обьект
     */
    private static Integer testObject = 101010;
    /**
     * Частота вывода println для циклов
     */
    private int printRange = 100000;

    /**
     * Нагрузочное тестирование. Создаем очередь с миллионом testObject.
     * Выводим принт с частотой printRange
     * убрано отображение элементов очереди в: {@link Queue#toString}
     */
    @Test
    void enqueue() {
        Queue queue = new Queue(5);
        for (int i = 0; i < 1000000; i++) {
            queue.enqueue(testObject);
            if (printRange == i) {
                printRange *= 2;
                System.out.println("enqueue func " + queue);
            }
        }
    }

    /**
     * Тестирование функции isEmpty.
     * 1. Создаем пустую очередь, если isEmpty == false: Error
     * 2. Добавляем testObject в очередь, если isEmpty == true: Error
     */
    @Test
    void isEmpty() {
        Queue queue = new Queue(5);
        Assertions.assertTrue(queue.isEmpty());

        queue.enqueue(testObject);
        Assertions.assertFalse(queue.isEmpty());
    }

    /**
     * Создаем обьект пустой очереди,
     * Если myQueue.top() != null : Error
     *
     * Добавляем в нее testObject
     * Если testObject != myQueue.top() : Error
     */
    @Test
    void top() {
        Queue queue = new Queue(5);
        Assertions.assertEquals(null, queue.top());
        queue.enqueue(testObject);
        Assertions.assertEquals(testObject, queue.top());
        System.out.println("Top element: " + queue.top());
    }

    /**
     * Нагрузочное тестирование функции dequeue.
     * Создаем очередь с миллионом testObject.
     *
     * Освобождаем очередь по элементу.
     * Выводим принт с частотой printRange
     * убрано отображение элементов очереди в: {@link Queue#toString()}
     */
    @Test
    void Dequeue() {
        Queue queue = new Queue(5);
        for (int i = 0; i < 1000000; i++) {
            queue.enqueue(testObject);
        }
        for (int i = 0; i < 1000000; i++) {
            queue.dequeue();
            if (printRange == i) {
                printRange *= 2;
                System.out.println("Dequeue func " + queue);
            }
        }
    }


}