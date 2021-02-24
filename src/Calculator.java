public class Calculator
{
    public int Add(String a)
    {
        String carr[] = a.split(",");

        if (a.isEmpty())
        {
            return 0;
        }
        else if(carr.length==1)
        {
            return Integer.parseInt(a);
        }
        else {
            return (Integer.parseInt(carr[0])+Integer.parseInt(carr[1]));
             }

    }
}
