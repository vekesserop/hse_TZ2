import junit.framework.TestCase;

public class Test extends TestCase {
    public void test_min() {
        assertEquals(8., Main._min(new double[] {8, 88, 176}));
        assertEquals(0., Main._min(new double[] {0, 5, 0, 10, 5, 15, 0}));
    }

    public void test_max() {
        assertEquals(176., Main._max(new double[] {8, 88, 176}));
        assertEquals(15., Main._max(new double[] {0, 5, 0, 10, 5, 15, 0}));
    }

    public void test_sum() {
        assertEquals(272., Main._sum(new double[] {8, 88, 176}));
        assertEquals(35., Main._sum(new double[] {0, 5, 0, 10, 5, 15, 0}));
    }

    public void test_mult() {
        assertEquals(123904., Main._mult(new double[] {8, 88, 176}));
        assertEquals(0., Main._mult(new double[] {0, 5, 0, 10, 5, 15, 0}));
    }
}
