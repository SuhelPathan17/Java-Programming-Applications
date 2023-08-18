import java.util.*;

class Pattern
{
    public String Arr;

    public Pattern(String Brr)
    {
        Arr = Brr;
    }

    public void DisplayPattern()
    {        
        int i = 0;
        int j = 0;


        for(i = 0; i<Arr.length; i++)
        {
            for(j = 0; j<Arr.length; j++)
            {
                System.out.print(Arr.charAt(j)+"\t");
            }
            System.out.println();
        }
    }
}

class Program297
{
    public static void main(String ar[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string:");
        str = sobj.nextLine()

        Pattern pobj = new Pattern(str);
        pobj.DisplayPattern();
    }
}