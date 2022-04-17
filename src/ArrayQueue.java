import java.util.NoSuchElementException;

public class ArrayQueue<T> implements IQueue<T> {

    private T[] queue;
    private int frontIndex;
    private int backIndex;
    private static final int DEFAULT_CAPACITY = 30;

    public ArrayQueue(int initialCapacity){
        @SuppressWarnings("unchecked")
        T[] tempQueue = (T[]) new Object[initialCapacity+1];
        queue = tempQueue;
        frontIndex = 0;
        backIndex = -1;
    }

    public ArrayQueue(){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void enqueue(T newItem) {
        backIndex = (backIndex + 1) % queue.length;
        queue[backIndex] = newItem;
    }

    @Override
    public T dequeue() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        else {
            T front = queue[frontIndex];
            queue[frontIndex] = null;
            frontIndex = (frontIndex + 1 ) % queue.length;
            return front;
        }
    }

    @Override
    public T getFront() {
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            return queue[frontIndex];
        }
    }

    @Override
    public boolean isEmpty() {
        return frontIndex == (backIndex + 1) % queue.length;
    }

    @Override
    public void clear() {
        while (!isEmpty()){
            dequeue();
        }
    }

    public void displayItems(){
        for (T items : queue) {
            if (items == null){
                break;
            }
            System.out.println(items);
        }
    }

}
