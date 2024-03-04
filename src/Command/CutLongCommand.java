package Command;

import BusinessObjects.Clothes.Clothing;
import BusinessObjects.Clothes.Pants;
import BusinessObjects.Clothes.Skirt;
import BusinessObjects.Clothes.TShirt;

public class CutLongCommand implements  CommandInterface{
    @Override
    public Clothing decorate(Clothing clothing) {
        if (clothing instanceof Skirt) {
            ((Skirt) clothing).setPattern("Long");
        } else if (clothing instanceof Pants) {
            ((Pants) clothing).setLength("Long");
        } else {
            ((TShirt) clothing).setSleeves("Long");
        }
        System.out.println("Details for "+clothing.getClass().getSimpleName()+" has been cut");
        return clothing;
    }
}
