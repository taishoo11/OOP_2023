class Methods 
{
    double bmi, weight, height;
    
    public static void main(String[] args)
    {
        Methods obj = new Methods();
        initObjects(obj);
        
        System.out.println(" The calculated BMI is " + (int)obj.bmi);
        System.out.print(" This BMI in normal range");        
    }
    
    public static void initObjects(Methods objA)
    {       
        objA.weight = 45.3;
        objA.height = 1.52;        
        objA.bmi = objA.weight/(objA.height*objA.height);     
    }
}
