package lkdcode.class2.app.domain.service;

public sealed interface Duplicator permits DuplicatorImpl {

    boolean isDuplicate();

}
