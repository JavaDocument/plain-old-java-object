package jhlee.class5.problem1.app.dto.response;

public record ResponseDTO(String plainText) {
    @Override
    public String toString() {
        return plainText;
    }
}
