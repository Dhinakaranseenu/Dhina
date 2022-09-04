import java.util.Scanner;

public class EqulString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First String");
         String s1 = s.next();
        System.out.println("Enter second");
        String s2 = s.next();
        if((s1.toLowerCase()).equals(s2.toLowerCase())){
            System.out.println("Both Stirng are equals");
        }
        else{
            System.out.println("Both String are different");
        }
    }
}
