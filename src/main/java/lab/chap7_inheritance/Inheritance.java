/*import java.util.Scanner;

public class Inheritance 
{
    public static void main (String[] args)
    {       
        Scanner kb = new Scanner(System.in);
        
        System.out.print(" Select patient category(1-Government Staff, 2-Student) >>> RM");
        int status = kb.nextInt();
        
        System.out.print(" Enter amount of hospital bill >>> ");
        double totalBill = kb.nextDouble();
        
        if(status == 1)
        {
            GovernmentStaff aPatient = new GovernmentStaff(totalBill); 
            aPatient.display();
        }
        else
        {
            Student aStudent = new Student();
            aStudent.display();
        }      
    }
}

class Patient
{
    protected int discount;
}


class GovernmentStaff extends Patient
{
    GovernmentStaff(double payment)
    {
        checkMedicalCoverage(payment);
    }

    final void checkMedicalCoverage(double paymentBill)
    {
        if(paymentBill > discount)
            display("pay");
        else
            System.out.println("Your bill is fully sponsored");
    }
    
    void display(String payStatus)
    {
        if(payStatus == pay)
            System.out.println("You have to pay additional " +(discount-paymentBill));
        else
    }
}


class Student extends Patient
{   
    applyGuaranteeLetter()
    {
    
    }
}
*/