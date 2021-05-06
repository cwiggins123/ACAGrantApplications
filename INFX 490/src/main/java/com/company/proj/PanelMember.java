package com.company.proj;
import javax.persistence.*;

@Entity
public class PanelMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;
    @Column
    public int memberId;

    public PanelMember(int memberId){
        this.memberId=memberId;
    }

    public PanelMember() {}

}
