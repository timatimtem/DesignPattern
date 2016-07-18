package FactoryExamplePIZZAFactory;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    public Pizza createPizza(String type) {

        if(type.equalsIgnoreCase("cheese")) {
            return new ChicagoStyleCheesePizza();
        }return null;
//        } else if(type.equalsIgnoreCase("pepperoni")){
//            return new ChicagoStylePepperoniPizza();
//        } else if(type.equalsIgnoreCase("clam")){
//            return new ChicagoStyleClamPizza();
//        } else if(type.equalsIgnoreCase("veggie")){
//            return new ChicagoStyleVeggiePizza();
//        }else return null;
    }
}