import java.util.*;

class Arithmatic
{
    
    public Arithmatic()
    {

    }

    public void DisplayOddFactors(int iNo)
    {
        int iCnt = 0;
        System.out.println("Odd Factors are : ");

        for(iCnt = 1; iCnt <= (iNo/2); iCnt=iCnt+2)
        {
            if((iNo % iCnt == 0))
            {
                System.out.println(iCnt);
            }
        }
    }
}

class Program45
{
    public static void main(String ar[])
    {
        int iNo = 0;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter no.");
        iNo = sobj.nextInt();

        Arithmatic aobj = new Arithmatic();
        aobj.DisplayOddFactors(iNo);


    }
}