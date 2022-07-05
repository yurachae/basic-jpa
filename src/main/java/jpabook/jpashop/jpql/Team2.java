package jpabook.jpashop.jpql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Team2 {
    @Id @GeneratedValue
    private long id;
    private String name;

    //연관관계
    @OneToMany(mappedBy = "team2")
    private List<Member2> members2 = new ArrayList<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Member2> getMembers2() {
        return members2;
    }

    public void setMembers2(List<Member2> members2) {
        this.members2 = members2;
    }
}
