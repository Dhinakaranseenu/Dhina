public class task extends Thread {

    public void run(){
        System.out.println("Hi from run");
    }

    public void main(String[] args) {
        task t = new task();
        t.start();
    }
}
