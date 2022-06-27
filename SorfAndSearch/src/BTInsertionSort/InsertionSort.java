package BTInsertionSort;

public class InsertionSort {
    public static void insertionSort(int[] array)
    {
        int pos, x;
        int leng = array.length;
        for (int i = 1; i < leng; i++)
        {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1])
            {
                array[pos] = array[pos -1];
                pos--;
            }
            array[pos] = x;
        }
    }
}
