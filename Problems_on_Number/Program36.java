
import java.util.*; 

class Arithmatic
{


    public Arithmatic()
    {

    }

    public void NonFactors(int iValue)
    {
        int iCnt = 0;
        System.out.println("Non-Factors of "+iValue+" are:");
        for(iCnt = 1; iCnt<iValue; iCnt++)
        {
            if((iValue % iCnt) != 0)
            {
                System.out.println(iCnt);
            }
        }
        
    }

}
class Program36
{
    public static void main(String ar[])
    {
        int iNo = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        aobj.NonFactors(iNo);
        
    }
}