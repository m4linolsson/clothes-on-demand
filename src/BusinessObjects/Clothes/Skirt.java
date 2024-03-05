package BusinessObjects.Clothes;

public class Skirt extends Clothing {

    private String waist; // syr till midja Banded, bandless, pull-on
    private String pattern; //Klipper till önskat mönster/längd... Short, Midi, long

    public Skirt() {
        setPrice(300);
        setName("Skirt");
    }

    @Override
    public void getDetails() {
        System.out.println("Skirt");
        System.out.println("Material: " + getMaterial() + "\n" +
                "Size: " + getSize() + "\n" +
                "Color: " + getColor() + "\n" +
                "Waist : " + getWaist() + "\n" +
                "Pattern: " + getPattern() + "\n" +
                "Price: " + getPrice() + "\n");
    }

    public String getWaist() {
        return waist;
    }

    public void setWaist(String waist) {
        this.waist = waist;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
