/* Задача 2
* Дана строка со словами, даны две буквы. Надо посчитать сколько всего слов в строке с каждой конкретной буквой.
* Хотя бы одно вхождение буквы в слово.
* */

public class task02 {
    public static void main(String[] args){
        String data_string = "Abba Colobok Africa Banana Plane Space Sky Water";
        String letter01 = "a";
        String letter02 = "b";

        int count_letter01 = 0;
        int count_letter02 = 0;

        String[] words = data_string.trim().split("\\s");
        //System.out.println(Arrays.toString(words));

        for (String word : words){
            word = word.toLowerCase();
            if(word.indexOf(letter01) != -1){
                count_letter01++;
            }
            if(word.indexOf(letter02) != -1){
                count_letter02++;
            }
        }

        System.out.printf("%d words contain %s\n%d words contain %s\n", count_letter01, letter01, count_letter02, letter02);
    }
}