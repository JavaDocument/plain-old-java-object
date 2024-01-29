package com.gof.chap06.chain_of_responsibilty.step1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPrimeNumberTest {

    @Test
    void validPrimeNumberTest1() {
        final ValidPrimeNumber validPrimeNumber = new ValidPrimeNumber();
        assertFalse(validPrimeNumber.valid(9));
        assertFalse(validPrimeNumber.valid(1));
        assertFalse(validPrimeNumber.valid(0));
        assertFalse(validPrimeNumber.valid(12));
        assertFalse(validPrimeNumber.valid(99));
    }

    @Test
    void validPrimeNumberTest2() {
        final ValidPrimeNumber validPrimeNumber = new ValidPrimeNumber();
        assertTrue(validPrimeNumber.valid(2));
        assertTrue(validPrimeNumber.valid(3));
        assertTrue(validPrimeNumber.valid(5));
        assertTrue(validPrimeNumber.valid(7));
        assertTrue(validPrimeNumber.valid(97));
    }

}