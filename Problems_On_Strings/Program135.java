import java.util.*;


class Program135
{
    public static void main(String arg[])
    {
        String str = null;
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please enter full name");
        str = sobj.nextLine();

        char Arr[] = str.toCharArray();
        System.out.println("Length of string is : "+Arr.length); // property
    }
}
