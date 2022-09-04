import java.util.Scanner;

public class DuplicateLetters {
    public static void main(String[] args) {
        int count=0 ;
        Scanner d = new Scanner(System.in);
        System.out.println("Enter the String");
        String s1 = d.nextLine();
        char[] ca = s1.toCharArray();
        for(int i=0; i<s1.length();i++){
            for (int j=i+1;j<s1.length();j++){
                if(ca[i] == ca [j]){
                    System.out.printf(ca[j]+" ");
                    count= count+1;
                    break;
                }

            }

        }
        System.out.println(count);
        }
    }

