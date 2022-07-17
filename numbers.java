import java.util.Scanner;

class numbers {
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int num = sc.nextInt();
if(num > 0){
System.out.println("Num is positive");
}
else if(num == 0)
{
    System.out.println("num is neutral");
}
else{
    System.out.println("num is negative");
}

}    

}

