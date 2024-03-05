package Shop;

import Builders.ClothesBuilder;
import BusinessObjects.Clothes.Clothing;
import Command.DecoratorPipeline;


import java.util.ArrayList;
import java.util.List;

public class OrderService {

    private List<ClothesBuilder> builders = new ArrayList<>(); //Lista med builders för att ha allt ifrån de innan plaggen är beställda och skapandet börjas
    private List<DecoratorPipeline> pipelines = new ArrayList<>(); //Lista med pipelines för att köra och dekorera kläderna efter beställningen lagts
    private List<Clothing> clothes = new ArrayList<>(); // Lista med kläder som skapas när ordern är lagd och kläderna är tillverkade. Används för kvittot
    private static OrderService orderService = null;

    private OrderService() {
    }

    public static OrderService getInstance() {
        if (orderService == null) {
            orderService = new OrderService();
        }
        return orderService;
    }


    public void addProduct(ClothesBuilder clothesBuilder) {
        builders.add(clothesBuilder);
    }

    public void addPipeLine(DecoratorPipeline pipeline) {
        pipelines.add(pipeline);
    }

    public void execute() {
        for (ClothesBuilder builder : builders) {
            builder.build();
        }

        for (DecoratorPipeline pipeline : pipelines) {
            clothes.add(pipeline.execute());  //lägger till klädesplagget i min lista med kläder samtidigt som jag dekorerar det
        }
    }

    public String getOrder() {
        int numberOfSkirts = 0;
        int numberOfPants = 0;
        int numberOfShirts = 0;

        for (ClothesBuilder builder : builders) {
            if (builder.getClothing().getClass().getSimpleName().equals("Pants")) {
                numberOfPants += 1;
            } else if (builder.getClothing().getClass().getSimpleName().equals("TShirt")) {
                numberOfShirts += 1;
            } else if (builder.getClothing().getClass().getSimpleName().equals("Skirt")) {
                numberOfSkirts += 1;
            }
        }

        String skirtsss = "";
        String tShirtsss = "";
        if (numberOfShirts != 1) {
            tShirtsss = "s";
        }
        if (numberOfSkirts != 1) {
            skirtsss = "s";
        }
        String order = numberOfPants + " pair of pants, " + numberOfShirts + " T-Shirt" + tShirtsss + " and " + numberOfSkirts + " skirt" + skirtsss;
        return order;
    }

    public double getSum() {
        double sum = 0;
        for (ClothesBuilder builder : builders) {
            sum += builder.getClothing().getPrice();
        }
        return sum;
    }


    public void emptyOrderService() {
        builders.clear();
        pipelines.clear();
        clothes.clear();
    }

    public List<ClothesBuilder> getBuilders() {
        return builders;
    }

    public void setBuilders(List<ClothesBuilder> builders) {
        this.builders = builders;
    }

    public List<Clothing> getClothes() {
        return clothes;
    }

    public void setClothes(List<Clothing> clothes) {
        this.clothes = clothes;
    }

    public List<DecoratorPipeline> getPipelines() {
        return pipelines;
    }

    public void setPipelines(List<DecoratorPipeline> pipelines) {
        this.pipelines = pipelines;
    }

}
