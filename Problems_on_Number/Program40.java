
import java.util.*; 

class Arithmatic
{


    public Arithmatic()
    {

    }

    void DisplayReverse(int iValue)
        {
            int iCnt = 0;
            iCnt = iValue;
            while(iCnt >= 1)
            {
                System.out.print(iCnt+"\t");
                iCnt--;
            }
 
        }

}
class Program40
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