package me.dwtj.capsules;

import java.lang.InterruptedException;
import java.util.concurrent.ExecutionException;

@Capsule
public class HelloWorld
{
    public void helloWorld() {
        System.out.println("Hello, world.");
    }

    public void hello(String name) {
        System.out.println("Hello, " + name + ".");
    }

    public void helloWorldRepeat(int repetitions) {
        for (int i = 0; i < repetitions; i++) {
            System.out.println("Hello, world.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                // TODO ???
            }
        }
    }

    public static void main(String[] argv) {
        HelloWorldCapsule cap = new HelloWorldCapsule();
        cap.start();

        cap.helloWorld();
        try {
            cap.hello("capsules").get();
        } catch (InterruptedException ex) {
        } catch (ExecutionException ex) {
        }
        cap.helloWorldRepeat(5);
        System.out.println("End of main.");
    }
}
