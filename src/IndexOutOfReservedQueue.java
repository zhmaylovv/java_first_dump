/**
 * Класс IndexOutOfReservedQueue, реализующий checked исключение.
 *
 * @version 1.0
 * @autor Жмайло Василий
 */

class IndexOutOfReservedQueue extends Exception{
    public IndexOutOfReservedQueue(String message){
        super(message);
    }
}
