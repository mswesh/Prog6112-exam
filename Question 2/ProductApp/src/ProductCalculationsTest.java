import org.junit.Test;
import static org.junit.Assert.*;

public class ProductCalculationsTest {

    @Test
    public void testGetVat() {
        ProductCalculations calc = new ProductCalculations(3500);
        assertEquals(525.0, calc.GetVat(), 0.01);
    }

    @Test
    public void testGetCommission() {
        ProductCalculations calc = new ProductCalculations(3500);
        assertEquals(175.0, calc.GetCommission(), 0.01);
    }

    @Test
    public void testGetTotal() {
        ProductCalculations calc = new ProductCalculations(3500);
        assertEquals(4200.0, calc.GetTotal(), 0.01);
    }

    public static void main(String[] args) {
        org.junit.runner.JUnitCore.main("ProductCalculationsTest");
    }
    }