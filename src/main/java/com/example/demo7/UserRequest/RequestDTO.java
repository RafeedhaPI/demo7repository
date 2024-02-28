package com.example.demo7.UserRequest;

public class RequestDTO {
    private Long Id;

    private String Name;
    private String phoneNumber;
    private String AlternateContact;

    // Getters and Setters


    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAlternateContact(String alternateContact) {
        AlternateContact = alternateContact;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAlternateContact() {
        return AlternateContact;
    }
}
