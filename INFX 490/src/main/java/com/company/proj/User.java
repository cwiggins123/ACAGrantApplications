package com.company.proj;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column
    public String firstname;
    @Column
    public String lastname;
    @Column
    public String phoneNumber;
    @Column
    public String address;
    @Column
    public String grantID;

    public User(String firstname, String lastname, String phoneNumber, String address, String grantID) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.grantID = grantID;
    }

    public User() {}

    // standard constructors / setters / getters / toString
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setGrantID(String grantID) {
        this.grantID = grantID;
    }

    public String getGrantID() {
        return this.grantID;
    }

}
