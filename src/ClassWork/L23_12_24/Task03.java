package ClassWork.L23_12_24;

import java.util.Scanner;

/*Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3*/
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a != b && a != c) {
            System.out.println(1);
        } else if (b != a && b != c) {
            System.out.println(2);

        }else {
            System.out.println(3);
        }

    }
}
