package me.dwtj.capsules;

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
}
