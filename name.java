import java.util.Scanner;;
class name {
    public static void main(String args[]){
   Scanner s = new Scanner(System.in);
   int a ;
   System.out.println("Enter any value between 1 to 7:");
   a = s.nextInt();

   switch(a){

         case 1:
         System.out.println("monday");
         break;
         case 2:
         System.out.println("tuesday");
         break;
         case 3:
         System.out.println("wednesday");
         break;
         case 4:
         System.out.println("thursday");
         break;
         case 5:
         System.out.println("friday");
         break;
         case 6:
         System.out.println("saturday");
         break;
         case 7:
         System.out.println("sunday");
         break;

         default :
           System.out.println("pleace enter with 1 to 7");
           break;

   }
   
   
    char old;
    char new1;

    old = s.next().charAt(0);
    new1 = Character.toLowerCase(old);

    switch(new1) {
        case 'a':
              System.out.println("monday");
            
            break;
    
        default:
        System.out.println("enter from A to Z");
            
    }
    String o;
    String n;

    o = s.next();
    n = o.toLowerCase();

    switch(n) {
        case "a":
              System.out.println("monday");
            
            break;
            case "b":
              System.out.println("tuesday");
            
            break;
        default:
        System.out.println("enter from A to Z");
            
    }
    }
}