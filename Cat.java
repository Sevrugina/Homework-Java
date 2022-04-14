package HomeWork6;

class Cat extends Animal {
    public static int getCounter_cat() {
        return counter_cat;
    }

    public static void setCounter_cat(int counter_cat) {
        Cat.counter_cat = counter_cat;
    }

    static int counter_cat;


    Cat(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
        counter_cat++;

    }
}
