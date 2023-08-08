package jhlee.class5.problem1.app.service;

import jhlee.class5.problem1.app.dto.request.RequestDTO;
import jhlee.class5.problem1.app.dto.response.ResponseDTO;

public class Service {
    private Service() {
    }

    public static Service newInstance() {
        return new Service();
    }

    public ResponseDTO decrypt(RequestDTO dto) {
        StringBuilder decryptingText = new StringBuilder(dto.cryptogram());

        int i = 0;
        int j = 1;
        while (j < decryptingText.length()) {
            if (decryptingText.charAt(i) == decryptingText.charAt(j)) {
                decryptingText.delete(i, j + 1);
                if (i != 0) {
                    i--;
                    j--;
                }
            } else {
                i++;
                j++;
            }
        }

        return new ResponseDTO(decryptingText.toString());
    }
}
