import java.util.Scanner;

class vote {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int age = sc.nextInt();
if(age>=18){
System.out.println("Person eligible to vote");
}
else
{
    System.out.println("Person not eligible to vote");
}
}    

}