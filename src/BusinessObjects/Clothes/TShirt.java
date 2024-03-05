package BusinessObjects.Clothes;

public class TShirt extends Clothing {

    private String neck; //syr v-neck, crew neck, buttoned
    private String sleeves; // klipper short, bracelet, long

    public TShirt() {
        setPrice(200);
        setName("TShirt");
    }

    @Override
    public void getDetails() {
        System.out.println("T-shirt");
        System.out.println("Material: " + getMaterial() + "\n" +
                "Size: " + getSize() + "\n" +
                "Color: " + getColor() + "\n" +
                "Neck : " + getNeck() + "\n" +
                "Sleeves: " + getSleeves() + "\n" +
                "Price: " + getPrice() + "\n");
    }

    public String getSleeves() {
        return sleeves;
    }

    public void setSleeves(String sleeves) {
        this.sleeves = sleeves;
    }

    public String getNeck() {
        return neck;
    }

    public void setNeck(String neck) {
        this.neck = neck;
    }
}
