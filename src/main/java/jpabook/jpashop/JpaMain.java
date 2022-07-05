package jpabook.jpashop;

import jpabook.jpashop.jpql.Member2;

import javax.persistence.*;
import java.util.List;

public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("start");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        tx.begin();
        try {

            //Member 생성
            Member2 member = new Member2();
            member.setUserName("user1");
            member.setAge(20);
            em.persist(member);

            //쿼리문 실행
            TypedQuery<Member2> query1 = em.createQuery("select m from Member2 m ", Member2.class);  //리턴 타입 명확O
            TypedQuery<String> query2 = em.createQuery("select m.userName from Member2 m where m.userName=:userName", String.class);  //리턴 타입 명확O
            Query query3 = em.createQuery("select m from Member2 m");   //리턴 타입 명확X

            //쿼리문 반환
            List<Member2> result1 = query1.getResultList(); //결과 하나 이상
            query2.setParameter("userName", "user1");
            String result2 = query2.getSingleResult(); //결과가 하나인 경우

            result1.stream().forEach( m -> System.out.println("result1 ::::"+m));
            System.out.println("result2 = " + result2);

            tx.commit();
        }catch (Exception e){
            tx.rollback();
        }finally {
            em.close();
        }
        emf.close();
    }
}
