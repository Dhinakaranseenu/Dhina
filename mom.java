package b;
class parent {
    void sad(){
        System.out.println(" We are sad ");
    }
}
class brother1 extends parent{
    void angry(){
        System.out.println("Bro1");
    }
}
class brother2 extends parent{
    void happy(){
        System.out.println("bro2");
    }
}
public class mom {
    public static void main(String[] args) {

        brother2 b2 = new brother2();
        brother1 b1 = new brother1();
        b2.happy();
        b2.sad();
        b1.angry();
        b1.sad();
    }
}
