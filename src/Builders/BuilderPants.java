package Builders;

import BusinessObjects.Clothes.Pants;
import BusinessObjects.CEO;

public class BuilderPants implements ClothesBuilder {
    private Pants clothing = new Pants();
   // private Listener listener ;

    public BuilderPants() {
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
    public Pants build() {
        if (!clothing.getSize().equalsIgnoreCase("s") && !clothing.getSize().equalsIgnoreCase("l")) {
            throw new RuntimeException("Missing correct size");
        } else if (!clothing.getMaterial().equalsIgnoreCase("linnen") && !clothing.getMaterial().equalsIgnoreCase("cotton")) {
            throw new RuntimeException("Missing correct material");
        } else if (!clothing.getColor().equalsIgnoreCase("green") && !clothing.getColor().equalsIgnoreCase("beige")) {
            throw new RuntimeException("Missing correct color");
        } else {
          //  this.listener.setBuilding("Pants"); //anger nytt värde på min string i min listener
            getClothing().setId(idCount.incrementAndGet());
            return clothing;
        }
    }

    @Override
    public Pants getClothing() {
        return this.clothing;
    }
}

