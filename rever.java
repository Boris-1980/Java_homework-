// Показать набор команд для превращения числа а в число b


import java.util.Scanner;

public class rever{
    
        public static void main(String[] args){
            int a,b;
            System.out.println("Введите числа A и B");
            Scanner iScanner = new Scanner(System.in);

            a = iScanner.nextInt();  // a = 7
            b = iScanner.nextInt();  // b = 5

            System.out.println("Изначальные числа \na = "+a+"\nb = " +b);

            a = a + b; // присваеваем значение a что оно имеет теперь в себе a и  b || a = 7 + 5 = 12
            b = a - b; // присваеваем b значение ((a + b) - b)                      || b = 12 - 5 = 7
            a = a - b; // новое значение a  = ((a + b) - ((a + b) - b))             || a = 12 - 7 = 5 

            System.out.println("Перевернутые числа \na = "+a+"\nb = "+b); // результат перемены
            iScanner.close();

        }
}

