
import java.util.*; 

class Arithmatic
{


    public Arithmatic()
    {

    }

    void DisplayReverse(int iValue)
        {
            int iCnt = 0;
            for(iCnt = iValue; iCnt >= 1; iCnt--)
            {
                System.out.print(iCnt+"\t");
            }
 
        }

}
class Program39
{
    public static void main(String ar[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        aobj.DisplayReverse(iNo);
        
    }
}