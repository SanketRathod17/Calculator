public class Calculator {
public int Add(String a)
{
    if(a.isEmpty())
        return 0;
    else
        return Integer.parseInt(a);
}
}
