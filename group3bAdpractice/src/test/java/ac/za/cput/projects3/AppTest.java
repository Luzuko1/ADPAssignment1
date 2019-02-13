package ac.za.cput.projects3;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */

    Calculate test = new Calculate();
    @Test
    public void add()
    {
        Assert.assertEquals(10,test.add(5,5));
    }

    @Test
    public void subtract()
    {
        Assert.assertEquals(0, test.subtract(5,5));
    }

    @Test
    public void multiply()
    {
        Assert.assertEquals(25,test.multiply(5,5));
    }

    @Test
    public void divide()
    {
        Assert.assertEquals(3,test.divide(15,5));
    }

    @Test
    public void modulus()
    {
        Assert.assertEquals(0, test.modulus(10,5));
    }

}
