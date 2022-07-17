import java.util.Scanner;

public class nested {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
       System.out.println("enter height of person in cms :");
       double height =  s.nextDouble();
       System.out.println("enter 12th score in percentage:");
       double percent = s.nextDouble();
       if(height >=160)
       {
        if(percent >=60)
        {
            System.out.println("Congrates,he is eligible to go to army");
        }
    
        
        else
        {
            System.out.println("Sorry. he has to score more than 60% to be eligible");
        }
       }
       else if(height < 160)
       {
         if(percent < 60)
         {
            System.out.println("sorry not eligible");
         } 
         else{
            System.out.println("height & percentage not eligible140");
         }  
    }
}
}