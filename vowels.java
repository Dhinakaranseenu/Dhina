import java.util.Scanner;

public class vowels {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter a character");
        // String letter =sc.nextLine();
       //String letter1 = letter.toUpperCase();

       char letter =sc.nextLine().charAt(0);
       char letter1 = Character.toUpperCase(letter);
       String letter2 = Character.toString(letter1);
       
        if(letter2.equals("A") || letter2.equals("E")||
        letter2.equals("I") || letter2.equals("O")|| letter2.equals("U"))
        {
          System.out.println("The letter is vowel:" +letter);  
        }
        else
        {
            System.out.println("The letter:" +letter+ "is consonent");
        }
}
}