package com.mvvm_example.sample.viewModel;


import android.databinding.BaseObservable;

import com.mvvm_example.sample.R;
import com.mvvm_example.sample.model.User;

public class UserModel extends BaseObservable {
    private String Email;
    private String Password;
    private String emailHint;
    private String passwordHint;

    public UserModel(User userSample) {

        this.emailHint=userSample.emailHint;
        this.passwordHint=userSample.passwordHint;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
        notifyPropertyChanged(R.id.email_id);
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
        notifyPropertyChanged(R.id.password_id);
    }

    public String getEmailHint() {
        return emailHint;
    }

    public void setEmailHint(String emailHint) {
        this.emailHint = emailHint;
    }

    public String getPasswordHint() {
        return passwordHint;
    }

    public void setPasswordHint(String passwordHint) {
        this.passwordHint = passwordHint;
    }
}
