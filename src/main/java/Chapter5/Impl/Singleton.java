package Chapter5.Impl;


public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){
    }
    public static Singleton getInstance() {
        if (singleton == null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String sayHello()
    {
        return "Hello";
    }
}
