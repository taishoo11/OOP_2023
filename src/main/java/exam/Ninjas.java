class Ninjas 
{
    String name;
    String technique;
    
    Ninjas(String aName, String aTechnique)
    {
        this.name = aName;
        this.technique = aTechnique;
    }
    
    public static void main(String[] args)
    {
        Ninjas[] array_of_ninjas = new Ninjas[3];
        
        array_of_ninjas[0] = new Ninjas("Ino","Mind Switching");
        array_of_ninjas[1] = new Ninjas("Naruto","Shadow Clone");
        array_of_ninjas[2] = new Ninjas("Kakashi","Copy Eye");
        
        printArrayValues(array_of_ninjas);
    }
    
    public static void printArrayValues(Ninjas[] anArrayObject)
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("Ninja " +(i+1)+ ": " +anArrayObject[i].name);
            System.out.println("Technique " +(i+1)+ ": " +anArrayObject[i].technique);
            System.out.print("\n");
        }
    }
}
