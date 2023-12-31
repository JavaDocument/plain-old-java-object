package com.gof.creational.builder.step01;

import java.time.LocalDate;

interface StudentBuilder {

    StudentBuilder name(String name);

    StudentBuilder age(int age);

    StudentBuilder gender(Gender gender);

    StudentBuilder grade(Grade grade);

    StudentBuilder birthday(LocalDate birthday);

    StudentBuilder phoneNumber(String phoneNumber);

    Student build();
}
