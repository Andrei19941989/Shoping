import org.junit.jupiter.api.Test;
import org.junit.platform.commons.support.AnnotationSupport;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    @Test
    public void testGetPrice()
    {
        Product p =  new Product("Audi",50000);
        assertEquals(50000,p.getPrice());
    }
    @Test
    public void applyDiscount()
    {
        Product p = new Product("Audi",1000);
        p.applyDiscount(10);
        assertEquals(900,p.getPrice());
    }
}
