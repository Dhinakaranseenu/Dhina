class parent{
    void display(String a){
        System.out.println("display " +a);
    }
    void write(){
        System.out.println(" Hi from parent ");
    }
}
class child extends parent{
    void display(){
        System.out.println("Hi form child write()");
    }
    void write(){
        System.out.println( " Hi from child write()");
        super.write();
    }
}
public class in {
    public static void main(String[] args) {
        child c = new child();
        parent p = new parent();
        p.write();
        c.display();
        c.display("Dhina");
        c.write();
    }
}
