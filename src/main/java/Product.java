

public class Product {
    private String name;
    private double price;
    public Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public void applyDiscount(int percent)
    {
        int n=(100-percent);
        price=price/100 * n;


    }
    public double getPrice()
    {
        return price;
    }

}