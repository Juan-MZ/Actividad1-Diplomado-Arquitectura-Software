package brigde;

public abstract class TipoNotification {

    private IPlatform IPlatform;

    public TipoNotification(IPlatform IPlatform){
        this.IPlatform = IPlatform;
    }

    public abstract void showMessage(String message);

}
