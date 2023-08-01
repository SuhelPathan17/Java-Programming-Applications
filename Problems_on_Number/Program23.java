
import java.util.*; 

class Display
{
    int iValue;
    public Display(int iNo)
    {
        iValue = iNo;
    }

    public void Display1()
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println("Hello world "+iCnt);
        }
        
    }

}
class Program23
{
    public static void main(String ar[])
    {
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter no. of iteratiosn :");
        iNo = sobj.nextInt();

        Display dobj = new Display(iNo);
        dobj.Display1();
    }
}