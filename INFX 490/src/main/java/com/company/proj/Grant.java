package com.company.proj;
import javax.persistence.*;

@Entity
public class Grant {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
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

    public Grant(String grantID, int score1, int score2, int score3, int score4, String memberId){
    this.grantID=grantID;
    this.score1=score1;
    this.score2=score2;
    this.score3=score3;
    this.score4=score4;
    this.memberId=memberId;
    //automagically calculate total score, change this equation to what is needed
    this.totscore= (score1+score2+score3+score4);
    }

    public Grant(){}

}
