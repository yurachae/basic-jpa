package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class jpaMain {
    public static void main(String[] args) {
        //하나의 웹서버에 하나만 생성가능
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("start");

        //쓰레드간에 공유하지 말고 close!!!필수수
       EntityManager em = emf.createEntityManager();

        //여기에 코드 작성
        //항상 transaction begin 필요
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        try {
            //회원등록
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("memberA");
//            em.persist(member);//jpa 실행

            //회원조회
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println("name = " + findMember.getName());
//            System.out.println("id = " + findMember.getId());

            //회원삭제
//            em.remove(findMember);

            //회원수정
//            findMember.setName("memberB");

            //JPQL - 객체를 대상으로 쿼리!
            List<Member> result = em.createQuery("select m from Member m", Member.class)
                    .setFirstResult(1)  //페이징
                    .setMaxResults(10)  //페이징
                    .getResultList();
            for (Member member : result) {
                System.out.println("member = " + member.getId());
            }


            tx.commit(); //transaction 정상적으로 끝날 때 commit
        }catch (Exception e){
            tx.rollback();//transaction 비정상적으로 끝날 때 rollback
        }finally {
            em.close();//필수!!
        }
        emf.close();
    }
}
