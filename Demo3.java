import java.io.*;

class Demo1
{
    public static void functionDemo1()
    {
        System.out.println("Good Morning :)");
    }
}

class Demo2
{
    public static void functionDemo2()
    {
        System.out.println("Good Afternoon :)");
    }
}

class Demo3
{
    public static void main(String s[])
    {
        Demo1.functionDemo1();
        Demo2.functionDemo2();
        Demo3.functionDemo3();
    }

    static void functionDemo3()
    {
        System.out.println("Good Night :)");
    }
}
