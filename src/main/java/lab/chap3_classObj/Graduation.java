package lab.chap3_classObj;

import java.util.Scanner;

public class Graduation 
{
    public static void main(String[] args)
    {
        // variables to store input values
        String input_graduationMatric;
        
        // prepare input scanner
        Scanner readInput = new Scanner(System.in);
        
        // read required input for parameterised constructor
        // so that instance can be inititaliseed
        System.out.print("Enter matric number : ");
        input_graduationMatric = readInput.next();
        
        // object instantiation from each class
        Student studentObj = new Student(input_graduationMatric);
        Award awardObj = new Award("Vice Chancellor");
        University universityObj = new University("UTHM");
        Convo convoObj = new Convo(20222023);
        Degree degreeObj = new Degree("Diploma of IT","1st class");
        
        // program output
        System.out.println("");
        System.out.print(studentObj.student_matric);
        System.out.print(" is given the award of ");
        System.out.print(awardObj.award_title);
        System.out.print(" for " +universityObj.university_name);
        System.out.print(" graduation on session of ");
        System.out.print(convoObj.convo_session);
        System.out.println(" for " +degreeObj.degree_field+ " with " +degreeObj.degree_class);

    }
}

class Convo
{
    int convo_session;

    Convo(int value_convoSession)
    {
        this.convo_session = value_convoSession;
    }
}

class Award
{
    String award_title;
    
    Award(String value_awardTitle)
    {
        this.award_title = value_awardTitle;       
    }
}

class Student
{
    String student_matric;
    
    Student(String input_studentMatric)
    {
        this.student_matric = input_studentMatric;
    }    
}

class Degree
{
    String degree_field;
    String degree_class;
    
    Degree(String value_degreeField, String value_degreeClass)
    {
        this.degree_field = value_degreeField;
        this.degree_class = value_degreeClass;
    }
}

class University
{
    String university_name;
    
    University(String value_universityName)
    {
        this.university_name = value_universityName;
    }
}