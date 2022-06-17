package jpa;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
public class Member2 {

    @Id
    private Long id;

    @Column(name = "name")
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    //날짜 과거버전
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    //날짜 최신버전
    private LocalDate testDate;
    private LocalDateTime testDateTime;

    @Lob
    private String description;

    @Transient
    private String temp;

    public Member2(){

    }
}
