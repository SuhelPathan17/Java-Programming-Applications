
import java.util.*; 

class Arithmatic
{


    public Arithmatic()
    {

    }

    void DisplayTable(int iValue)
        {
            int iCnt = 0;
            System.out.println("----------------------------------\n");
            System.out.println("Table of "+iValue+" is as follows :\n");
            System.out.println("----------------------------------\n");
            for(iCnt = 1; iCnt <= 10; iCnt++)
            {
                System.out.println(iValue*iCnt);
            }
 
        }

}
class Program38
{
    public static void main(String ar[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter number : ");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        aobj.DisplayTable(iNo);
        
    }
}