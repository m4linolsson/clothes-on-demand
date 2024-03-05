package BusinessObjects.Clothes;

public class Pants extends Clothing {

    private String fit; //syr slim fit, regular, loose
    private String Length; //klipper short, capri, long

    public Pants() {
        setPrice(350);
        setName("Pants");
    }

    @Override
    public void getDetails() {
        System.out.println("Pants");
        System.out.println("Material: " + getMaterial() + "\n" +
                "Size: " + getSize() + "\n" +
                "Color: " + getColor() + "\n" +
                "Fit: " + getFit() + "\n" +
                "Length: " + getLength() + "\n" +
                "Price: " + getPrice() + "\n");
    }

    public String getFit() {
        return fit;
    }

    public void setFit(String fit) {
        this.fit = fit;
    }

    public String getLength() {
        return Length;
    }

    public void setLength(String length) {
        Length = length;
    }
}
