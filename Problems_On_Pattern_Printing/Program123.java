import java.util.*;

class Pattern
{
    public int iRow;
    public int iCol;

    public Pattern(int r, int c)
    {
        iRow = r;
        iCol = c;
    }

    public void DisplayPattern()
    {        
        int i = 0;
        int j = 0;

        if(iRow < 0)
        {
            iRow = -iRow;
        }

        if(iCol < 0)
        {
            iCol = -iCol;
        }

        if(iRow != iCol)
        {
            return;
        }

        for(i = 1; i<=iRow; i++)
        {
            for(j = 1; j<=i; j++)
            {
             
                System.out.print("*\t");
           
            
            }
            System.out.println();
        }
    }
}

class Program123
{
    public static void main(String ar[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the row size:");
        iNo1 = sobj.nextInt();
        System.out.println("Enter the column size:");
        iNo2 = sobj.nextInt();

        Pattern pobj = new Pattern(iNo1,iNo2);
        pobj.DisplayPattern();
    }
}