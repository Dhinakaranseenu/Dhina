class Threadclass2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Thread2 - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
    class Threadclass3 implements Runnable {
        public void run() {
            for (int i = 11; i <= 14; i++) {
                System.out.println("Thread3 - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    class Threadclass1 implements Runnable {
        public void run() {
            for (char i = 'A'; i <= 'D'; i++) {
                System.out.println("Thread1 - " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


    public class sequence implements Runnable {
        public void run() {

        }

        public static void main(String[] args) {
            Threadclass1 c1 = new Threadclass1();
            Threadclass2 c2 = new Threadclass2();
            Threadclass3 c3 = new Threadclass3();

            Thread t1 = new Thread(c1);
            Thread t2 = new Thread(c2);
            Thread t3 = new Thread(c3);


                t1.start();

                t2.start();

                t3.start();


        }

    }
