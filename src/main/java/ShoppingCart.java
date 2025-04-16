import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products=new ArrayList<>();
    public void addProduct(Product p)
    {
        products.add(p);
    }
    public double getTotalPrice() {
        double y = 0;
        for (int i = 0; i < products.size(); i++) {
            y += products.get(i).getPrice();
        }
        return y;
    }
}
