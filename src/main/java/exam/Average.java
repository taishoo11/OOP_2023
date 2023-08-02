import java.util.Scanner;

public class Average 
{
    public static void main(String[] args)
    {
        int totalStudents;
        
        double totalScore = 0.00, averageScore = 0.00, highestScore = 0.00;
        
        Scanner kb = new Scanner (System.in);
        
        System.out.print(" Enter number of students : ");
        totalStudents = kb.nextInt();
        
        for (int i = 0; i<totalStudents;i++)
        {
            Student object = new Student();
            
            System.out.print("\n Enter student " +(i+1)+ " score : ");
            object.score = kb.nextDouble();
            
            totalScore+= object.score;
            averageScore = totalScore/totalStudents;  
            
            if(object.score > highestScore)
                highestScore = object.score;
        }   
        
        System.out.println ("\n Average score is " +averageScore);
        System.out.print (" Highest score is " +highestScore);
    }
}

class Student
{
    double score;
    
}
