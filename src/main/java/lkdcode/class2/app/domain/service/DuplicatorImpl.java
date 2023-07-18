package lkdcode.class2.app.domain.service;

public final class DuplicatorImpl implements Duplicator {

    @Override
    public boolean isDuplicate(String value1, String value2) {
        return value1.equals(value2);
    }
}
