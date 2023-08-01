
import java.util.*; 

class Display
{
    public int iNo;
    public void Display(int i)
    {
        int iCnt = 0;
        iNo = i;

        iCnt = 1;
        while(iCnt <= iNo)
        {
            System.out.println("Jay Ganesh...");
            iCnt++;
        }
    }

}
class Program19
{
    public static void main(String ar[])
    {
        int iNo = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter the no. of iterations");
        iNo = sobj.nextInt();

        Display dobj = new Display();
        dobj.Display(iNo);
    }
}