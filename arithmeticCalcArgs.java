public class arithmeticCalcArgs {
    public static void main(String s[])
    {
        int z = s.length;
        
        if (z!=3)
        {
            System.out.println("Please enter in format op1 opr op2");
            return;
        }

        float ans=0;
        float op1 = Integer.parseInt(s[0]);
        float op2 = Integer.parseInt(s[2]);
        switch(s[1])
        {
            case "+":
            ans = op1+op2;
            break;
            
            case "-":
            ans = op1-op2;
            break;

            case "*":
            ans = op1*op2;
            break;

            case "/":
            ans = op1/op2;
            break;

            default:
            System.out.println("This operator is not suppoprted");
            return;
        }

        System.out.println(op1 + s[1] + op2 + " = " + ans);
    }
}
