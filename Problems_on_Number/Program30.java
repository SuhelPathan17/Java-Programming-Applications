
import java.util.*; 

class Arithmatic
{
    public int iFact;

    public Arithmatic()
    {
        iFact = 1;
    }

    public int Factorial(int iValue)
    {
        int iCnt = 0;
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            iFact = iFact * iCnt;
        }
        return iFact;
        
    }

}
class Program30
{
    public static void main(String ar[])
    {
        int iNo = 0;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        iRet = aobj.Factorial(iNo);
        System.out.println("Factorial is : "+iRet);
    }
}