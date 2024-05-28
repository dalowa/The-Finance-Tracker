package com.example.the_finance_tracker.utils;

public class User {
    private String name;
    private String password;

    public User(String name, String password){
        this.name = name;
        this.password = password;
    }

    public String getPassword(){
        return password;
    }

}
