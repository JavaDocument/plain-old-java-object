package lkdcode.class2.app.domain.service;

import lkdcode.class2.app.domain.member.Profile;

import java.util.List;
import java.util.Queue;

public final class ValidatorImpl implements Validator {
    private final String EMAIL_PATTERN = "@email.com";
    private final int MAX_LENGTH = 20;
    private final int MIN_LENGTH = 11;
    private final int MIN_SIZE = 1;
    private final int MAX_SIZE = 10000;

    @Override
    public boolean checkEmail(List<String> emailList) {
        return emailList.stream()
                .allMatch(email -> email.endsWith(EMAIL_PATTERN));
    }

    @Override
    public boolean checkEmailSize(List<String> emailList) {
        return emailList.stream()
                .allMatch(email -> email.length() >= MIN_LENGTH && email.length() < MAX_LENGTH);
    }

    @Override
    public boolean checkNickname(List<String> nicknameList) {
        return nicknameList.stream()
                .allMatch(nickname -> nickname.length() < MAX_LENGTH);
    }

    @Override
    public boolean checkSize(Queue<Profile> crewList) {
        return crewList.size() >= MIN_SIZE && crewList.size() <= MAX_SIZE;
    }

}
