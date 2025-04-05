package Demo1;


public class Test {
    public static void main(String[] args) {

        // using thread class
        World world = new World();
        world.start();

        // using runnable interface
        NewWorld newWorld = new NewWorld();

        //Creating a Thread class object
        Thread t1 = new Thread(newWorld);
        t1.start();


        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello");
        }
    }
}
