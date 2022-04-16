package HomeWork7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public boolean decreaseFood(int n) {
        if (n >= food) {
            System.out.println("Еды не хватило! Котик голодный!!!");
            return false;
        }
        else {food -= n;
            System.out.println("Котик наелся и доволен. Мррр...");
            return true;
        }
    }

    public void info() {
        System.out.println("Еды на тарелке: " + food);
    }
    public void addFood(int a) {
        this.food += a;
    }
}