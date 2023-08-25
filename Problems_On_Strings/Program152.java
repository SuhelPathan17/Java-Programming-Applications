import java.util.*;


class StringX
{
    public String s1;

    public StringX(String s)
    {
        s1 = s;
    }

    public String StrUprX()
    {
        int i = 0;
        char Arr[] = s1.toCharArray();
        for(i = 0; i<s1.length(); i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char)(Arr[i] - 32);
            }
        }
        String s2 = new String(Arr);
        return s2;
    }
}

class Program152
{
    public static void main(String arg[])
    {
        String str = null;
        String ret = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter full name");
        str = sobj.nextLine();

        StringX obj = new StringX(str);
        ret = obj.StrUprX();
        System.out.println("Modified string is : "+ret);
        
    }
}
