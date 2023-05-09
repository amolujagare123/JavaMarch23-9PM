package Abstraction;

public abstract  class AbstractClassDemo {

    abstract void run();
    abstract void start();
    void display()
    {
        System.out.println("display");
    }
}

class ChildAbstract extends AbstractClassDemo
{

   // @Override
    void run() {
        System.out.println("run");
    }

   // @Override
    void start() {
        System.out.println("start");
    }

    public static void main(String[] args) {

        AbstractClassDemo ob = new ChildAbstract();
        ob.run();
        ob.start();
        ob.display();
    }
}
