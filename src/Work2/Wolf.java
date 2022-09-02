package Work2;

public class Wolf {
    private String color;
    private boolean heals = false;

    private String name;

    public Wolf(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void descriptionWolf() {
        System.out.println("Цвет животного: " + color);
        System.out.println("Имя животного: " + name);

    }

    public void getHealthWolf() {
        if (heals) {
            System.out.println("Животное здорово");
        } else {
            System.out.println("Животное болеет");
        }
    }

    public boolean setHealsWolf(boolean heals){
        return this.heals = heals;
    }
}
