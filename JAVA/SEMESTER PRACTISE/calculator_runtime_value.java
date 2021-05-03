class calculator_runtime
{
    public static void main(String args[])
    {
        int value1 = Integer.parseInt(args[0]);
        int value2 = Integer.parseInt(args[1]);
        String op = args[2];
        if(op.equals("+"))
        {
            System.out.println("sum is : "+(value1+value2));
        }
        else if(op.equals("-"))
        {
            System.out.println("subraction is : "+(value1-value2));
        }
        else if(op.equals("X"))
        {
            System.out.println("Mutliplication : "+(value2*value1));
        }
        else
        {
            if(value2==0)
            {
                System.out.println("cant divide with zero");
            }
            else
            {
                System.out.println("division : "+(value1/value2));
            }
        }
    }
}