package com.epam.homework2.task4;

public class PasswordCompare {

    private final String password = "123456";

    public boolean isPasswordCorrect(String password) {
        return password.equals(this.password);
    }
}
