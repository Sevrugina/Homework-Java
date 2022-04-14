package HomeWork6;

class Dog extends Animal {
    static int counter_dog;
    Dog(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
        counter_dog++;
    }
}
