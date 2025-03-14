package sorts;

public class Util<T extends Comparable<T>> {

    public void swap(T[] array, int i, int j) {

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}