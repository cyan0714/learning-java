package Abstraction;

public class Abstraction {
}

abstract class Father {
    public abstract void run();
}

abstract class Son extends Father {
    @Override
    public void run() {
        System.out.println("the run method has been overridden");
    }
}
