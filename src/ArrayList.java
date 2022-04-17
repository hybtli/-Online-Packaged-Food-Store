public class ArrayList<T> implements IList<T> {

    private T[] list;
    private int numberOfEntries;
    private static final int DEFAULT_CAPACITY = 30;

    public ArrayList(int initialCapacity){
        if(initialCapacity <= DEFAULT_CAPACITY){
            initialCapacity = DEFAULT_CAPACITY;
        }
        @SuppressWarnings("unchecked")
        T[] tempList = (T[]) new Object[initialCapacity];
        list = tempList;
        numberOfEntries = 0;
    }

    public ArrayList(){
        this(DEFAULT_CAPACITY);
    }

    @Override
    public void add(T newEntry) {
        list[numberOfEntries] =  newEntry;
        numberOfEntries++;
    }

    @Override
    public void add(int newPosition, T newEntry) {
        if ((newPosition>=0) && (newPosition<=numberOfEntries)){
            if (newPosition<numberOfEntries){
                makeRoom(newPosition);
            }
            list[newPosition] = newEntry;
            numberOfEntries++;
        }
        else {
            throw new IndexOutOfBoundsException("Given position of new entry is out of bounds.");
        }
    }

    private void makeRoom(int newPosition){
        assert ((newPosition>=0) && (newPosition<=numberOfEntries));

        int lastIndex = numberOfEntries-1;
        for (int index = lastIndex; index>= newPosition; index--){
            list[index+1] = list[index];
        }
    }

    @Override
    public T remove(int givenPosition) {
        if ((givenPosition>=0) && (givenPosition<numberOfEntries)){
            assert isEmpty();
            T result = list[givenPosition];
            list[givenPosition] = null;

            if (givenPosition < numberOfEntries-1){
                removeGap(givenPosition);
            }
            numberOfEntries--;
            return result;
        }
        else {
            throw new IndexOutOfBoundsException("Illegal position given to remove operation.");
        }
    }

    private void removeGap(int givenPosition){
        assert ((givenPosition>=0) && (givenPosition<numberOfEntries));

        int lastIndex = numberOfEntries-1;
        for (int index = givenPosition; index<lastIndex; index++){
            list[index] = list[index+1];
        }
    }

    @Override
    public void clear() {
        while (!isEmpty()){
            remove(numberOfEntries-1);
        }
    }

    @Override
    public T replace(int givenPosition, T newEntry) {
        if ((givenPosition>=0) && (givenPosition<=numberOfEntries-1)){
            assert !isEmpty();
            T originalEntry = list[givenPosition];
            list[givenPosition] = newEntry;
            return originalEntry;
        }
        else{
            throw new IndexOutOfBoundsException("Illegal position is given to replace operation");
        }
    }

    @Override
    public T getEntry(int givenPosition) {
        if ((givenPosition>=0) && (givenPosition<=numberOfEntries-1)){
            assert !isEmpty();
            return list[givenPosition];
        }
        else {
            throw new IndexOutOfBoundsException("Illegal position is given to getEntry operation");
        }
    }

    @Override
    public T[] toArray() {
        @SuppressWarnings("unchecked")
        T[] result =(T[]) new Object[numberOfEntries];
        for (int index = 0; index < numberOfEntries; index++) {
            result[index] = list[index];
        }
        return result;
    }

    @Override
    public boolean contains(T anEntry) {
        boolean found = false;
        int index = 0;
        while (!found && (index<numberOfEntries)){
            if (anEntry.equals(list[index])){
                found = true;
            }
            index++;
        }
        return found;
    }

    @Override
    public int getLength() {
        return numberOfEntries;
    }

    @Override
    public boolean isEmpty() {
        return numberOfEntries == 0;
    }

}
