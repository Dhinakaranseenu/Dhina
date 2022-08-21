package b;

class bike {
    String brands = "Honda";

    void display() {
        System.out.println(" Hi, i am called using vehicle a object ");
    }
}
public class vehicle extends bike {

   void run(){
       System.out.println(" Hi ");
    }
    public static void main(String[] args) {



        vehicle v = new vehicle();
        v.run();
        v.display();
        System.out.println(v.brands);
    }
}
