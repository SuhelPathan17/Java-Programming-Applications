
import java.util.*; 

class Arithmatic
{


    public Arithmatic()
    {

    }

    public void DisplayFactors(int iValue)
    {
        int iCnt = 0;
        System.out.println("Factors are :");
        for(iCnt = 1; iCnt <= (iValue/2); iCnt++)
        {
            if(iValue % iCnt == 0)
            {
                System.out.println(iCnt);
            }
        }
        
    }

}
class Program32
{
    public static void main(String ar[])
    {
        int iNo = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        aobj.DisplayFactors(iNo);
        
    }
}