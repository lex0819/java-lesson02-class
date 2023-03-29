/* How many letters and digits do you have in the string?
* */

public class FindDigitsAndLetters {
    public static void main(String[] args){
        String data_string = "Absd 123cgkhgvkljuhvlj fghj sdfg 4gjh 246 Pjdfh! 35637 367834783 145r145r1??? ..";
        //System.out.println(data_string.length());

        data_string = data_string.trim().replaceAll("\\s+", "").replaceAll("!", "").replaceAll("\\.", "").replaceAll("\\?", "");
        //System.out.println(data_string.length());

        int letters = data_string.replaceAll ("[0-9]", "").length();
        System.out.printf("There are %d letters\n", letters);
        int digits = data_string.replaceAll ("[a-z,A-Z]", "").length();
        System.out.printf("There are %d digits\n", digits);

        if(digits > letters){
            System.out.printf("There are %d digits. It's more than letters.\n", digits);
        } else if (digits < letters) {
            System.out.printf("There are %d letters. It's more than digits.\n", letters);
        }else {
            System.out.print("There are equil digits and letters.\n");
        }

    }
}