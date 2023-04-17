import java.util.ArrayList;
import java.util.List;

public class coffeeMachine {
    List<kindsOfCoffee> list = new ArrayList<>();

    public coffeeMachine addCoffee(kindsOfCoffee coffee){
        list.add(coffee);
        return this;
    }

    public List<kindsOfCoffee> getList() {
        return list;
    }

    private int amount = 0;

    public int getAmount(){
        return amount;
    }

    public kindsOfCoffee findCoffee(String string){
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)) {
                return getList().get(i);
            }
        }
        return null;
    }

    public kindsOfCoffee selectCoffee(kindsOfCoffee coffee){
        try {
            kindsOfCoffee coffeeSelected = findCoffee(coffee.getName());
            getList().remove(coffeeSelected);
            amount += coffeeSelected.getCost();
            return coffeeSelected;

        } catch (Exception except) {
            throw new RuntimeException("Увы, такого кофе нет");
        }
    }
}
