package Builders;

import BusinessObjects.Clothes.Clothing;

import java.util.concurrent.atomic.AtomicInteger;

public interface ClothesBuilder {
    AtomicInteger idCount = new AtomicInteger(0);

    default ClothesBuilder addSize(String size) {
        return null;
    }


    default ClothesBuilder addMaterial(String material) {
        return null;
    }

    default ClothesBuilder addColor(String color) {
        return null;
    }


    default Clothing build() {
        return null;
    }

    default void setClothing(Clothing clothing) {
    }

    default Clothing getClothing() {
        return null;
    }


}
