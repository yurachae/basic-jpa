package jpabook.jpashop.jpql;

import javax.persistence.*;

@Entity
public class Order2 {
    @Id @GeneratedValue
    private long id;
    private int orderAmount;

    @Embedded
    private Address2 Address2;

    //연관관계
    @ManyToOne
    @JoinColumn(name = "MEMBER2_ID")
    private Member2 member2;

    @ManyToOne
    @JoinColumn(name = "PRODUCT2_ID")
    private  Product2 product2;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(int orderAmount) {
        this.orderAmount = orderAmount;
    }

    public jpabook.jpashop.jpql.Address2 getAddress2() {
        return Address2;
    }

    public void setAddress2(jpabook.jpashop.jpql.Address2 address2) {
        Address2 = address2;
    }

    public Member2 getMember2() {
        return member2;
    }

    public void setMember2(Member2 member2) {
        this.member2 = member2;
    }

    public Product2 getProduct2() {
        return product2;
    }

    public void setProduct2(Product2 product2) {
        this.product2 = product2;
    }
}
