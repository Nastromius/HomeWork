package Work2;

public class Computer extends Electronic {
    @Override
    public void Works() {
        System.out.println("Выполняет вычисления");
    }
    public void loadSystem(){
        System.out.println("Загрузка компьютера");
    }
}

