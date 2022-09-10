public class A {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,};

        System.out.println("Hello");
        //Arithmetic unchecked exception runtime
        int i = 10;
        try {

            i = i / 5; //normal flow disturbed here
            System.out.println(i);
        }
        catch (ArithmeticException a){
            System.out.println("Divide by zero prolem");
        }
        finally {
            System.out.println(" cleaning done");
        }
        try{
            arr[1]=25 ;
        }
        catch (ArrayIndexOutOfBoundsException z){
            System.out.println("cant access the index ahead of size");
        }
        finally {
            System.out.println(" Second cleaning done");
        }
        System.out.println("world");
    }
}
