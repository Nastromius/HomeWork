package Work2;

public class Ram {
    private boolean wool = false;
    private String name;
    private boolean mass;


    public Ram(String name, boolean mass){
        this.name = name;
        this.mass = mass;
        }

    public void descriptionRam() {
        System.out.println("Имя животного: " + name);
        if (mass){
            System.out.println("Баран " + name + " упитанный");
        }else {
            System.out.println("Баран " + name + " худой");
        }
    }

    public void getWoolRam(){
        if (wool){
            System.out.println("Баран стрижен");
        }else {
            System.out.println("Баран не стрижен");
        }
    }
    public boolean setHaircutRam(boolean wool){
        return this.wool = wool;
    }
}

