import java.util.*;

class Characters
{
    public char ch;

    public Characters(char c)
    {
        ch = c;
    }

    public boolean IsDigitX()
    {
        if(ch >= 48 && ch <= 57)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Program131
{
    public static void main(String arg[])
    {
        char cValue = '\0';
        boolean bRet = false;

        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter character");
        cValue = sobj.next().charAt(0);

        Characters cobj = new Characters(cValue);
        bRet = cobj.IsDigitX();
        if(bRet == true)
        {
            System.out.println("It is a Digit ");
        }
        else
        {
            System.out.println("It is not a Digit ");
        }
    }
}