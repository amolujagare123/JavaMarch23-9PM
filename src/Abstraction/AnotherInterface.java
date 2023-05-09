package Abstraction;

public interface AnotherInterface {
    void run();
    void start();

    void display();
}

interface InterfaceDemo1 {
    void display();
}
class ChildInterface2 implements AnotherInterface,InterfaceDemo1
{
    public void run() {
        System.out.println("run");
    }

    public void start() {
        System.out.println("start");
    }

    @Override
    public void display() {
        System.out.println("display");
    }
}
