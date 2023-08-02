import java.util.Scanner;

class Register 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
                
        int totalRecord;
        System.out.print("Enter number of records >>> ");
        totalRecord = in.nextInt();
        
        in.nextLine();
        
        String[] name = new String[totalRecord];
        String[] matric = new String[totalRecord];

        for(int count=0; count<totalRecord ;count++)
        {
            System.out.print("\n Matric : ");
            matric[count] = in.nextLine();
            
            System.out.print(" Name : ");
            name[count] = in.nextLine();  
                        
            if(count==totalRecord-1)
            {
                // display layout header
                System.out.println("\n  Matric Number \t Fullname");
                System.out.println("  ----------------------------");
                display(name, matric);
            }
        }
    }

    public static void display(String[] name, String[] matric)
    {
        for(String theName : name)
        {
            for(String theMatric : matric)
            {
                System.out.println(" " +theName+ "\t" +theMatric);
            }
        }
    }
}
