import java.util.EmptyStackException;

public class ArrayStack<T> implements IStack<T> {

    private T[] stack;
    private int topIndex;
    private static final int DEFAULT_CAPACITY = 30;

    public ArrayStack(int initialCapacity){
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[initialCapacity];
        stack = tempStack;
        topIndex = -1;
    }

    public ArrayStack(){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void push(T newItem) { // missed isStackFull condition
        stack[topIndex+1] = newItem;
        topIndex++;
    }

    @Override
    public T pop() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else{
            T top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
            return top;
        }
    }

    @Override
    public T peek() {
        if (isEmpty()){
            throw new EmptyStackException();
        }
        else {
            return stack[topIndex];
        }
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void clear() {
        while (!isEmpty()){
           pop();
        }
    }


    public void displayItems(){
        for (T items : stack) {
            if (items == null){
                break;
            }
            System.out.println(items);
        }
    }

}
