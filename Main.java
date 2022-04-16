/**
 * JAVA.HomeWork7
 *
 * @author Alla Sevrugina
 * @version 16.04.2022
 */
package HomeWork7;

public class Main {
    public static void main(String[] args) {

            Cat[] cats =  {
                    new Cat("Кисун", 30),
                    new Cat("Белка", 40),
                    new Cat("Васька", 25),
                    new Cat("Рыжик", 5),
                    new Cat("Черныш", 30)
            };

            Plate plate = new Plate(50);           // изначально еда на тарелке

            for (int i=0; i<cats.length; i++) {
                System.out.println(cats[i].getName());  // имя кота
                plate.info();                           // всего еды на общей тарелке
                cats[i].eat(plate);                     // кот ест
                System.out.println(cats[i].getFull());  // true or false
            }
            plate.addFood(100);                      // добавление еды
            plate.info();
            plate.addFood(40);                       // добавление еды
            plate.info();
    }
}
