import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.platform.commons.support.AnnotationSupport;
import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
        @Test
        public void ShoppingCartTest()
        {
            ShoppingCart s =  new ShoppingCart();
            Product p =new Product("BMV",4000);
            Product pr = new Product("Jaguar",3000);
            s.addProduct(p);
            s.addProduct(pr);
            assertEquals(7000,s.getTotalPrice());
        }
}
