package b;
import a.fruit ;
import java.util.Scanner;

public class vegtable {
    String name, color;

    public vegtable(){
        name = "Onion" ; color = "White";
        System.out.println(" The vegtables " + name + " is " + color);
    }
    vegtable(String a, String d){
        this.name = a;
        this.color = d;
        System.out.println(" The vegtables " + this.name + " is " + this.color);

    }
    public String display(String Bn){
        System.out.println("The Bn of the vegtables" + this.name + " is " + Bn);
        return Bn;

    }

    public static void main(String[] args) {

        String k ;
        String veg,col ;
        Scanner ac = new Scanner(System.in);
        System.out.println("Type the vegtable");
        veg = ac.nextLine();
        System.out.println("Type the color");
        col = ac.nextLine();
        System.out.println("The type the botamical name");
        k = ac.nextLine();
        vegtable v = new vegtable();
        vegtable v1 = new vegtable(veg,col);
        v1.display(k);

        fruit f = new fruit();
        System.out.println(f);
    }
}
