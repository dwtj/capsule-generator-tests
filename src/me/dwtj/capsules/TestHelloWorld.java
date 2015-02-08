package me.dwtj.capsules;

import java.lang.InterruptedException;
import java.util.concurrent.ExecutionException;


public class TestHelloWorld
{
    public static void main(String[] argv) {
        HelloWorldCapsule cap = new HelloWorldCapsule();
        cap.start();

        cap.helloWorldProc();
        try {
            cap.helloProc("capsules").get();
        } catch (InterruptedException ex) {
        } catch (ExecutionException ex) {
        }
        cap.helloWorldRepeatProc(5);
        System.out.println("End of main.");
    }
}
