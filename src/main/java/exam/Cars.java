class Cars 
{
    int doors;
    
    Cars(int inputDoor)
    {
        doors = inputDoor;
    }
    
    
    public static void main(String[] args)
    {
        Cars[] obj = new Cars[3];
        
        obj[0] = new Cars(2);
        obj[1] = new Cars(3);
        obj[2] = new Cars(4);
        
        
        for(int i=0; i<obj.length;i++)
        {
            System.out.println("Car " +(i+1)+ " has " +obj[i].doors + " doors");
        }
    }
}
