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

    @Pattern(regexp = "[A-Z]\\w+, [A-Z]\\w+, \\d{6}", message = "Incorrect date format. " +
            "(Example: Russia, Moscow, 123456)")
    private String address;

    public Person(int id, String name, int age, String email, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.address = address;
    }

    public Person() { }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

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
