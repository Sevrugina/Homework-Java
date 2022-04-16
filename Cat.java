package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.full = false;

    }
    public void eat(Plate x) {
        this.full = x.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }
    public boolean getFull() {
        return full;
    }

}