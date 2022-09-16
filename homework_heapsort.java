// Реализовать алгоритм пирамидальной сортировки (HeapSort)

public class homework_heapsort {
    public static void main(String[] args) {
        int arr[] = {45, 33, 12, 2, 87, 17};
        int n = arr.length;

        homework_heapsort ob = new homework_heapsort();
        ob.sort(arr);

        System.out.println(" Отсортированный массив ");
        printArray(arr);
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) // перегрупировка
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) { // извлечение элементов и переносим в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {     // переводим в двоичную кучу, n - размер кучи
        int largest = i;                        // определяем наибольший элемент как корень
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) // если левый элемент больше
            largest = left;
        if (right < n && arr[right] > arr[largest]) // если правый элемент больше
            largest = right;
        if (largest != i) {                         // если самый большой не корень
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}