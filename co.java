class co{
    int width;
    String type,color;
    
    public co() {
     width = 10;
     type = "ball";
     color = " blue";
    }
   public co(int a, String b,String c){
       
        this.width=a;
        this.type=b;
        this.color=c;
    }
    
    void write(){
    
        System.out.println("Hi I am a pen");
    }
    
    public static void main(String[] args) {
        
        co p = new co();
       System.out.println(p.width);
       System.out.println(p.type);
       System.out.println(p.color);
        p.write();

        co p1 = new co();
       System.out.println(p1.width);
       System.out.println(p1.type);
       System.out.println(p1.color);
        p.write();

        co p3 = new co(25,"ink","red");
        System.out.println(p3.width);
        System.out.println(p3.type);
        System.out.println(p3.color);
         p3.write();

         co p4 = new co(25,"marker","green");
        System.out.println(p4.width);
        System.out.println(p4.type);
        System.out.println(p4.color);
         p4.write();
    }
}