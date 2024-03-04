package Command;

import BusinessObjects.Clothes.Clothing;
import BusinessObjects.Clothes.Pants;
import BusinessObjects.Clothes.Skirt;
import BusinessObjects.Clothes.TShirt;

public class SewOption3Command implements CommandInterface {
    @Override
    public Clothing decorate(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).setWaist("Pull on");
        } else if (clothing instanceof Pants) {
            ((Pants) clothing).setFit("Loose fit");
        } else {
            ((TShirt) clothing).setNeck("Polo");
        }
        System.out.println("Details for " + clothing.getClass().getSimpleName() + " has been sewn");
        return clothing;
    }
}
