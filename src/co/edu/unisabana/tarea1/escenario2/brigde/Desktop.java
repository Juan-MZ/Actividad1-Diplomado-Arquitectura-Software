package brigde;


public class Desktop implements IPlatform {
    @Override
    public void showMessage(String message) {
        System.out.println(String.format("[Desktop] Message %s", message));
    }
}
