package com.labassistantapi.payload.request;

import java.util.ArrayList;
import java.util.List;

public class SignupRequest {
    private String username;

    private String email;

    private String password;

    private List<String> calculations = new ArrayList<String>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getCalculations() {
        return calculations;
    }
    public void setCalculations(List<String> calculations) {
        this.calculations = calculations;
    }
}