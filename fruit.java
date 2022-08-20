package a;
import b.vegtable;
import java.util.Scanner;

public class fruit {
    String name, color ;
    int Seeds;
    public fruit(){
        name = "Apple" ; color = "red" ; Seeds = 4 ;
        System.out.println("The fruit" + name + " is " + color + " in color has Seeds " + Seeds);

    }
    fruit(int s, String n, String c){

        this.Seeds = s ;
        this.name = n ;
        this.color = c;
        System.out.println("The fruit " + this.name + " is " + this.color + " in color has Seeds " + this.Seeds);
    }
    String display(String Bn){
        System.out.println("The Bn of the fruit " + this.name + " is " + Bn);
        return Bn ;
    }
    public static void main(String[] args) {

        String b ;
        String fr, co ;
        int se ;
        Scanner a = new Scanner(System.in);
        System.out.println("Type the color ");
        co = a.nextLine();
        System.out.println("Type the fruit name ");
        fr = a.nextLine();
        System.out.println("Type the Botamical name");
        b = a.nextLine();
        System.out.println("Type the seeds ");
        se = a.nextInt();

        fruit f = new fruit();
        fruit f1 = new fruit(se,fr,co);
        f1.display(b);

        vegtable v = new vegtable();
        System.out.println(v.display("ythnjhdnjn"));
    }
}
