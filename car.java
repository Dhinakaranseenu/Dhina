package B;

import A.bike;

public class car{
    String cars,color;
    int price;

    public car() {
        cars = "Kia";
        price = 500000;
        color = " blue";
        System.out.println("hi from B.car class");
    }
    public car(String a, int b,String c){

        this.cars=a;
        this.price=b;
        this.color=c;
    }

    void write(){

        System.out.println("this is my new " +this.color+" "+this.cars+  " B.car which rupees. "+this.price+"\n");

    }

    public static void main(String[] args) {



        car c = new car();
        System.out.println(c.cars);
        System.out.println(c.price);
        System.out.println(c.color);
        c.write();

        car c1 = new car("honda",100000,"red");
        System.out.println(c1.cars);
        System.out.println(c1.price);
        System.out.println(c1.color);
        c1.write();

        car c2 = new car("ford",120000,"green");
        System.out.println(c2.cars);
        System.out.println(c2.price);
        System.out.println(c2.color);
        c2.write();

        bike b = new bike();
        System.out.println(b);
    }
}

