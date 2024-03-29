package com.example.kinandcartachallenge.data.model;

import java.io.Serializable;

public class Contact implements Serializable {
    private String name;
    private String id;
    private String companyName;
    private Boolean isFavorite;
    private String smallImageURL;
    private String largeImageURL;
    private String emailAddress;
    private String birthdate;
    private Phone phone;
    private Address address;

    public Contact(String name, String id, String companyName, Boolean isFavorite, String smallImageURL, String largeImageURL, String emailAddress, String birthdate, Phone phone, Address address) {
        this.name = name;
        this.id = id;
        this.companyName = companyName;
        this.isFavorite = isFavorite;
        this.smallImageURL = smallImageURL;
        this.largeImageURL = largeImageURL;
        this.emailAddress = emailAddress;
        this.birthdate = birthdate;
        this.phone = phone;
        this.address = address;
    }

    public Contact() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Boolean getFavorite() {
        return isFavorite;
    }

    public void setFavorite(Boolean favorite) {
        isFavorite = favorite;
    }

    public String getSmallImageURL() {
        return smallImageURL;
    }

    public void setSmallImageURL(String smallImageURL) {
        this.smallImageURL = smallImageURL;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public void setLargeImageURL(String largeImageURL) {
        this.largeImageURL = largeImageURL;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
