class Parent
{
    String name = "Alice";
    
    protected void Display()
    {
        System.out.print("I am " +name);
    }
}

public class Polymorphism extends Parent
{
    public static void main (String[] args)
    {
        Parent object = new Polymorphism();
        
        object.Display();
    }
    
    @Override
    protected void Display()
    {
        System.out.print("I am David");
    }     
}

