package com.jareer.cleancode.domain;

import java.util.List;

public class Account {

    private int id;
    private String email;
    private String firstName;
    private List<String> middleName;
    private String surname;
    private int houseNumber;
    private String street;
    private String zipCode;
    private String city;

    public Account() {
    }

    public Account(int id, String email, String firstName, List<String> middleName, String surname, int houseNumber, String street, String zipCode, String city) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.middleName = Account.this.middleName;
        this.surname = surname;
        this.houseNumber = houseNumber;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<String> getMiddlname() {
        return middleName;
    }

    public void setMiddlname(List<String> middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName=" + middleName +
                ", surname='" + surname + '\'' +
                ", houseNumber=" + houseNumber +
                ", street='" + street + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
