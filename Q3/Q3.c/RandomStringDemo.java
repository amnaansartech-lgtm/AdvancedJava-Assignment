/*Q9. Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package Strings;
import java.util.Random;
import java.util.Scanner;

public class RandomStringDemo {

    static String generateRandomString(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            result += chars.charAt(r.nextInt(chars.length()));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        int n = sc.nextInt();

        System.out.println("Random String = " + generateRandomString(n));
    }
}
