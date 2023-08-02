class Clone 
{
    public static void main(String[] args)
    {
        // first array
        int[] sourceArray = {5,2,0};
        
        // second array
        int[] destinationArray = new int[3];
        
        // copy array content
        destinationArray = sourceArray.clone();
        
        // display layout header
        System.out.println("  First Array \t Second Array");
        System.out.println("  ----------------------------");
        
        //display array content
        for(int i=0; i<3; i++)
        {
            System.out.println("\t" +sourceArray[i]+ "\t\t" +destinationArray[i]);
        }       
    }
}
