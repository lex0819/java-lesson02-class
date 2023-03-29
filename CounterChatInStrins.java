//How do I count the number of occurrences of a char in a String?

public class CounterChatInStrins {
    public static void main(String[] args){
        String data_string = "How do I count the number of occurrences of a char in a String?";
        String data_char = "i";

        int count = data_string.length() - data_string.toLowerCase().replaceAll(data_char, "").length();

        System.out.printf("Char %s is found %d parts in the string \n%s \n", data_char, count, data_string);
        
    }
}

