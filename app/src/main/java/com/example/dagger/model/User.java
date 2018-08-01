package com.example.dagger.model;

public class User {

    String name;
    String pwd;


    public User() {
      this.name="name";
      this.pwd ="pws";
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
