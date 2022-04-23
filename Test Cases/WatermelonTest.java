import org.junit.Test;

import static org.junit.Assert.*;

public class WatermelonTest {

    @Test
    public void watermelonTest()
    {
        Watermelon melon=new Watermelon();
        assertEquals("No",melon.watermelonTest(7));
    }

    @Test
    public void watermelonTest2()
    {
        Watermelon melon=new Watermelon();
        assertEquals("Yes",melon.watermelonTest(12));
    }

    @Test
    public void watermelonTest3()
    {
        Watermelon melon=new Watermelon();
        assertEquals("Yes",melon.watermelonTest(4));
    }

    @Test
    public void watermelonTest4()
    {
        Watermelon melon=new Watermelon();
        assertEquals("No",melon.watermelonTest(2));
    }
}