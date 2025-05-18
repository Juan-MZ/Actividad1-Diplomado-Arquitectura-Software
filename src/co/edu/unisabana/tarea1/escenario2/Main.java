import brigde.Alert;
import brigde.Desktop;
import brigde.Message;
import brigde.Mobile;
import brigde.TipoNotification;
import brigde.Platform;
import brigde.Warning;
import brigde.Web;

public class Main {
    public static void main(String[] args) {

        Platform desktop = new Desktop();
        Platform mobile = new Mobile();
        Platform web = new Web();

        TipoNotification message = new Message(desktop);
        message.showMessage("new web");

        TipoNotification alert = new Alert(mobile);
        alert.showMessage("new alert");

        TipoNotification warning = new Warning(web);
        warning.showMessage("new warning");

    }
}