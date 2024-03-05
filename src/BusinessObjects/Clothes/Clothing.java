package BusinessObjects.Clothes;


import BusinessObjects.BusinessObjectClass;

public abstract class Clothing extends BusinessObjectClass {

    private double price;
    private String size; //s & l
    private String material; //Linen & cotton
    private String color; //Beige & green

    public Clothing() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void getDetails(){
    }

}
