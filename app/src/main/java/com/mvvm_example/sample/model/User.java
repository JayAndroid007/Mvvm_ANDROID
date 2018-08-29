package com.mvvm_example.sample.model;

public class User {
    private String Email;
    private String Password;
    public String emailHint;
    public String passwordHint;

    public User(String emailHint, String passwordHint) {
        this.emailHint = emailHint;
        this.passwordHint = passwordHint;
    }
}
