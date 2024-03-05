package BusinessObjects;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class CEO extends BusinessObjectClass implements PropertyChangeListener {

    private static CEO ceo;

    private CEO() {
    }

    public static CEO getInstance() {
        if (ceo == null) {
            ceo = new CEO();
            ceo.setName("Martijn Welles");
            ceo.setId(1);
        }
        return ceo;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.print("To CEO: ");
        if (evt.getPropertyName().equals("BuildingClothes")) {
            System.out.println("Producing " + evt.getNewValue());
        } else if (evt.getPropertyName().equals("DecoratingClothes")) {
            System.out.println(evt.getNewValue() + " ready");
        }
    }
}
