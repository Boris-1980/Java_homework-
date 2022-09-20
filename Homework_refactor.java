import java.util.Scanner;

public class Homework_refactor {

    /* 
    ДЗ_1
    Задача по сути все то же самое, добавил возможность ввода чисел 


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число - a: ");
        int a = in.nextInt();
        System.out.println("Введите число  - b: ");
        int b = in.nextInt();
        in.close();
        
        int c = 2;
        int d = 1;
        if (a >= b) {
            System.out.printf("нет решения");
        } 
        else {
            int[] mas = new int[b + 1];
            mas[a] = 1;
            int[] res = recWay(mas, a + 1, b + 1, c, d);
            System.out.println(printArr(res));
            String resWay = wayArr(a, b, c, d);
            System.out.println(resWay); 
        }
    }

    static String printArr(int[] mas) {
        String res = "";
        for (int i = 0; i < mas.length; i++) {
            if (i == mas.length - 1) {
                res += String.format("\nКоличество вариантов для %d = %d", i, mas[i]);
            }
            else res += String.format("%d=%d ", i, mas[i]);
        }
        return res;
    }

    static int[] recWay(int[] mas, int a, int b, int c, int d) {
        if (a == b) return mas;
        if (a % 2 == 0) {
            mas[a] = mas[a - d] + mas[a / c];
            return recWay(mas, a + d, b, c, d);
        }
        else {
            mas[a] = mas[a - d];
            return recWay(mas, a + d, b, c, d);
        }
    }

    static String wayArr(int a, int b, int c, int d) {
        String result = "Путь: ";
        while (a < b) {
            if (a % 2 == 0 & a * c <= b & a > 0) {
                a *= c;
                result += "k1 ";
            }
            else {
                a += d;
                result += "k2 ";
            }
        } 
        return result;
    }
    */

    // ДЗ_2 По сути все то же самое (добавил проверку только, если вводимое число меньше 0)
    /* 
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = iScanner.nextInt();
        // System.out.printf("%d треугольное число = %d", number, triNum(number));
        iScanner.close();

        if (number < 1) System.out.println("нет решения");
        else{
            int res = triNum(number);
            System.out.println(res);
        }
    }

    static int triNum(int number) {
            if(number == 0)return 0;
            return number + triNum(number - 1);
        }
    */

    // ДЗ_3 Исправил (улучшил программу согласно вашей правки)

    public static void main(String[] args) {
        int arr[] = {45, 33, 12, 2, 39, -4, 10, 87, 17};
        int n = arr.length;

        homework_heapsort ob = new homework_heapsort();
        ob.sort(arr);

        System.out.println(" Отсортированный массив ");
        printArray(arr);
    }

    public void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) 
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) { 
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    void heapify(int arr[], int n, int i) {     
        int largest = i;                        
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest]) 
            largest = left;
        if (right < n && arr[right] > arr[largest]) 
            largest = right;
        if (largest != i) {                         
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}

