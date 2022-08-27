class parents {
    String b = " ball ";
    parents() {
        System.out.println(" Hi from parent  called by super ");
    }

    void display(String a){
        System.out.println(b);
        System.out.println(" name  is " +a+ "from  parent class  ");
    }
}
class childs extends parents{
    childs(){
        super();
        System.out.println("Hi from  cons ");
    }
    void display(String a){
        System.out.println(" name  is " +a+ "from  childs class  ");
        super.b = " Harini" ;
        super.display(" Hasini");
    }
}
public class mainClasses {
    public static void main(String[] args) {

        childs c3 = new childs();
        c3.display(" naga ");
    }
}
