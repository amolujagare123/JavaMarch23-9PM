package InheritanceDemo.SuperKeyword;

public class Animal {

    Animal()
    {
        System.out.println("Animal Constructor");
    }


    void eat()
    {
        System.out.println("eat");
    }
}

class Dog extends Animal {
    Dog()
    {
        super();
        System.out.println("Dog Constructor");
    }
    void bark()
    {
        System.out.println("bark");
    }
}

class BabyDog extends Dog {

    BabyDog()
    {
        super();
        System.out.println("BabyDog Constructor");
    }
    void weep()
    {
        System.out.println("weep");
    }

    public static void main(String[] args) {
       // Animal a = new Animal();


    //   Dog d = new Dog();

        BabyDog bd = new BabyDog();

    }
}
