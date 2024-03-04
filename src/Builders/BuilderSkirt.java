package Builders;

import BusinessObjects.Clothes.Skirt;
import BusinessObjects.CEO;

public class BuilderSkirt implements ClothesBuilder {
    private Skirt clothing = new Skirt();

//    private Listener listener;

    public BuilderSkirt() {
//        this.listener = new Listener();
//        listener.addPropertyChangeListener(CEO.getInstance());
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
    public Skirt build() {
        if (!clothing.getSize().equalsIgnoreCase("s") && !clothing.getSize().equalsIgnoreCase("l")) {
            throw new RuntimeException("Missing correct size");
        } else if (!clothing.getMaterial().equalsIgnoreCase("linnen") && !clothing.getMaterial().equalsIgnoreCase("cotton")) {
            throw new RuntimeException("Missing correct material");
        } else if (!clothing.getColor().equalsIgnoreCase("green") && !clothing.getColor().equalsIgnoreCase("beige")) {
            throw new RuntimeException("Missing correct color");
        } else {
            //  this.listener.setBuilding("Skirt");
            getClothing().setId(idCount.incrementAndGet());
            return clothing;
        }
    }

    @Override
    public Skirt getClothing() {
        return this.clothing;
    }


    @Override
    public String getSpecifics() {
        String specifics = "Skirt \n " +
                "Material: " + clothing.getMaterial() +
                "\n Size: " + clothing.getSize() +
                "\n Color: " + clothing.getColor() +
                "\n Color: " + clothing.getId();
        return specifics;
    }
}
