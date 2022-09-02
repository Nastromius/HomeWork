package Work2;

public class Electronic {

    public void On(boolean selector){
        if (selector){
            System.out.println("Работает");
        }
    }
    public void Off(boolean selector){
        if (selector == false){
            System.out.println("Не работает");
        }
    }

    public void Works(){

    }

}
