package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world");

        Animal misty = new Dog("Misty");

        Animal topCat = new Cat("TopCat");
        Cat ginger = new Cat("Ginger");

        System.out.println(misty);
        System.out.println(topCat);

        misty = topCat;

        topCat.setName("Garfield");

        System.out.println(misty);
        System.out.println(topCat);

        System.out.println(ginger);
        while( ginger.getNumber() > 0)
        {
            ginger.Kill();
        }
        // What will get printed out??

        // 1. topcat, Garfield
        // 2. garfield, Garfield 


    }
} 