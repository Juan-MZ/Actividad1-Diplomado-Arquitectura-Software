package brigde;

public class Warning extends TipoNotification {

    private IPlatform IPlatform;

    public Warning(IPlatform IPlatform) {
        super(IPlatform);
        this.IPlatform = IPlatform;
    }

    @Override
    public void showMessage(String message) {
        IPlatform.showMessage(message);
    }
}
