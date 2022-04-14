package HomeWork6;

public class Main {

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

            System.out.println("All animals  " + Animal.counter );
            System.out.println("All cats " + Cat.counter_cat + " All" +
                    " dogs " + Dog.counter_dog + " All hamsters " + Hamster.counter_hamster);


    }
}

