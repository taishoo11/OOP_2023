public class ArrayObjectMethod 
{
    public static void main(String[] args)
    {
        Pen[] myPen = new Pen[2];
        
        myPen[0] = new Pen("pink", 0.5);
        myPen[1] = new Pen("green", 0.7);
                
        display(myPen);
    }
    
    public static void display(Pen[] thePen)
    {
        for (Pen aPen : thePen) 
            System.out.println(" I have " + aPen.inkColor + 
                               " pen with " + aPen.pointTip);
    }    
}

class Pen
{
    String inkColor;
    double pointTip;
    
    Pen(String color, double point)
    {
        this.inkColor = color;
        this.pointTip = point;
    }
}
