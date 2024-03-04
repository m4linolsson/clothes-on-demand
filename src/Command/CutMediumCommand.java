package Command;

import BusinessObjects.Clothes.Clothing;
import BusinessObjects.Clothes.Pants;
import BusinessObjects.Clothes.Skirt;
import BusinessObjects.Clothes.TShirt;

public class CutMediumCommand implements CommandInterface {

    @Override
    public Clothing decorate(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).setPattern("Midi");
        } else if (clothing instanceof Pants) {
            ((Pants) clothing).setLength("Capri");
        } else {
            ((TShirt) clothing).setSleeves("Bracelet sleeves");
        }
        System.out.println("Details for "+clothing.getClass().getSimpleName()+" has been cut");
        return clothing;

    }




}
