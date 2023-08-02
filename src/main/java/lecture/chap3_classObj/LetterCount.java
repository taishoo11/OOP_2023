package lecture.chap3_classObj;

class LetterCount 
{
    public static void main(String[] args)
    {
        int found = 0;
        String name = "Inuyasha";
        String currentLetter = "";
        int i;
        
        for(i=0; i<name.length();i++)
        {
            currentLetter = name.substring(i,i+1);
            
            if(currentLetter.equals("a"))
            {
                found++;
            }
        }
        
        System.out.print("a was found " +found+ " times");
        
    }
}
