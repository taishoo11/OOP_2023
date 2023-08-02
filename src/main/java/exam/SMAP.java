import java.util.ArrayList;
import java.util.Scanner;

public class SMAP 
{
    public static void main (String[] args)
    {
        input();
    }
    
    public static void input()
    {
        double score;
        
        Scanner kb = new Scanner(System.in);
        
        ArrayList<Double> scoreList = new ArrayList<>();
        
        for(int i=0;i<3;i++)
        {
            System.out.print("Enter student " +(i+1)+ " score : ");
            score = kb.nextDouble();
            addList(scoreList, score);
        }        
    }
    
    public static void addList(ArrayList<Double> inputList, double inputScore)
    {
        inputList.add(inputScore);
        System.out.println(inputList);
    }
}



