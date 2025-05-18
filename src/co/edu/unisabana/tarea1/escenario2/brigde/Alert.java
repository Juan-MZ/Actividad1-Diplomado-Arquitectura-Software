package brigde;

public class Alert extends TipoNotification {

    private IPlatform IPlatform;
    public Alert(IPlatform IPlatform) {
        super(IPlatform);
        this.IPlatform = IPlatform;
    }

    @Override
    public void showMessage(String message) {
        IPlatform.showMessage(message);
    }
}
