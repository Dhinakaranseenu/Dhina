import java.util.Scanner;

public class cutshortnested {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       System.out.println("enter height of person in cms :");
       double height =  s.nextDouble();
       System.out.println("enter 12th score in percent:");
       double percent = s.nextDouble();

    if(height >= 160 && percent >= 60)
       {
        System.out.println("Congrats he is eligible");
       }
       else{
        if(height < 160 && percent < 60)
        {
            System.out.println("height & percent 140is less");
        }
        else if(percent <60 || height <160)
        {
            System.out.println("Soryy, your criteria is not eligible");
        }
       }
    }     
}
