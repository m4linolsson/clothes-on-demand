package Command;

import BusinessObjects.Clothes.Clothing;
import BusinessObjects.Clothes.Pants;
import BusinessObjects.Clothes.Skirt;
import BusinessObjects.Clothes.TShirt;

public class SewOption2Command implements CommandInterface{
    @Override
    public Clothing decorate(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).setWaist("Bandless waist");
        } else if (clothing instanceof Pants) {
            ((Pants) clothing).setFit("Regular fit");
        } else {
            ((TShirt) clothing).setNeck("U-neck");
        }
        System.out.println("Details for "+clothing.getClass().getSimpleName()+" has been sewn");
        return clothing;

    }
}
