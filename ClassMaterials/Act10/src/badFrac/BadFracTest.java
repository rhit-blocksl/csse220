package badFrac;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BadFracTest {

    private Badfrac frac1  = new BadFrac(1,2);

    private BadFrac badFrac2 = new BadFrac(4, 0);

    private BadFrac badFrac3 = new BadFrac(1, 7);

    }
    public void isReduced() {
        assertFalse(frac1.isreduced);
        assertTrue(frac2.isreduced);
    }
    public void testAdd() {
        BadFrac add1 = new BadFrac();
        assertEquals(false, add1.add());

        BadFrac add2 = new BadFrac();
        assertEquals(false, add2.add());

        BadFrac add3 = new BadFrac();
        assertEquals(true, add3.add());
    }
    }