import java.util.Random;

public class MagicBox<T> {
    private T[] items;

    public MagicBox(int numberOfItems) {
        this.items = (T[]) new Object[numberOfItems];
    }

    public Object getItems() {
        return items;
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }


    public T pick() {
        Random random = new Random();
        int empty = 0;
        for (T item : items) {
            if (item == null) {
                empty++;
            }
        }
        if (empty > 0) {
            throw new RuntimeException("The box is not full. There is " + empty + " more spaces");
        }
        return items[random.nextInt(items.length)];
    }


}
