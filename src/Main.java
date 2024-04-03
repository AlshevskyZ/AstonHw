import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        class Employee {// задание 1
            private String fio;
            private String position;
            private String email;
            private String phoneNumber;
            private double salary;
            private int age;

            public Employee(String fio, String position, String email, String phoneNumber, double salary, int age) {
                this.fio = fio;
                this.position = position;
                this.email = email;
                this.phoneNumber = phoneNumber;
                this.salary = salary;
                this.age = age;
            }

            public void showInfo() {
                System.out.println("ФИО: " + fio);
                System.out.println("Должность: " + position);
                System.out.println("Email: " + email);
                System.out.println("Телефон: " + phoneNumber);
                System.out.println("Зарплата: " + salary);
                System.out.println("Возраст: " + age);
                System.out.println();
            }
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Employee[] employees = new Employee[5];//залание 2
        employees[0] = new Employee("Петрова Мария Сергеевна", "Разработчик Java",
                "maria.petrova@example.com", "+79111111111", 70000, 25);
        employees[1] = new Employee("Сидоров Николай Петрович", "Менеджер по продажам",
                "nikolay.sidorov@example.com", "+79222222222", 80000, 32);
        employees[2] = new Employee("Кузнецова Ольга Владимировна", "Бухгалтер",
                "olga.kuznetsova@example.com", "+79333333333", 60000, 40);
        employees[3] = new Employee("Иванов Андрей Дмитриевич", "Дизайнер",
                "andrey.ivanov@example.com", "+79444444444", 55000, 28);
        employees[4] = new Employee("Егорова Ирина Анатольевна", "Директор",
                "irina.egorova@example.com", "+79555555555", 100000, 45);
        for(Employee emp : employees)
        {
            emp.showInfo();
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
         class Park {// задание 3
            private String name;
            private List<Attraction> attractions;

            public Park(String name) {
                this.name = name;
                attractions = new ArrayList<>();
            }

            public void addAttraction(Attraction attraction) {
                attractions.add(attraction);
            }

            public void printAttractions() {
                for (Attraction attraction : attractions) {
                    System.out.println("Название: " + attraction.getName());
                    System.out.println("Время работы: " + attraction.getWorkingHours());
                    System.out.println("Стоимость: " + attraction.getPrice());
                    System.out.println();
                }
            }

            public static class Attraction {
                private String name;
                private String workingHours;
                private double price;
                public Attraction(String name, String workingHours, double price) {
                    this.name = name;
                    this.workingHours = workingHours;
                    this.price = price;
                }

                public String getName() {
                    return name;
                }

                public String getWorkingHours() {
                    return workingHours;
                }

                public double getPrice() {
                    return price;
                }
            }
        }
        Park parkGorkogo = new Park("Парк Горького");
        parkGorkogo.addAttraction(new Park.Attraction("Колесо обозрения", "10:00-22:00", 300));
        parkGorkogo.addAttraction(new Park.Attraction("Американские горки", "12:00-20:00", 400));
        parkGorkogo.addAttraction(new Park.Attraction("Карусель", "10:00-20:00", 200));
        parkGorkogo.printAttractions();
    }
}
