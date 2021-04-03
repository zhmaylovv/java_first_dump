package zhmaylo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class QueueTest {

    private static String testObject = "Simple test string";
    private static String testObject1 = "Simple test string";
    private int printRange = 100000;


    @Test
    void whatIfMillionsQueue() {
        Queue queue = new Queue(5);
        for (int i = 0; i < 1000000; i++) {
            testObject = String.valueOf(i); //сделаем миллион обьектов а не миллион ссылок на один
            queue.enqueue(testObject);
            if (printRange == i) {
                printRange *= 2;
                System.out.println("enqueue func " + queue);
            }
        }
    }


    @Test
    void IsEmptyCorrectBoolReturn() {
        Queue queue = new Queue(5);
        Assertions.assertTrue(queue.isEmpty());

        queue.enqueue(testObject);
        Assertions.assertFalse(queue.isEmpty());
    }


    @Test
    void crashIfWrongTopReturn() {
        Queue queue = new Queue(5);
        Assertions.assertNull(queue.top());
        queue.enqueue(testObject);
        Assertions.assertEquals(testObject, queue.top());
    }


    @Test
    void checkCorrectDeleteElements() {
        Queue queue = new Queue(5);
        queue.enqueue(testObject);
        queue.enqueue(testObject1);
        Assertions.assertEquals(testObject, queue.top());
        queue.dequeue();
        Assertions.assertEquals(testObject1, queue.top());
    }


    @Test
    void checkQueueOverSized() {
        Queue queue = new Queue(5);
        try {
            for (int i = 0; i < 2000001; i++) {
                queue.enqueue(testObject);
            }
        } catch (IndexOutOfBoundsException e) {
            Assertions.assertEquals(e.getMessage(), "Queue is oversize!");
        }


    }
}
