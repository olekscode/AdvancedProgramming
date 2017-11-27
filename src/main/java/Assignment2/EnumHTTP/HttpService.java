package Assignment2.EnumHTTP;

public class HttpService {
    public void handleHttpCode(int code) {
        HttpStatus httpCode = HttpStatus.findByHttpCode(code);
        httpCode.handle();
    }
}
