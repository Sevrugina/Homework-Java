package HomeWork6;

public class Hamster extends Animal {
    static int counter_hamster;
    Hamster(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
        counter_hamster++;
    }
}
