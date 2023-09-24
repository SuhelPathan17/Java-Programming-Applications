
import java.util.*; 

class Arithmatic
{
    public int iValue;

    public Arithmatic(int i)
    {
        iValue = i;
    }

    public int Factorial()
    {

        int iCnt = 0;
        int iFact = 1;

        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }

}
class Program191
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter the number :");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic(iNo);
        iRet = aobj.Factorial();
        System.out.println("Factorial is : "+iRet);
    }
}