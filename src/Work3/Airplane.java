package Work3;

public class Airplane implements Flight{

    private int countPassengers;

    public Airplane(int _countPassengers){
        try {
            if (_countPassengers > 0) {
                objectIsFlying();
            } else {
                throw new FlyException();
            }
        }catch (FlyException e) {
            System.out.println("Ошибка: пассажиров в самолете меньше 0");
        }
    }

    @Override
    public void objectIsFlying() {
        System.out.println("Самолёт летит");
    }
}
