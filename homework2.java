// Написать программу вычисления n-ого треугольного числа
import java.util.Scanner;

public class homework2 {
    public static int triNum(int number) {
        if(number == 1){return 1;
        }else{
            {return(number + triNum(number - 1));}
        }

    }
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner iScanner = new Scanner(System.in);
        int number = iScanner.nextInt();
        System.out.printf("%d треугольное число = %d", number, triNum(number));
        iScanner.close();
    }
}
