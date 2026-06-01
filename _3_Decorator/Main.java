package _3_Decorator;

abstract class Coffee{
    abstract String getDescription();
    abstract int getPrice();
}
class SimpleCoffee extends Coffee{
    public String getDescription(){
       return"Simple Coffee includes: Coffee,";
    }

    public int getPrice(){
        return 100;
    }
}

abstract class CoffeeDecorator extends Coffee{
    protected Coffee coffee;

    CoffeeDecorator(Coffee coffee){
        this.coffee=coffee;
    }
}

class MilkDecorator extends CoffeeDecorator{
    MilkDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription()+" Milk";
    }

    public int getPrice(){
        return coffee.getPrice()+32;
    }
}

class WhippedCreamDecorator extends CoffeeDecorator{
    WhippedCreamDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription()+", WhippedCream";
    }

    public int getPrice(){
        return coffee.getPrice()+58;
    }
}

class ExtraSugarDecorator extends CoffeeDecorator{
    ExtraSugarDecorator(Coffee coffee){
        super(coffee);
    }

    public String getDescription(){
        return coffee.getDescription()+", Extra Sugar";
    }

    public int getPrice(){
        return coffee.getPrice()+10;
    }
}

public class Main {
    public static void main(String[] args) {
        Coffee coffee=new SimpleCoffee();
        coffee=new MilkDecorator(coffee);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Total: "+coffee.getPrice());
        coffee=new WhippedCreamDecorator(coffee);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Total: "+coffee.getPrice());
        System.out.println("------------------------------------------------------------------------------------");
        coffee=new ExtraSugarDecorator(coffee);
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Total: "+coffee.getPrice());
        System.out.println("------------------------------------------------------------------------------------");
    }
}
