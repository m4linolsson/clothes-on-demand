package Command;

import BusinessObjects.Clothes.Clothing;

public interface CommandInterface {

    Clothing decorate(Clothing clothing);

}
