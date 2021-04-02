package zhmaylo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueTest {

    private static Integer testObject = 101010;
    private int printRange = 100000;


    @Test
    void whatIfMillionsQueue() {
        Queue queue = new Queue(5);
        for (int i = 0; i < 1000000; i++) {
            queue.enqueue(testObject);
            if (printRange == i) {
                printRange *= 2;
                System.out.println("enqueue func " + queue);
            }
        }
    }


    @Test
    void isIsEmptyCorrectBoolReturn() {
        Queue queue = new Queue(5);
        Assertions.assertTrue(queue.isEmpty());

        queue.enqueue(testObject);
        Assertions.assertFalse(queue.isEmpty());
    }


    @Test
    void crashIfWrongTopReturn() {
        Queue queue = new Queue(5);
        Assertions.assertEquals(null, queue.top());
        queue.enqueue(testObject);
        Assertions.assertEquals(testObject, queue.top());
        System.out.println("Top element: " + queue.top());
    }


    @Test
    void checkCorrectDeliteElements() {
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
