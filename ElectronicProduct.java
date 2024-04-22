package array;


public class ElectronicProduct extends Product {
    private String brand;
    private int Period;
    public ElectronicProduct(int productId, String name, float price, String brand, int Period) {
        super(productId, name, price);
        this.brand = brand;
        this.Period = Math.abs(Period);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPeriod() {
        return Period;
    }

    public void setPeriod(int warrantyPeriod)
    {
        this.Period = Math.abs(Period);
    }
}
