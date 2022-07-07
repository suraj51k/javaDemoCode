//int k; // global variable

class GreetingText
{
    private String myText; // Member/Instance variable 

    public GreetingText()
    {
        myText = "Welcome to java!!";
    }

    public String GetMyText() // Member function
    {
        return myText;
    }

    public String GetMyText(String name) // Member function
    {
        return myText + " "+ name;
    }
};


class PrintMessage
{
    public static void main(String s[]) // input variable
    {
        int j; // local variable
        GreetingText greet = new GreetingText();
        System.out.println(greet.GetMyText());
    }
}


