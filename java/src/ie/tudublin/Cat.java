package ie.tudublin;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }
    private int numLives = 9;

    public int getNumber()
    {
        return numLives;
    }
    public void Kill(){
        if(numLives > 0){
            numLives=numLives-1;
            System.out.println("Ouch!");
        }
        else 
        {
            System.out.println("Dead");
        }
    }
}