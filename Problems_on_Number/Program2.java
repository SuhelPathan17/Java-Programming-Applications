class Display
{
    public Display()
    {
        System.out.println("Inside Constructor");
    }

    public void fun()
    {
        System.out.println("Hello world");
    }
}

class Program2
{
    public static void main(String ar[])
    {
        Display dobj = new Display();
        dobj.fun();
    }
}