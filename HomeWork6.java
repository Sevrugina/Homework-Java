/**
 * JAVA.HomeWork6
 * 
 * @author Alla Sevrugina
 * @version 14.04.2022
 */

abstract class Animal {
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
 
//  Создать классы Собака и Кот с наследованием от класса Животное.

class Cat extends Animal {
    static int counter_cat;
    Cat(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
        counter_cat++;
        
    }
}

class Dog extends Animal {
    static int counter_dog;
    Dog(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
        counter_dog++;
    }
}

class Hamster extends Animal {
    static int counter_hamster;
    Hamster(int speed_limit, int swim_limit) {
        super(speed_limit, swim_limit);
        counter_hamster++;
    }
}


public class HomeWork6 {
    public static void main(String[] args) {
        
        Animal cat = new Cat(200, 0);
       
        System.out.println("Cat run " + cat.run(200) + " м");
        System.out.println("Cat swim " + cat.swim(3) + " м! Cat can't swim!");
        
        Animal dog = new Dog(500, 10);
        System.out.println("Dog run " + dog.run(200) + " м");
        System.out.println("Dog swim " + dog.swim(15) + " м");
        
        Animal hamster = new Hamster(1, 0);
        System.out.println("Hamster run " + hamster.run(1) + " м");
        System.out.println("Hamster swim " + hamster.swim(0) + " м! Hamster can't swim!");
        System.out.println("All animals  " + Cat.counter );
        System.out.println("All cats " + Cat.counter_cat + " All dogs " + Dog.counter_dog + " All hamsters " + Hamster.counter_hamster);
        
        
    }
}

