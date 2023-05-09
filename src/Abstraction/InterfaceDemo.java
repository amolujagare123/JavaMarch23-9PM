package Abstraction;

public interface InterfaceDemo {
    void run();
    void start();

    static void concreteMethod1()
    {
        System.out.println("concreteMethod1");
    }

    default void concreteMethod2()
    {
        System.out.println("concreteMethod2");
    }

    private void concreteMethod3()
    {
        System.out.println("concreteMethod3");
    }
}
class ChildInterface implements InterfaceDemo
{
    public void run() {
        System.out.println("run");
    }

    public void start() {
        System.out.println("start");
    }
}
