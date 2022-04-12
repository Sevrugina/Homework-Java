package HomeWork5;
import HomeWork5.Employee;
public class Main {

    public static void main(String[] args) {

        // 4. Создать массив из 5 сотрудников.

        Employee[] arrPerson = new Employee[5];
        arrPerson[0] = new Employee("Ivanov", "director", "A@mail.ru", "11-11-11", 1000,52);
        arrPerson[1] = new Employee("Petrov", "accountant", "B@mail.ru", "22-22-22", 800,45);
        arrPerson[2] = new Employee("Volkov", "QA engineer", "C@mail.ru", "33-33-33", 500, 35);
        arrPerson[3] = new Employee("Sidorov", "worker", "D@mail.ru", "44-44-44", 300, 40);
        arrPerson[4] = new Employee("Karpov", "admin", "D@mail.ru", "55-55-55", 700, 38);

        // 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        for (int j = 0; j < arrPerson.length; j++) {
            if (arrPerson[j].getAge() >= 40)
                arrPerson[j].info();
        }
    }
}
