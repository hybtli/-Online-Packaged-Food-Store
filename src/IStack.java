public interface IStack<T> {

    public void push (T newItem);

    public T pop();

    public T peek();

    public boolean isEmpty();

    public void clear();

    public void displayItems();

}
