public class main {

    public static void main(String[] args) {
        coffeeMachine coffeeMachine = new coffeeMachine();
        coffeeMachine.addCoffee(new kindsOfCoffee("Эспрессо", 35, 80, 90))
            .addCoffee(new kindsOfCoffee("Американо", 150, 85, 120))
            .addCoffee(new kindsOfCoffee("Капучино", 150, 70, 150))
            .addCoffee(new kindsOfCoffee("Латте", 300, 65, 160))
            .addCoffee(new kindsOfCoffee("Маккиато", 40, 65, 100))
            .addCoffee(new kindsOfCoffee("Раф", 125, 65, 120))
            .addCoffee(new kindsOfCoffee("Ирландский кофе", 300, 50, 180))
            .addCoffee(new kindsOfCoffee("Какао", 300, 65, 120))
            .addCoffee(new kindsOfCoffee("Чай", 300, 75, 100));

            System.out.println("---В нашем ассортименте:---");
            for (int i = 0; i < coffeeMachine.getList().size(); i++) {
                System.out.println(coffeeMachine.getList().get(i));
            }
            System.out.println("---Какой кофе Вас интересует?---");
            kindsOfCoffee found = coffeeMachine.findCoffee("Чай");
            kindsOfCoffee sold = coffeeMachine.selectCoffee(found);
            System.out.printf("Ваш выбор: %s, с Вас %d рублей\n", sold, coffeeMachine.getAmount());
            // System.out.println(coffeeMachine.getAmount());
            System.out.println("---В нашем ассортименте остались:---");
            for (int i = 0; i < coffeeMachine.getList().size(); i++) {
                System.out.println(coffeeMachine.getList().get(i));
            }
    }
}