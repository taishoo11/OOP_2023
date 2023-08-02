import javax.swing.JOptionPane;

class Account 
{
    String accountNumber = "3564126985";
    static double accountAmount = 500.00;
   
    double checkBalance(double amountWithdraw)
    {
        if(amountWithdraw>accountAmount)
            JOptionPane.showMessageDialog(null,"Insufficient fund","Try again",JOptionPane.WARNING_MESSAGE);
        else
            accountAmount-=amountWithdraw;
        
        return accountAmount;
    }
}