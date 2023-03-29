// Java program to validate an IP address
// using Regular Expression or ReGex

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class IPAddressValidation {

    // Function to validate the IPs address.
    public static boolean isValidIPAddress(String ip){

        // Regex for digit from 0 to 255.
        String zeroTo255
                = "(\\d{1,2}|(0|1)\\"
                + "d{2}|2[0-4]\\d|25[0-5])";

        // Regex for a digit from 0 to 255 and
        // followed by a dot, repeat 4 times.
        // this is the regex to validate an IP address.
        String regexIP
                = zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255 + "\\."
                + zeroTo255;

        // Compile the ReGex pattern
        Pattern regex_pattern = Pattern.compile(regexIP);

        // If the IP address is empty return false
        if (ip == null) {
            return false;
        }

        // Pattern class contains matcher() method
        // to find matching between given IP address
        // and regular expression.
        Matcher ip_match = regex_pattern.matcher(ip);

        // Return if the IP address matched the ReGex
        return ip_match.matches();
    }
    public static void main(String[] args){
        Scanner iScanner = new Scanner(System.in);

        System.out.print("Enter IP-address: ");
        String ip = iScanner.nextLine();

        String valid = isValidIPAddress(ip) ? "valid" : "NOT valid";

        System.out.printf("IP-address %s is %s \n", ip, valid);

        iScanner.close();
    }
}
