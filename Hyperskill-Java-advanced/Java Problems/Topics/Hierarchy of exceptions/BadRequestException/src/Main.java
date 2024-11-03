import java.io.IOException;

class BadRequestException extends IOException {
    public BadRequestException(String message) {
        super(message);
    }
}