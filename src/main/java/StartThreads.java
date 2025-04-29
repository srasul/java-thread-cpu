/**
 * Hello world!
 */
public class StartThreads {
    public static void main(String[] args) {
        // lets start 1 heavy ...
        new HeavyThread(1000);
        System.out.println("started HeavyThread");

        // ... and 3 light threads
        new LightThread();
        new LightThread();
        new LightThread();
        System.out.println("started 3 LightThread");

        System.out.println("Current Java Process PID: " + ProcessHandle.current().pid());
    }
}
