import java.util.Random;

/**
 * thread that does little work. just count & sleep
 *
 * @author srasul
 */
public class LightThread implements Runnable {

    public LightThread() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
