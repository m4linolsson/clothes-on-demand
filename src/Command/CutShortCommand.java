package Command;

import BusinessObjects.Clothes.Clothing;
import BusinessObjects.Clothes.Pants;
import BusinessObjects.Clothes.Skirt;
import BusinessObjects.Clothes.TShirt;

public class CutShortCommand implements CommandInterface {


    @Override
    public Clothing decorate(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).setPattern("Short");
        } else if (clothing instanceof Pants) {
            ((Pants) clothing).setLength("Short");
        } else {
            ((TShirt) clothing).setSleeves("Short");
        }
        System.out.println("Details for "+clothing.getClass().getSimpleName()+" has been cut");
        return clothing;
    }
}
