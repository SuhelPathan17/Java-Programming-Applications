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
        if((ch >= 'a') && (ch <= 'z'))
        {
            return (char)(ch-32);
        }
        else
        {
            return (char)ch;
        }
    }
}

class Program148
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
