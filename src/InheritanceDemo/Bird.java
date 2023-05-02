package InheritanceDemo;

public class Bird {

    void fly()
    {
        System.out.println("fly");
    }
}

class Sparrow extends Bird
{
    void sparrowColor()
    {
        System.out.println("sparrowColor");
    }
}

class crow extends Bird
{
    void crowColor()
    {
        System.out.println("crowColor");
    }

    public static void main(String[] args) {
        crow c = new crow();
        c.crowColor();
        c.fly();

        Sparrow s = new Sparrow();
        s.sparrowColor();
        s.fly();

        Bird b = new Bird();
        b.fly();
    }
}

