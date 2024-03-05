package Command;

import Shop.Listener;
import BusinessObjects.Clothes.Clothing;
import BusinessObjects.CEO;
import java.util.ArrayList;
import java.util.List;

public class DecoratorPipeline {
    private List<CommandInterface> pipelineCommands = new ArrayList<>();
    private Clothing clothing = null;
    private Listener Listener = new Listener();

    public DecoratorPipeline() {
        Listener.addPropertyChangeListener(CEO.getInstance());
    }

    public void addCommand(CommandInterface command) {
        pipelineCommands.add(command);
    }

    public Clothing execute() {
        for (CommandInterface command : pipelineCommands) {
            clothing = command.decorate(clothing);
        }
        Listener.setDecorating(clothing.getClass().getSimpleName() + " id " + clothing.getId());  //När kläderna har dekorerats är de färdiga och CEO meddelas
        return clothing;
    }

    public Clothing getClothing() {
        return clothing;
    }
    public void setClothing(Clothing clothing) {
        this.clothing = clothing;
    }
}
