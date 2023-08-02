import java.util.Scanner;

class Banking 
{
    public static void main(String[] args)
    {
        double inputWithdraw;
        int nextLoop = 0;
        
        Scanner kb = new Scanner(System.in);
        
        do
        {
            System.out.print("\n Enter amount to withdraw >>> RM ");
            inputWithdraw = kb.nextDouble();
                
            Account myObj = new Account();
            Customer profile = new Customer();
        
            displaySummary(myObj, profile, inputWithdraw);
            
            System.out.print( "\n Withdraw again? 1- yes, 0-no >>>>");
            nextLoop = kb.nextInt();
        } while (nextLoop == 1);     
    }
    
    public static void displaySummary(Account details, Customer info, double sendWithdraw)
    {
        System.out.println("\n Account holder : " +info.name);
        System.out.println(" Account number : " +details.accountNumber);
        System.out.print(" Balance amount : RM " +details.checkBalance(sendWithdraw)+ "\n");    
    }
}