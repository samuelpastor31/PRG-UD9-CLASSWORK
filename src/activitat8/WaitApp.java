package activitat8;

public class WaitApp {
    public static void main(String[] args) {
        try {
       waitSeconds(5);
            System.out.println("Hasta luego");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void waitSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }
}
