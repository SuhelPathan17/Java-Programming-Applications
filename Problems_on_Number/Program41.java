import java.util.*;

class Arithmatic
{
    
    public Arithmatic()
    {

    }

    public void DisplayEvenFactors(int iNo)
    {
        int iCnt = 0;
        System.out.println("Even Factors are : ");

        for(iCnt = 1; iCnt <= (iNo/2); iCnt++)
        {
            if((iNo % iCnt == 0) && (iCnt % 2 == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program41
{
    public static void main(String ar[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter no.");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        aobj.DisplayEvenFactors(iNo);


    }
}