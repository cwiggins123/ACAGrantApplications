package com.company.proj;

import javax.persistence.*;

@Entity
public class GrantsWithUsers extends Grant{
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
    @Column
    public int score1;
    @Column
    public int score2;
    @Column
    public int score3;
    @Column
    public int score4;
    @Column
    public int totscore;
    @Column
    public String memberId;

    public GrantsWithUsers() {
    }

    public void setFromGrant(Grant grant){
        this.grantID=grant.grantID;
        this.score1=grant.score1;
        this.score2=grant.score2;
        this.score3=grant.score3;
        this.score4=grant.score4;
        this.totscore=grant.totscore;
        this.memberId=grant.memberId;
    }

    public void setFromUser(User user){
        this.firstname=user.firstname;
        this.lastname=user.lastname;
        this.phoneNumber=user.phoneNumber;
        this.address=user.address;
    }

    public GrantsWithUsers(Grant grant, User user){
        setFromGrant(grant);
        setFromUser(user);
    }
}
