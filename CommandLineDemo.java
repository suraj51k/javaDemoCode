public class CommandLineDemo {
    public static void main(String d[])
    {
        int len = d.length;
        System.out.println("Command line args are:");

        for(int i=0; i<len; i++)
        {
            System.out.print(d[i] + "  ");
        }
    }
}
