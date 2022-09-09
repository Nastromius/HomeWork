package Work3;

public class Duck implements Flight{
    private boolean isInjured;

    public Duck(boolean _isInjured){
        try {
            if (_isInjured){
                throw new FlyException();
            }else {
                objectIsFlying();
            }
        }catch (FlyException e) {
            System.out.println("Ошибка: утка ранена");
        }
    }

    @Override
    public void objectIsFlying() {
        System.out.println("Утка летит");
    }
}
