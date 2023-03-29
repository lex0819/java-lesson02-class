//Дана строка с числами через пробел
//Ввести число
//Вывести индекс первого и последнего вхождения числа-подстроки в строку.

import java.util.Scanner;
public class task01 {
    public static void main(String[] args){
        String data_string = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 8 9 7";
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter some digit: ");
        String digit = iScanner.nextLine();

        int first_index = data_string.indexOf(digit);
        int last_index = data_string.lastIndexOf(digit);

        System.out.printf("Index of first entering is %d and index of last entering is %d\n", first_index, last_index);

        iScanner.close();
    }
}