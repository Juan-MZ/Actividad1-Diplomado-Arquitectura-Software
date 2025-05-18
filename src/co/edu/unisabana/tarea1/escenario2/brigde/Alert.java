package brigde;

public class Alert extends TipoNotification {

    private Platform platform;
    public Alert(Platform platform) {
        super(platform);
        this.platform = platform;
    }

    @Override
    public void showMessage(String message) {
        platform.showMessage(message);
    }
}
