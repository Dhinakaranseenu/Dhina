class parent1{
    void write(){
        System.out.println(" Hi parent");
    }
}
class child1 extends parent1{
    void write(){
        System.out.println(" Hi child ");
        super.write();
    }
}
public class in1 {
    public static void main(String[] args) {
        child1 c1 = new child1();
        c1.write();
        parent1 p1 = new parent1();
        p1.write();

        parent1 p2 = new child1();
        p2.write();
    }
}
