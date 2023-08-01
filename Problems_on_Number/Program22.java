
import java.util.*; 

class Display
{

    public void Display()
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Hello world "+iCnt);
        }
        
    }

}
class Program22
{
    public static void main(String ar[])
    {
        Display dobj = new Display();
        dobj.Display();
    }
}