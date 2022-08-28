 abstract class Message{
    Message(){
        System.out.println(" Hi form default cons");
    }
    abstract void send();
    abstract void receive();
    public void display() {
        System.out.println(" Hi form normal method");
    }
 }
 class communication extends Message{
    void send(){
        System.out.println(" Hi from send input inside child");
    }
    void receive(){
        System.out.println(" Hi from receive child");
     }
 }
public class abst {
    public static void main(String[] args) {
        Message m = new communication();
        m.send();
        m.receive();
        m.display();
    }
}
