package InheritanceDemo;

public /*final*/ class TvShowroom {

    /*final */public void channels()
    {
        System.out.println("showroom channels");
    }
    void settings()
    {
        System.out.println("showroom settings");
    }

    void volume()
    {
        System.out.println("showroom volume");
    }
}

class Samsung extends TvShowroom{

    public void channels()
    {
        System.out.println("Samsung channels");
    }
    void settings()
    {
        System.out.println("Samsung settings");
    }

    void volume()
    {
        System.out.println("Samsung volume");
    }
}

class LG extends TvShowroom{

    public void channels()
    {
        System.out.println("Samsung channels");
    }
    void settings()
    {
        System.out.println("Samsung settings");
    }

    void volume()
    {
        System.out.println("Samsung volume");
    }
}

class Onida  extends TvShowroom{

    public void channels()
    {
        System.out.println("Onida channels");
    }
    void settings()
    {
        System.out.println("Onida settings");
    }

    void volume()
    {
        System.out.println("Onida volume");
    }

    public static void main(String[] args) {

        TvShowroom ob1 = new Onida(); // upcasting
        ob1.channels();
        ob1.settings();
        ob1.volume();

    }
}
