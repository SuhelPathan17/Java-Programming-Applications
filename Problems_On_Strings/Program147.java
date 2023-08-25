import java.util.*;


class StringX
{
    public char ch;

    public StringX(char c)
    {
        ch = c;
    }

    public char ToUpperX()
    {
        return (char)(ch - 32);
    }
}

class Program147
{
    public static void main(String arg[])
    {
        char cValue = '\0';
        char cRet = '\0';

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter Character");
        cValue = sobj.next().charAt(0);

        StringX obj = new StringX(cValue);
        cRet = obj.ToUpperX();

        System.out.println("Character in Upper case is : "+cRet);
        
    }
}
