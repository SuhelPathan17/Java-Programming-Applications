
import java.util.*; 

class Display
{
    public int iValue;
    public Display(int iNo)
    {
        iValue = iNo;
    }

    public void Display1()
    {
        int iCnt = 0;
        iCnt = 1;
        while(iCnt <= iValue)
        {
            System.out.println("Hello World : "+iCnt);
            iCnt++;
        }
        
    }

}
class Program24
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