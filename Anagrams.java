import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {

        Scanner d = new Scanner(System.in);
        System.out.println("Enter the first word");
        String s1 = d.nextLine();
        System.out.println("Enter the second word");
        String s2 = d.nextLine();

        s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            boolean t = Arrays.equals(c1,c2);
            String s3 = c1.toString();
            String s4 = c1.toString();

            if (t) {
                System.out.println("They are Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
    }
