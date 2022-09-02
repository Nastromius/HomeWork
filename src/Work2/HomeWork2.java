package Work2;

// Задание №1
// Создать два класса, которые описывают какое либо животное (каждый имеет минимум два атрибута).
// Написать к ним конструктор, сеттеры, геттеры.

// Задание №2
// Создать следующие классы
// 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
// подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)
// 2. Computer (имеет метод loadSystem - выводит в консоль сообщение "загрузка компьютера")
// 3. LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
// Метод work у компьютера выводит в консоль - выполняет вычисления.
//Подумать какие классы и методы являются абстрактными, к каким методам нужна надпись @Override

//Задание №3
//Создать класс Circle с атрибутом - radius
//Создать класс BigCircle - который не принимает атрибутов, но создает круг с размером 10.


public class HomeWork2 {
    public static void main(String[] args) {
        {
            Wolf wolf = new Wolf("Серый", "Людовик");
            wolf.descriptionWolf();
            wolf.getHealthWolf();
            wolf.setHealsWolf(true);
            wolf.getHealthWolf();

            System.out.println();

            Ram ram = new Ram("Борис", true);
            ram.descriptionRam();
            ram.getWoolRam();
            ram.setHaircutRam(true);
            ram.getWoolRam();
        }

        System.out.println();

        {
            Electronic electronic = new Electronic();
            electronic.On(true);
            electronic.Off(false);

            Computer computer = new Computer();
            computer.loadSystem();
            computer.Works();

            LenovoComputer lenovoComputer = new LenovoComputer();
            lenovoComputer.loadSystem();
        }

        System.out.println();

        {
            Circle circle = new Circle();
            circle.newCircle(8);
            new BigCircle();
        }
    }
}
