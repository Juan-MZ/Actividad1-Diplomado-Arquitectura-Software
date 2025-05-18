package brigde;

public abstract class TipoNotification {

    private Platform platform;

    public TipoNotification(Platform platform){
        this.platform = platform;
    }

    public abstract void showMessage(String message);

}
