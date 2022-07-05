package jpabook.jpashop.jpql;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member2 {

    @Id @GeneratedValue
    private long id;
    private String userName;
    private int age;

    //연관관계
    @ManyToOne
    @JoinColumn(name = "TEAM2_ID")
    private Team2 team2;

    @OneToMany(mappedBy = "member2")
    private List<Order2> order2 = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Team2 getTeam2() {
        return team2;
    }

    public void setTeam2(Team2 team2) {
        this.team2 = team2;
    }

    public List<Order2> getOrder2() {
        return order2;
    }

    public void setOrder2(List<Order2> order2) {
        this.order2 = order2;
    }
}
