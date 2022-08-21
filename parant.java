package b;
class grandFather{
    String gname(){
        return " Subramani" ;
    }
}
public class parant extends grandFather {
    String pname() {
        return "Babu";
    }
}
    class son extends parant{
    public static void main(String[] args) {

        son s = new son();
        System.out.println(s.pname());
        System.out.println(s.gname());
    }
    }

