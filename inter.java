interface A{
    String str = " hello " ;  // Functional interface
    void show();
}
interface B{
    void hide();
}
class C implements A,B{
   public void show(){
        System.out.println("Implementen show in child");
    }
    public void hide() {
        System.out.println(" Implement hide in child");
    }
}
public class inter {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.hide();
        System.out.println(c.str);

       // A ca = new C();
        //C cb = new C();
    }
}
