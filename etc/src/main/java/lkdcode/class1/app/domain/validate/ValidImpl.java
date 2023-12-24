package lkdcode.class1.app.domain.validate;

public class ValidImpl implements Valid {
    @Override
    public boolean validNumber(String value) {
        try {
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
