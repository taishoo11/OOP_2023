import java.util.ArrayList;

public class Score 
{
    static ArrayList<Double> scoreList = new ArrayList<>();
            
    public static void main (String[] args)
    {
        addList();
        countAve();
    }
    
    public static void addList()
    {
        scoreList.add(53.1);
        scoreList.add(72.3);
        scoreList.add(90.4);
    }
    
    public static void countAve()
    {
        double sum = 0.0 ;
        
        for(int i=0; i<3; i++)
        {
            sum += scoreList.get(i);        
        }
        
        System.out.print("Average score is " +sum/3);
    }
}