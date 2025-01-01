package ru.vlad.springcourse.models;

import javax.validation.constraints.*;

public class Person {
    private int id;

    @NotEmpty(message = "Name not by empty")
    @Size(min = 2, max = 30, message = "Name is long or short")
    private String name;

    @Min(value = 1, message = "Age can't be less than 0")
    @Max(value = 100, message = "Age can't be greater than 100")
    private int age;

    @NotEmpty(message = "Email not by empty")
    @Email(message = "Email should by valid")
    private String email;

    public Person(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Person() { }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}