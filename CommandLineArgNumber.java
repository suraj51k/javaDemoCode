    class CommandLineArgNumber
    {
        public static void main(String s[])
        {
            int z = s.length;
            int sum=0;

            for (int i=0; i<z; i++)
            {
                sum=sum+ Integer.parseInt(s[i]);
            }

            System.out.println("Sum of "+z+" numbers is "+sum);
        }
    }