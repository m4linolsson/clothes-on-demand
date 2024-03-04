package Command;

import BusinessObjects.Clothes.Clothing;
import BusinessObjects.Clothes.Pants;
import BusinessObjects.Clothes.Skirt;
import BusinessObjects.Clothes.TShirt;

public class SewOption1Command implements CommandInterface{
    @Override
    public Clothing decorate(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).setWaist("Banded waist");
        } else if (clothing instanceof Pants) {
            ((Pants) clothing).setFit("Slim fit");
        } else {
            ((TShirt) clothing).setNeck("V-neck");
        }
        System.out.println("Details for "+clothing.getClass().getSimpleName()+" has been sewn");
        return clothing;
    }
}
