package HomeWork5;

    // 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.

    public class Employee {
        private String name;
        private String post;
        private String email;
        private String phone;
        private int salary;
        private int age;

     // 2. Конструктор класса должен заполнять эти поля при создании объекта.

     public Employee(String name, String post, String email, String phone, int salary, int age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
     }

    public int getAge() {
    return age;
    }

    // 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void info() {
            System.out.println
                    ("name: " + name + ", post : " + post + ", Email : " + email + "," +

                            " phone : " + phone + ", salary " + salary + ", age" + age);
     }
    }

