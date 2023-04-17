public class kindsOfCoffee {
    public String getName() {
        return name;
    }

    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public Integer getCost() {
        return cost;
    }

    private String name;
    private Integer volume;
    private Integer temperature;
    private Integer cost;

    public kindsOfCoffee(String name, Integer volume, Integer temperature, Integer cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return String.format("- %s, объемом %d мл. (%d градусов), стоит %d руб.", name, volume, temperature, cost);
    }

}
