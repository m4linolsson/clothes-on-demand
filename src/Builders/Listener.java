package Builders;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Listener {
    //En listener som skapas upp i de olika plaggbyggarna
    // Den kopplas till CEO som ligger och lyssnar, så varje gång
    //vi ändrar värdet på Strängen creatingClothes (vilket vi gör i build metoden) meddelas Lama.CEO
    private String creatingClothes;
    private String decoratingClothes;

    private PropertyChangeSupport propertyChangeSupport;

    public Listener() {
        this.propertyChangeSupport = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public String getCreatingClothes() {
        return creatingClothes;
    }

    public void setBuilding(String creatingClothes) {
        String oldValue = this.creatingClothes;
        this.creatingClothes = creatingClothes;
        this.propertyChangeSupport.firePropertyChange("BuildingClothes", oldValue, this.creatingClothes);
    }

    public void setDecorating(String decoratingClothes) {
        String oldValue = this.decoratingClothes;
        this.decoratingClothes = decoratingClothes;
        this.propertyChangeSupport.firePropertyChange("DecoratingClothes", oldValue, this.decoratingClothes);
    }
}
