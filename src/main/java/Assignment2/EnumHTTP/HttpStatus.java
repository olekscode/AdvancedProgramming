package Assignment2.EnumHTTP;

public enum HttpStatus {
    INFORMATIONAL(100, 199) {
        @Override
        public void handle() {
            handleWith(40);
        }
    },
    SUCCESS(200, 299) {
        @Override
        public void handle() {
            handleWith(52);
        }
    },
    REDIRECTION(300, 399) {
        @Override
        public void handle() {
            handleWith(38);
        }
    },
    CLIENT_ERROR(400, 499) {
        @Override
        public void handle() {
            handleWith(60);
        }
    },
    SERVER_ERROR(500, 599) {
        @Override
        public void handle() {
            handleWith(55);
        }
    };

    private final int minHttpCode;
    private final int maxHttpCode;

    HttpStatus(int minHttpCode, int maxHttpCode) {
        this.minHttpCode = minHttpCode;
        this.maxHttpCode = maxHttpCode;
    }

    public static HttpStatus findByHttpCode(int code) {
        HttpStatus[] statuses = values();

        for (HttpStatus status : statuses) {
            if ((code >= status.minHttpCode) && (code <= status.maxHttpCode)) {
                return status;
            }
        }
        throw new RuntimeException(code + " not supported");
    }

    public abstract void handle();

    void handleWith(int linesOfCode) {
        System.out.printf("%20s: %d lines of handling code executed\n", this.name(), linesOfCode);
    }
}
