import main.Concurrence;

public class main {
    public static void main(String[] args) {

        for (int i = 0; i < 1000000000; i++) {
            Concurrence thread = new Concurrence("Hilo " + i);
            thread.start();
        }

        System.out.println("Main thread finished");
    }
}
