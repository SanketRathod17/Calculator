import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
public class CalculatorTest {
    Calculator cal;
    @BeforeTest
    void init()
    {
        cal=new Calculator();
    }

    @Test
    void EmptyString()
    {
        assertEquals(cal.Add(""),0);
    }

    @Test
    void OneNumber()
    {
        assertEquals(cal.Add("1"),1);
    }

    @Test
    void CommaSeparatedTwoNumbers()
    {
        assertEquals(cal.Add("1,2"),3);
    }

    @Test
    void NumberGreaterThan()
    {
        assertEquals(cal.Add("1,1001"),1);
    }

    @Test
    void ThreeNumbers(){
        assertEquals(cal.Add("1,2,3"),6);
    }

    @Test
    void differentDelimiters()
    {
        assertEquals(cal.Add("1/2/3"),6);
    }
}
