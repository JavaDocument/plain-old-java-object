package jhlee.class3.app.dto.response;

public class PlayResultResponseDTO {

    private final int[] pobiNumbers;
    private final int[] crongNumbers;
    private final int result;

    private PlayResultResponseDTO(int[] pobiNumbers,
                       int[] crongNumbers,
                       int result) {
        this.pobiNumbers = pobiNumbers;
        this.crongNumbers = crongNumbers;
        this.result = result;
    }

    public static PlayResultResponseDTO of(int[] pobiNumbers,
                                int[] crongNumbers,
                                int result) {
        return new PlayResultResponseDTO(pobiNumbers, crongNumbers, result);
    }

    @Override
    public String toString() {
        return "[" + pobiNumbers[0] + ", " + pobiNumbers[1] + "]," +
                " [" + crongNumbers[0] + ", " + crongNumbers[1] + "]," +
                " " + result;
    }

}
