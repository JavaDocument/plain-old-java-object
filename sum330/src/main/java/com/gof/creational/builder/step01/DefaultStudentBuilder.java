package com.gof.creational.builder.step01;

import java.time.LocalDate;

class DefaultStudentBuilder implements StudentBuilder {

    private String name;
    private int age;
    private Gender gender;
    private Grade grade;
    private LocalDate birthday;
    private String phoneNumber;

    @Override
    public StudentBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public StudentBuilder age(int age) {
        this.age = age;
        return this;
    }

    @Override
    public StudentBuilder gender(Gender gender) {
        this.gender = gender;
        return this;
    }

    @Override
    public StudentBuilder grade(Grade grade) {
        this.grade = grade;
        return this;
    }

    @Override
    public StudentBuilder birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @Override
    public StudentBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public Student build() {
        return new Student(name, age, gender, grade, birthday, phoneNumber);
    }
}
