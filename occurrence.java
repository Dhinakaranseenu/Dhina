import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Type any sentance");
        String input = d.nextLine();
        System.out.println("Enter any character");
        char search = d.nextLine().charAt(0);

        int count = 0;
        for(int i = 0;i<input.length();i++){
            if(input.charAt(i) == search){
             count ++;
            }
        }
        System.out.println("The character " +search+ " apears " +count+ " times.");
    }
}
