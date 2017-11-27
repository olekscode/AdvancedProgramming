package Assignment2.EnumHTTP;

public class Main {
    public static void main(String[] args) {
        HttpService service = new HttpService();

        for (int i = 0; i < 20; ++i) {
            service.handleHttpCode((int)(Math.random() * 400 + 100));
        }
    }
}
