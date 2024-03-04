import Builders.BuilderSkirt;
import Command.*;

public class Extras {


//    private void case2Skirt() { //minförsa case2 med skirt
//        System.out.println("Designing skirt");
//        BuilderSkirt skirtBuilder = new BuilderSkirt();
//
//
//        System.out.println("\nChoose material, cotton or linnen");
//        String material = scanner.nextLine();
//        while (!material.equalsIgnoreCase("cotton") && !material.equalsIgnoreCase("linnen")) {
//            System.out.println("Material not available, choose cotton or linnen");
//            material = scanner.nextLine();
//        }
//        skirtBuilder.addMaterial(material);
//
//
//        System.out.println("\nChoose size s or l ");
//        String size = scanner.nextLine();
//        while (!size.equalsIgnoreCase("s") && !size.equalsIgnoreCase("l")) {
//            System.out.println("Size not available, choose s or l");
//            size = scanner.nextLine();
//        }
//        skirtBuilder.addSize(size);
//
//        System.out.println("\nChoose color, green or beige");
//        String color = scanner.nextLine();
//        while (!color.equalsIgnoreCase("green") && !color.equalsIgnoreCase("beige")) {
//            System.out.println("Color not available, choose green or beige");
//            color = scanner.nextLine();
//        }
//        skirtBuilder.addColor(color);
//
//
//        //test pattern-lenght of skirt
//        System.out.println("\nChoose pattern type for skirt. 1. Short, 2. Midi or 3. Long");
//        String pattern = scanner.nextLine();
//
//        DecoratorPipeline decoratorPipeline = new DecoratorPipeline();
//        decoratorPipeline.setClothing(skirtBuilder.getClothing());
//
//        while (!pattern.equalsIgnoreCase("1") && !pattern.equalsIgnoreCase("2") && !pattern.equalsIgnoreCase("3")) {
//            System.out.println("\nChoose pattern 1. Short, 2. Midi or 3. Long");
//            pattern = scanner.nextLine(); //todo ska forstätta här och  försäka få ihop min command
//        }
//        if (pattern.equalsIgnoreCase("1")) {
//            decoratorPipeline.addCommand(new CutShortCommand());
//            pattern = "Short";
//        } else if (pattern.equalsIgnoreCase("2")) {
//            decoratorPipeline.addCommand(new CutMediumCommand());
//            pattern = "Midi";
//        } else {
//            decoratorPipeline.addCommand(new CutLongCommand());
//            pattern = "Long";
//        }
//
//
//        System.out.println("\nChoose type of waist for skirt 1. Banded, 2. Bandless or 3. Pull on");
//        String waist = scanner.nextLine();
//
//        while (!waist.equals("1") && !waist.equals("2") && !waist.equals("3")) {
//            System.out.println("\nType only the number of the choose you want 1. Banded, 2. Bandless or 3. Pull on");
//            waist = scanner.nextLine();
//        }
//        if (waist.equals("1")) {
//            decoratorPipeline.addCommand(new SewOption1Command());
//            waist = "Banded";
//        } else if (waist.equals("2")) {
//            decoratorPipeline.addCommand(new SewOption2Command());
//            waist = "Bandless";
//        } else {
//            decoratorPipeline.addCommand(new SewOption3Command());
//            waist = "Pull on";
//        }
//
//        System.out.println("Do you want to add this skirt to your shopping-cart? " + "\n" +
//                "Material: " + material + "\n" +
//                "Color: " + color + "\n" +
//                "Size: " + size + "\n" +
//                "Pattern: " + pattern + "\n" +
//                "Waist: " + waist + "\n");
//
//        String answer = scanner.nextLine();
//
//        while (!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no")) {
//            System.out.println("enter yes or no");
//            answer = scanner.nextLine();
//        }
//        if (answer.equalsIgnoreCase("yes")) {
//            OrderService.getInstance().addProduct(skirtBuilder);
//            OrderService.getInstance().addPipeLine(decoratorPipeline);  //lägger till pipeline med commands till orderServicen
//            //skirtBuilder.build();
//            System.out.println("Skirt added to your cart");
//            System.out.println("Continue shopping or press 4 to place your order");
//        } else {
//            System.out.println("Skirt not added to your cart, returning to start menu");
//        }
//    }
}
