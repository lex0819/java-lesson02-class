/* How many letters and digits do you have in the string?
* */

public class FindDigitsAndLetters {
    public static void main(String[] args){
        String data_string = "Absd 123cgk'hgvk       ljuh%vlj fghj sdfg 4gjh 246 Pjdfh! 35637 367834783 145r145r1??? ..";
        //System.out.println(data_string.length());

        data_string = data_string.trim().replaceAll("[ .?!'%]", "");
        //System.out.println(data_string.length());

        int letters = data_string.replaceAll ("\\d", "").length();
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

        //string.charAt(item) returns code of item
        int digit_counts = 0;
        int letter_counts = 0;
        data_string = data_string.toLowerCase();

        for (int i = 0; i < data_string.length(); i++) {
            if(data_string.charAt(i) >= '0' && data_string.charAt(i) <= '9'){
                digit_counts++;
            } else if (data_string.charAt(i) >= 'a' && data_string.charAt(i) <= 'z') {
                letter_counts++;
            }
        }

        System.out.printf("There are %d letters and %d digits.\n", letter_counts, digit_counts);
    }
}