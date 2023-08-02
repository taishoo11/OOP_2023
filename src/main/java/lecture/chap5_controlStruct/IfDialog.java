import javax.swing.JOptionPane; /** required for message dialog*/
import javax.swing.ImageIcon; /* required for image icon*/

class IfDialog 
{
    public static void main(String[] args)
    {
        // prepare icon image for message dialog
        ImageIcon myIcon = new ImageIcon("C:/kurama.png");
        
        int age;
        String inputAge;
        
        // prompt input dialog
        inputAge = JOptionPane.showInputDialog("How old are you?");
        
        // convert input values to corresponding type
        age = Integer.parseInt(inputAge);
        
        if(age<15)
        {
            // prompt message dialog
            JOptionPane.showMessageDialog(null,"You are under age!","Are you under age?",JOptionPane.QUESTION_MESSAGE);
                        
            //embedd image in dialog
            JOptionPane.showMessageDialog(null,"Prohibited Access","Try again",JOptionPane.WARNING_MESSAGE,myIcon);
        }
        // required after dialog usage complete
        System.exit(0);        
    }
}
