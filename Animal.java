package HomeWork6;

public abstract class Animal {
    static int counter;
    int speed_limit;
    int swim_limit;

    Animal(int speed_limit, int swim_limit) {
        this.speed_limit = speed_limit;
        this.swim_limit = swim_limit;
        counter++;
    }

    int run(int speed) {
        if (speed <= speed_limit) {
            return speed;
        }
        return speed_limit;
    }

    int swim(int distance) {
        if (distance <= swim_limit) {
            return distance;
        }
        return swim_limit;
    }
}
