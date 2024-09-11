public class Variables
{
    int instanceVariable;
    static int staticVariable;

    public Variables(int instanceVar)
    {
        this.instanceVariable = instanceVar;
    }
    public static void displayStaticVariable()
    {
        System.out.println("Static Variable from static method: " + staticVariable);
    }
    public void displayVariables()
    {
        int localVariable = 25;
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);
    }
    public static void main(String[] args)
    {
        Variables.staticVariable = 33;
        Variables.displayStaticVariable();

        Variables obj = new Variables(51);
        obj.displayVariables();
    }
}