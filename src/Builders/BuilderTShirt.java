package Builders;

import BusinessObjects.Clothes.TShirt;
import BusinessObjects.CEO;

public class BuilderTShirt implements ClothesBuilder {
    private TShirt clothing = new TShirt();
//    private Listener listener;

    public BuilderTShirt() {
//        this.listener = new Listener();
//        this.listener.addPropertyChangeListener(CEO.getInstance());
    }

    @Override
    public ClothesBuilder addSize(String size) {
        clothing.setSize(size);
        return this;
    }

    @Override
    public ClothesBuilder addMaterial(String material) {
        clothing.setMaterial(material);
        return this;
    }

    @Override
    public ClothesBuilder addColor(String color) {
        clothing.setColor(color);
        return this;
    }

    @Override
    public TShirt build() {
        if (!clothing.getSize().equalsIgnoreCase("s") && !clothing.getSize().equalsIgnoreCase("l")) {
            throw new RuntimeException("Missing correct size");
        } else if (!clothing.getMaterial().equalsIgnoreCase("linnen") && !clothing.getMaterial().equalsIgnoreCase("cotton")) {
            throw new RuntimeException("Missing correct material");
        } else if (!clothing.getColor().equalsIgnoreCase("green") && !clothing.getColor().equalsIgnoreCase("beige")) {
            throw new RuntimeException("Missing correct color");
        } else {
          //  this.listener.setBuilding("TShirt"); //anger nytt värde på min string i min listener
            getClothing().setId(idCount.incrementAndGet());
            return clothing;
        }
    }

    @Override
    public TShirt getClothing() {
        return this.clothing;
    }
}
