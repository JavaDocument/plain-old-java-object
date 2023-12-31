package com.gof.creational.builder.step01;

import java.time.LocalDate;

class Main {

    public static void main(String[] args) {

        DefaultStudentBuilder builder = new DefaultStudentBuilder();

        Student student1 = builder.name("하루")
                .age(15)
                .gender(Gender.M)
                .grade(Grade.SENIOR)
                .birthday(LocalDate.of(2023, 9, 9))
                .phoneNumber("비밀")
                .build();

        Student student2 = builder.name("이율")
                .age(11)
                .gender(Gender.F)
                .grade(Grade.FRESH_MAN)
                .birthday(LocalDate.of(2011, 11, 11))
                .phoneNumber("010-0000-0000")
                .build();

        System.out.println(student1);
        System.out.println(student2);
    }
}
