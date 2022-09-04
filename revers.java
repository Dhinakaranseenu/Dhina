import java.util.Scanner;

public class revers {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Any word");
        String d = s.nextLine();
        char[] c1 = d.toCharArray();
        for(int i=d.length()-1;i>=0;i--){
            System.out.print(c1[i]);

        }
    }
}